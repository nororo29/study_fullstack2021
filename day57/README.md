## Day57

1. Model1 패턴에서 웹브라우저와 웹서버의 통신과정
2. Model2 패턴에서 웹브라우저와 웹서버의 통신과정
3. Spring MVC 패턴에서 웹브라우저와 웹서버의 통신과정

<br>

# Model1 패턴에서 웹브라우저와 웹서버의 통신과정
1. 클라이언트 웹브라우저에서 `http://~/xxx.jsp` 형태의 URL 주소로 웹서버에 접속한다.
2. 웹서버가 HttpServletRequest, HttpServletResponse, HttpSession 객체를 생성한다. (재접속 시 HttpSession 객체는 새로 생성 안됨)
3. 웹서버에서 URL 주소에 있는 xxx.jsp 파일을 호출하여 DB연동, Cookie 객체 생성 등을 한다.
4. xxx.jsp 파일 호출 실행 결과인 HTML 소스, HttpServletResponse가 소유한 Cookie 객체, 자원의 호출 성공 여부, 재접속 여부 등을 응답메시지에 저장한다.
5. 웹서버가 웹브라우저에게 응답메시지를 전송한다.
6. 클라이언트 웹브라우저에서 HTML 소스가 렌더링되어 화면에 출력된다.

<br>

# Model2 패턴에서 웹브라우저와 웹서버의 통신과정
1. 클라이언트 웹브라우저에서 `http://~/xxx.do` 형태의 가짜 자원명을 포함한 URL 주소로 웹서버에 접속한다.
2. 웹서버가 HttpServletRequest, HttpServletResponse, HttpSession 객체를 생성한다. (재접속 시 HttpSession 객체는 새로 생성 안됨)
3. 웹서버가 Servlet 객체의 `doGet(HttpServletRequest request, HttpServletResponse response)` 또는 `doPost(HttpServletRequest request, HttpServletResponse response)` 메소드를 호출한다.
4. JavaBean의 메소드가 호출되어 DB연동을 하고 결과물을 HttpServletRequest 객체 또는 HttpSession 객체에 저장하고, 클라이언트에게 보낼 Cookie 객체를 HttpServletResponse 객체에 저장한다.
5. JavaBean의 메소드가 리턴한 xxx.jsp 파일을 찾아 HttpServletRequest 객체 또는 HttpSession 객체에서 DB연동 결과물을 꺼내 문자열(자바or커스텀태그, EL)로 표현한다.
6. 웹서버가 응답메시지를 준비한다.
7. 웹서버가 웹브라우저에게 응답메시지를 전송한다.
8. 클라이언트 웹브라우저에서 HTML 소스가 렌더링되어 화면에 출력된다.

<br>


 <hr> 
 
 ### 클라이언트
 ### ↓      ↑ 
 ### 웹서버
 ### ↓      ↑ 
 ### Servlet객체
 ### ↓      ↑ 
 ### JavaBean (DB연동)
 
 <hr> 

<br>

# Spring MVC 패턴에서 웹브라우저와 웹서버의 통신과정
1. 클라이언트 웹브라우저에서 `http://~/xxx.do` 형태의 가짜 자원명을 포함한 URL 주소로 웹서버에 접속한다.
2. 웹서버가 HttpServletRequest, HttpServletResponse, HttpSession 객체를 생성한다. (재접속 시 HttpSession 객체는 새로 생성 안됨)
3. 웹서버가 Spring이 제공하는 DispatcherServlet 객체에 접속한다.
4. @Controller 붙은 객체의 @RequestMapping("/xxx.do") 붙은 메소드 호출한다.
    - @Service와 @Transactional 붙은 객체의 메소드 호출
    - @Repository 붙은 객체의 메소드 호출
    - SqlSessionTemplate 객체의 메소드 호출
    - Connection, ResultSet, PreparedStatement (JDBC 객체) -> Oracle DB 연동 결과 리턴
5. 얻은 DB 결과물과 JSP 페이지명(xxx.jsp)을 ModelAndView 객체에 저장하고, 클라이언트에게 보낼 Cookie 객체를 HttpServletResponse 객체에 저장한다.
6. ModelAndView 객체에 저장된 JSP 페이지명(xxx.jsp)에 해당하는 xxx.jsp 파일을 찾아 HttpServletRequest 객체 또는 HttpSession 객체에서 DB연동 결과물을 꺼내 문자열(자바or커스텀태그, EL)로 표현한다.
7. 웹서버가 응답메시지를 준비한다.
8. 웹서버가 웹브라우저에게 응답메시지를 전송한다.
9. 클라이언트 웹브라우저에서 HTML 소스가 렌더링되어 화면에 출력된다.

<br>

 <hr>   
 
 ### 클라이언트 
 ### ↓      ↑  
 ### 웹서버  
 ### ↓      ↑  
 ### DispatcherServlet객체
 ### ↓      ↑  
 ### @Controller객체 (JSP파일명, DB연동 결과물 저장된 ModelAndView 객체 리턴)   
 ### ↓      ↑  
 ### @Service,@Transactional객체 (트랜잭션처리)   
 ### ↓      ↑  
 ### @Repository객체  
 ### ↓      ↑  
 ### SqlSessionTemplate객체  
 ### ↓      ↑  
 ### JDBC객체 OracleDB (DB연동) 
 
 <hr> 

<br>
