## Day56

1. HttpServletRequest 객채
2. HttpServletResponse 객체
3. HttpSession 객체

<br>

# 요청메시지를 관리하는 HttpServletRequest 객채

## 📌 메소드
- String **getParameter**(파라미터명) : 파라미터값을 String형으로 리턴한다.
- String[] **getParameterValues**(파라미터명) : 주로 체크박스의 파라미터값들을 String 배열로 리턴한다.
- void **setAttribute**("키값", 저장객체) : DB연동 결과물을 HashMap처럼 저장객체에 ("키값", 결과물) 쌍으로 저장한다.
- Object **getAttribute**("키값") : 저장객체에서 "키값"에 맞는 결과물을 Object형으로 리턴한다. 없으면 null 리턴한다.
- void **removeAttribute**("키값") : 저장객체에서 "키값"에 맞는 ("키값",결과물) 쌍을 삭제한다.
- HttpSession **getSession**() : HttpSession 객체의 주소값을 리턴한다.
- Cookie[] **getCookies**() : Cookie객체가 저장된 배열 객체를 리턴한다.
- StringBuffer **getRequestURL**() : 요청메시지 안에 저장된 URL 전체 주소를 리턴한다.
- String **getRequestURI**() : 요청메시지 안에 저장된 URL 주소 중 포트번호 이후의 주소를 리턴한다.
- String **getContextPath**() : 웹서버의 루트명을 리턴한다.
- String **getServerName**() : 웹서버의 도메인명을 리턴한다.
- String **getRemoteAddr**() : 웹서버에 접속한 클라이언트의 IP주소를 리턴한다.
- int **getServerPort**() : 웹서버가 사용하는 포트번호를 리턴한다.
- void **setCharacterEncoding**("문자셋") : 클라이언트가 전송한 파라미터값의 인코딩방식을 설정한다.

<br>

# 응답메시지를 관리하는 HttpServletResponse 객채

## 📌 메소드
- void **sendRedirect**(URL) : 클라이언트 웹브라우저에게 지정한 URL 페이지로 이동을 요청한다.
- void **addCookie**(Cookie cookie) : Cookie 객체가 소유한 쿠키명, 쿠키값을 응답메시지에 저장한다.
- void **setContentType**(type) : 응답메시지에 저장할 HTML소스의 문서종류, 문자셋을 지정한다.

<br>

# 웹브라우저와 웹서버의 연결상태를 관리하는 HttpSession 객채
웹브라우저와 웹서버의 연결상태를 세션(Session)이라고 한다.

<br>

## 📌 세션(Session)의 원리
1. 클라이언트가 웹브라우저를 실행한 후, URL을 통해 웹서버로 접속한다.
2. 웹서버가 HttpSession 객체를 생성한다. (HttpSession 객체는 고유 아이디를 가지고 있다.)
3. 웹서버가 HttpSession 객체의 고유 아이디를 쿠키로 저장해 응답메시지에 넣은 후 이를 전송한다.
4. 웹브라우저가 응답메시지를 받고 고유 아이디가 저장된 쿠키를 꺼내 메모리 공간에 저장한다.
----
- 클라이언트가 웹브라우저에서 다시 URL을 통해 요청메시지를 가지로 웹서버로 재접속한다.
  - 요청메시지에 고유 아이디를 가진 쿠키가 들어있다.
    - 웹서버는 요청메시지 안의 고유 아이디를 꺼내 이 고유 아이디를 가진 HttpSession 객체를 찾아 대응시킨다.
      - HttpSession 객체가 있으면, 저장된 데이터를 꺼낸다.
      - HttpSession 객체가 없거나, 수명이 다해 제거되었다면, 2번으로 다시 돌아간다.
  - 요청메시지에 고유 아이디를 가진 쿠키가 들어있지 않다면, 2번으로 다시 돌아간다.

----
- 원래 쿠키값은 파일로 저장되는데, 고유 아이디가 저장된 쿠키는 웹브라우저의 메모리 공간에 저장된다.
- 메모리 공간에 저장되면, 웹브라우저가 종료될 때 쿠키값도 삭제된다.

<br>

## 📌 메소드
- void **setAttribute**("키값", 저장객체) : 주로 재접속 시 사용할 데이터를 저장할 때 호출한다. ex. `session.setAttribute("login_id", "abc");`
- Object **getAttribute**("키값") : setAttribute 로 저장된 객체를 리턴한다.
- void **removeAttribute**("키값") : setAttribute 로 저장된 객체를 삭제한다.
- void **setMaxInactiveInterval**(int second) : 클라이언트의 재접속이 없을 때, HttpSession 객체의 수명을 초 단위로 설정한다.(기본값 30분)
- String **getId**() : HttpSession 객체에 부여된 고유 아이디를 리턴한다.
