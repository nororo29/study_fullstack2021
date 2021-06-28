## Day33
2021.06.28
 
- 인라인뷰
  - FROM 절에 나오는 select문
  - ROWNUM이 1부터 순차적으로 읽는 환경에서 사용 가능
  - ROWNUM 자리에 1이 들어가서 false 나오는 where 조건이 있다면 조건이 성립하지 않는다.

- ROWNUM
  - SELECT 순서대로 행 번호를 부여해주는 가상 컬럼
  - ORDER BY 가 있을 경우, 정렬되기 전에 ROWNUM이 붙어짐.

- 페이징처리
  - ROWNUM 값에 별칭을 부여해 새로운 컬럼으로 만들고 외부에서 별칭을 이용해 페이징처리한다.
  ```
  SELECT *
  FROM (SELECT ROWNUM RNUM, e.*
        FROM (SELECT *   -- 원하는 조건이 있는 쿼리문
              FROM EMPLOYEE
              ORDER BY salary DESC) e
        WHERE ROWNUM <= 10)   -- 끝 행
  WHERE RNUM >= 5  -- 시작 행
  ```
  - between 사용은 속도가 느림
  ```
  SELECT *
  FROM (SELECT ROWNUM RNUM, e.*
        FROM (SELECT *
              FROM EMPLOYEE
              ORDER BY salary DESC) e
        )
  WHERE RNUM BETWEEN 11 AND 15;  -- 가독성은 좋으나 속도 느림
  ```
  
- 인라인뷰와 UNION
  - 월별로 입사월, 인원수 검색 (조건, 입사월 순서로 출력)
    - 해당 월에 입사원 없으면 출력안됨
    ```
    SELECT TO_CHAR(hire_date, 'mm'), COUNT(*)
    FROM EMPLOYEE a
    GROUP BY TO_CHAR(hire_date, 'mm')
    ORDER BY 1;
    ```
    - 입사한 사람 없는 달도 포함해서 출력 : union사용
    ```
    SELECT m.month||'월', COUNT(e.emp_no)
    FROM (
          SELECT '01' MONTH FROM dual 
          UNION  SELECT '02' FROM dual 
          UNION  SELECT '03' FROM dual 
          UNION  SELECT '04' FROM dual 
          UNION  SELECT '05' FROM dual 
          UNION  SELECT '06' FROM dual 
          UNION  SELECT '07' FROM dual 
          UNION  SELECT '08' FROM dual 
          UNION  SELECT '09' FROM dual 
          UNION  SELECT '10' FROM dual 
          UNION  SELECT '11' FROM dual 
          UNION  SELECT '12' FROM dual
    ) m, employee e
    WHERE TO_CHAR(e.hire_date(+), 'mm') = m.month
    GROUP BY m.month
    ORDER BY 1;
    ```
    
