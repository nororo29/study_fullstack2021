## Day27
2021.06.18

- and/or : and 먼저 계산됨 -> 괄호 사용하기

- 날짜 관련 함수
  - MONTHS_BETWEEN( date1, date2 ) : 개월수(숫자형)
  - ADD_MONTHS( date, 개월수) : 날짜형
  - LAST_DAY( date ) : 날짜형
  - NEXT_DAY( date, 요일숫자-일1~토7 ) : 돌아오는 요일의 날짜형
  - ROUND( n, m ) / TRUNC( n, m ) : 소수 m번째 자리까지 반올림 / 버림


- IN( A, B ) : = 와 or 
- ANY( A, B ) : 비교연산자 필요!!

- A이상 B이하 : 컬럼 between A and B : 
- A이상 B미만 : (컬럼 between A and B) and 컬럼 <> B  => 영역이 딱 정해지는 장점이 있다.

- LIKE : %, _
- LIKE / NOT LIKE

- length(문자형)
