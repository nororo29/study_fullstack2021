## Day56

1. HttpServletRequest 객채
2. HttpServletResponse 객체
3. HttpSession 객체

<br>

## 요청메시지를 관리하는 HttpServletRequest 객채

### 메소드
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

## 응답메시지를 관리하는 HttpServletResponse 객채

### 메소드
- void sendRedirect(URL) :
- void addCookie(Cookie cookie) : 
- void setContentType(type) :

<br>

## 웹브라우저와 웹서버의 연결상태를 관리하는 HttpSession 객채

