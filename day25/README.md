## Day25
2021.06.16

- 그룹함수 : min / max / avg / sum / count
- 문자함수 : substr
- null값 처리 함수 : nvl / nvl2
- 형변환함수 : to_char(날짜,숫자->문자) / to_date(문자->날짜) / to_number(문자->숫자)
- 숫자함수 : round / ceil / floor / trunc

- case-end / decode

- 가상테이블 dual

- 날짜 + 정수 : 날짜
- 날짜 - 날짜 : 일수


#### 예제
- 나이순 구하기 (2000년대생 이후 고려)
  - 오늘날짜_년도 - 주민번호(7번째수 1,2이면 19년대 / 3,4면 20년대)_년도 + 1
  - to_number(to_char(sysdate, 'yyyy'))
  - to_number(decode/case문 || substr(주민번호, 1, 2))
  - `decode(컬럼명, '1', '19', '2', '19', '20')` 
  - `case when ~ in('1', '2') then '19' else '20' end`
- 근무년차 구하기
  - ceil((현재날짜 - hire_date) / 365)
- 연령대 구하기
  - trunc(나이 / 10) || '0대'
- 다가올생일 / 다음생일까지 남은 일수
