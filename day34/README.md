## Day34
2021.06.29

#### 뷰(view)
- 실시간으로 select 결과물을 테이블처럼 가장해서 보여주는 가상 테이블
- 특징
  - 객체이다 (이름을 가진 객체)
  - 테이블이다 (select의 대상이 된다)
  - 기본테이블과 뷰는 항상 동기화된다. (기본 테이블 데이터 변경 <=> 뷰 데이터 변경)
  - 뷰를 가지고 또 다르 뷰를 만들 수 있다.
- 목적
  - 보안성 : 특정 컬럼 보여주고 싶지 않을 때
  - 편의성 : 길고 복잡한 select문 뷰로 만들어 테이블처럼 사용
- 뷰 생성
  ```
  CREATE VIEW employee_vw1
  AS
  SELECT emp_no, emp_name, dep_no, jikup, hire_date
  FROM employee
  ```
- 뷰를 통해 DML(INSERT, DELETE, UPDATE) 하기
  - 뷰를 통해 DML(INSERT, DELETE, UPDATE)문으로 기본 테이블의 내용을 변결할 수 있다.
  - INSERT/UPDATE 가능한 상황 : [자료형], [제약조건], [길이]가 맞을 때
  - DELETE 주의 : 그 행을 다른 테이블에서 참조하고 있지 않은 경우만 가능
  ```
  -- INSERT
  INSERT INTO employee_vw1 (emp_no, emp_name, dep_no, jikup, hire_date, jumin_num, phone, mgr_emp_no)
  VALUES(
        ( SELECT NVL(MAX(emp_no), 0) + 1 FROM employee_vw1 )   -- emp_no
        , '이승엽'
        , 40
        , '과장'
        , TO_DATE('1990-09-01', 'yyyy-mm-dd')
        , '7811231452719'
        , '01090056376'
        , 1
  );
  
  -- UPDATE
  UPDATE employee_vw1 SET jikup='부장' WHERE JUMIN_NUM='7811231452719' AND emp_name='이승엽';
  
  -- DELETE
  DELETE FROM employee_vw1 WHERE jumin_num='7811231452719';
  ```
- 뷰 삭제
  ```
  DROP VIEW employee_vw1;
  ```
- 뷰 옵션
  `CREATE [OR REPLACE] [FORCE | NOFORCE] VIEW 뷰이름 AS SELECT문장 [WITH READ ONLY] [WITH CHECK OPTION]`
  - OR REPLACE
    - 이미 존재하는 뷰 있으면 덮어쓰기 기능
  - FORCE
    - 기본 테이블의 존재 유무와 상관없이 뷰를 생성
  - NOFORCE
    - 반드시 기본 테이블이 존재할 경우에만 뷰를 생성 (디폴트)
  - WITH READ ONLY
    - 해당 뷰를 통해 select만 가능, insert/update/delete 할 수 없음
  - WITH CHECK OPTION
    - 해당 뷰를 통해서 볼 수 있는 범위 내에서만 insert/update 가능
  
  
- UPDATE
  - 
