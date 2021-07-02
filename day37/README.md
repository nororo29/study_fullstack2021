## Day37
2021.07.02

### 파일 경로 지정 방법 (상황에 따라 선택)
- 절대 경로  
   / : 루트(root)  
   ./ : 현재 위치  
   ../ : 현재 위치의 상단 폴더  

- 상대 경로  
   . : 현재 웹페이지가 소속된 폴더  
   .. : 현재 웹페이지의 부모 폴더  

- 웹 서버에서 파일경로 읽기...

### 문단정리 태그

	- <br> 			// 줄 바꿈
	- <hr> 			// 수평선 출력
	- <pre>...</pre> 	// 문자열 그대로 출력(공백, 줄바꿈 그대로)
	- <p> 			// 한 행을 비울 때 , 연달아 써도 1행만 인정됨

### 글자관련 태그

	<h~>...</h~> 			// display속성: block(한행 독차지)
	<i>...</i>, <em>...</em> 	// 이탤릭체
	
	<b>...</b>
	<strong>...</strong>

	
### 특수문자 태그

	&nbsp;    // 공백1개
	&lt;	  // <
	&gt;	  // >
	&quot; 	  // "
	&amp;	  // &
	&copy;	  // ©


### 링크 태그<a></a>의 용도

	- 페이지 이동
		- target속성 : 어느 화면에서 페이지 열지...
		- <a href="xxx.html" target="_blank">..</a>

	- 같은 문서내 특정위치 이동(북마크)
		- <a href="#같은화면 내 이동할 위치명">..</a>
		- <a href="#">..</a> : 무조건 화면 상단으로 이동

	- 파일 다운로드
		- 파일 다운로드 대화상자 => 확인버튼 => 다운로드
		- 웹에서 열리는 파일은 새 화면 열리고 실행됨 (ex. 이미지파일, txt파일)
		- <a href="다운로드파일명">문자열</a>

	- 이미지 출력
		- 이미지만 있는 화면으로 이동
		- <a href="이미지파일명">문자열</a>

	- 음악, 동영상 실행
		- 설치되어 있는 프로그램으로 파일 재생
		- <a href="동영상파일명">문자열</a>

	- 자바스크립트 코드 실행**
		- <a href="javascript:자바스크립트코드">문자열</a>
		- ex. <a href="javascript:if(confirm('버튼선택하기')){ alert('햄버거'); } else{ alert('취소버튼'); }">ddd</a>


### 이벤트
- 웹브라우저에서 발생하는 모든 움직임
- 이벤트가 발생할 때 Javascript 코드 실행됨
	- load / unload 
	- click / dbclick 
	- mouseover / mouseout / mousedown / mousedragged 
	- keydown / keyup / keypress 
	- focus 
	- blur 
	- change**


### div 태그
- 그룹화 => [겹쳐놓기], [펼쳐놓기], [감춰놓기]
- block 형식

- style 속성
	- position: 
		- static(default, 코딩순서대로) | relative(부모태그 기준, 코딩위치를 0,0으로 놓고,,,) | absolute(왼쪽상단을 0,0으로 놓고 x축, y축으로 이동)
	- left / top  (position: relative | absolute 일 때, 사용가능)
	- padding 내부 여백 (상->우->하->좌     시계방향)
		- padding-top / padding-right / padding-bottom / padding-left
	- width / height
	- border
	- backgroud-color
	- z-index
	- visibility: visible | hidden(공간 차지);
	- display: block | none(공간 사라짐);

### table 태그
- 행과 열로 표시하는 태그 (컨텐츠의 배치)
- 행 : `<tr>...</tr>` 
- 열 : `<td>...</td>` | `<th>...</th>`
- 표제목 : `<caption>...</caption>`
-----------------------------------------------------------------------------------------------------------------------------
	<table>
		<caption>표제목</caption>
		<thead>
			<tr><th>해더1</th><th>헤더2</th>~<th>헤더m</th></tr>
		</thead>
		<tbody>
			<tr><td>데이터11</td><td>데이터12</td>~~~<td>데이터1m</td></tr>
			<tr><td>데이터21</td><td>데이터22</td>~~~<td>데이터2m</td></tr>
			<tr><td>데이터31</td><td>데이터32</td>~~~<td>데이터3m</td></tr>
			.....
			<tr><td>데이터n1</td><td>데이터n2</td>~~~<td>데이터nm</td></tr>
		</tbody>
	</table>
-----------------------------------------------------------------------------------------------------------------------------
	=> <thead></thead>, <tbody></tbody> jQuery에서 컨트롤할 때 유리


