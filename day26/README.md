## Day26
2021.06.17

- order by
  - decode문 / case문

- to_char
  - DAY, DY
  - 'nls_date_language=english'
  - AM | PM
  - HH / MI / SS
  - HH24
  - Q : 1~4분기
  - to_char(date형, 'yyyy"년" mm"월" ')  -> ""써서 패턴에 한글 넣기
  - to_char(number형, '999,999,999')  : 숫자형 패턴에 맞게 출력

- 오라클 숫자함수
  - abs
  - floor / ceil / round / trunc
  - sign : 부호..반환
  - mod
  - power

- 오라클 문자함수
  - chr : 숫자를 아스키문자로 반환
  - upper / lower
  - length
  - substr
  - trim
