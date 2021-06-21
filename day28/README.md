## Day28
2021.06.21

- inner join
  - inner join : where문 = 연산자
  - ANSI inner join : A join B on ~
  - natural join : 컬럼명 같으면 다 비교..

- 3개이상 테이블 조인
  - where문에 조건 and로 이어 적기
  - (A join B on ~) join C on ~...

- self join

- outer join
  - (+) 사용
  - ANSI outer join : A left outer join B on ~

---

- outer join - 메인테이블(customer)에 의해 딸려나오는 컬럼 모두 (+)붙인다. 
  => 그래야 null값으로라도 나옴
```
SELECT cus_no, cus_name, tel_num, emp_name, jikup
FROM customer c, employee e
WHERE c.emp_no = e.emp_no(+)
			AND dep_no(+) = 10;
```

- ANSI outer join - where문이 아닌 on문에 조건 쓰기
```
SELECT cus_no, cus_name, tel_num, emp_name, jikup
FROM customer c LEFT OUTER JOIN employee e
ON c.emp_no = e.emp_no
		AND dep_no = 10;  -- where에 들어가면 안됨!! on에 쓰기
```

---
- (+)붙이는 곳 주의!!
```
SELECT cus_no, cus_name, tel_num, emp_name, jikup, sal_grade_no
FROM customer c, employee e, salary_grade s
WHERE c.emp_no = e.emp_no(+)
			AND ( e.salary BETWEEN s.min_salary(+) AND s.max_salary(+) );
			-- employee입장에서 메인테이블은 customer -> employee컬럼에 (+)붙이기
			-- salary_grade입장에서 메인테이블은 employee!!!!  -> salary_grade컬럼에 (+)붙이기!!
      

-- ANSI
SELECT cus_no, cus_name, tel_num, emp_name, jikup, sal_grade_no
FROM ( customer c LEFT OUTER JOIN employee e ON c.emp_no=e.emp_no)
			LEFT OUTER JOIN salary_grade s ON e.salary BETWEEN s.min_salary AND s.max_salary
```
