## Day31
2021.06.24

- 부서별 부서번호, 부서명, 직원수(count(e.emp_no)), 관리고객수 검색(count(c.emp_no))
  - 서브쿼리 사용
  - 조인 사용 : outer join => 소속된 직원이 없는 부서도 나와야 함
  - distinct : e.emp_no에서 관리고객이 2명 이상인 직원은 중복된다 중복제거할 때 사용함

```
--● 서브쿼리 사용
SELECT
	  d.dep_no
		, d.dep_name
		, COUNT(e1.emp_no)  AS 직원수
		, (SELECT COUNT(e2.emp_no) FROM employee e2, customer c WHERE c.emp_no=e2.emp_no AND e2.dep_no=d.dep_no)  AS 관리고객수
FROM employee e1 RIGHT OUTER JOIN dept d ON e1.dep_no=d.dep_no
GROUP BY d.dep_no, d.dep_name
ORDER BY 1


--● 조인만  : outer join으로!!!! 소속된 직원이 없는 부서도 나와야하고 /
SELECT
	  d.dep_no
		, d.dep_name
		, COUNT(e.emp_no)  AS 직원수    -- 중복됨 : 한 직원이 여러 고객 담당할 때
		, COUNT(c.emp_no) AS 관리고객수  -- 고객의 emp_no는 중복제거하면안됨 => 고객수를 구하기 위해
FROM employee e , dept d, customer c
WHERE e.dep_no(+)=d.dep_no AND e.emp_no=c.emp_no(+)
GROUP BY d.dep_no, d.dep_name
ORDER BY 1


SELECT *
FROM employee e , dept d, customer c
WHERE e.dep_no(+)=d.dep_no AND e.emp_no=c.emp_no(+)
ORDER BY e.emp_no


--● distinct로 중복제거
SELECT
	  d.dep_no
		, d.dep_name
		, COUNT(DISTINCT e.emp_no)  AS 직원수
		, COUNT(c.emp_no) 	AS 관리고객수
FROM employee e , dept d , customer c
WHERE e.dep_no(+)=d.dep_no AND e.emp_no=c.emp_no(+)
GROUP BY d.dep_no, d.dep_name
ORDER BY 1
```
