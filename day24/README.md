## Day24
2021.06.15

- 시퀀스
  - 오류나서 못들어가는 행 있을 때 번호표만 증가함 -> PK번호가 구멍남...
  - 대신 nvl함수 사용 : select nvl(max(emp_no), 0) + 1 from employee
- select문
  - || : *select salary||'만원' from employee*
  - as 별칭(alias) : (as생략) 직원명 / "직원명" / as 직원명 / as "직원명"
  - distinct / unique
  - where
    - 비교연산자 : =, <, >, <=, >=, !=, <>, ^=
    - 논리연산자 : and, or, not
    - between A and B / not between A and B
    - in(A, B, C...) / not in(A, B, C...)
    - like - %, _
    - is null / is not null
  - order by
    - asc / desc
    - decode(컬럼명, 값1, 1, 값2, 2, ...) [asc/desc]  : 컬럼값 대신 숫자 주기
