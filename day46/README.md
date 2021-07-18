## Day46
2021.07.16

## ✔ DOM 객체

- HTML에서 [태그]를 관리하는 객체
- 웹브라우저가 HTML 파일 안의 태그들을 읽어 [객체]를 생성하고, [객체]에 대응하는 [컨텐츠]를 [웹브라우저 화면]으로 출력한다.

### ▶ Form 객체
- Form 태그를 관리하는 객체

- 속성변수
  - action : 입력 데이터를 보낼 웹 서버 URL주소
  - method : get(입력 데이터가 URL주소 뒤에 붙어 전달), post(입력 데이터가 안보이게 전달)
  - enctype : `enctype=multipart/form-data`, 파일을 서버로 전달할 때 사용
  - target : 응답을 받을 창이 어디인지
- 메소드
  - submit() : action속성변수 안의 URL주소로 전달
  - reset() : 입력된 데이터 초기값으로 변경

### ▶ Text 객체
- `<input type="text" ~>` 태그를 관리하는 객체

- 속성변수
  - value : 입력된 데이터
  - defaultValue : 디폴트 값
- 메소드
  - focus() : [문자입력상자] 안에 커서를 들여 놓는다
  - blur() : [문자입력상자] 안에 커서를 뺀다.
  - select() : [문자입력상자] 안을 드래그 하여 입력 내용을 선택하도록 한다.

### ▶ Password 객체
- `<input type="password" name="xxx" ~>` 태그를 관리하는 객체

- 속성변수
  - value
  - defaultValue
- 메소드
  - focus() / blur() / select()

### ▶ Textarea 객체
- `<textarea name="xxx" ~> ~ </textarea>` 태그를 관리하는 객체

- 속성변수
  - value
  - defaultValue
- 메소드
  - focus() / blur() / select()

### ▶ Hidden 객체
- `<input type="hidden" name="xxx" ~>` 태그를 관리하는 객체
- 화면에 보이고 싶지는 않지만 서버로 보내고 싶은 데이터가 있을 때 사용한다.
-	검색 화면에서 많이 사용!!
-	주로 [자바스크립트에서 제작된 데이터]를 담거나, DB검색을 출력 시 [PK값]이 저장되기도 한다.
-	<주의> 보이지 않으므로 사용자가 키보드로 입력할 수 없는 입력양식이다.

- 속성변수
  - value
  - defaultValue
- 메소드
  - focus() / blur() / select()

### ▶ FileUpload 객체
- `<input type="file" name="xxx" ~>` 태그를 관리하는 객체

- 속성변수
  - value : 파일의 이름이 저장된다.
  - defaultValue
- 메소드
  - focus() / blur() / select()

### ▶ Radio 객체
- `<input type="radio" name="xxx" ~>` 태그를 관리하는 객체
- name 값이 같은 라디오 버튼의 개수가 2개 이상일 경우 ( Array객체 )
  - document.form태그name값.xxx[i].속성변수
- name 값이 같은 라디오 버튼의 개수가 1개일 경우
  - document.form태그name값.xxx.속성변수

- 속성변수
  - value : 체크된 라디오 버튼 value값
  - checked : true/false
- 메소드
  - click() : 라디오 버튼의 체크를 넣어주거나 체크가 풀린다.

### ▶ Checkbox 객체
- `<input type="checkbox" name="xxx" ~>` 태그를 관리하는 객체
- name 값이 같은 체크박스 버튼의 개수가 2개 이상일 경우 ( Array객체 )
  - document.form태그name값.xxx[i].속성변수
- name 값이 같은 체크박스 버튼의 개수가 1개일 경우
  - document.form태그name값.xxx.속성변수

- 속성변수
  - value : 체크된 체크박스 버튼 value값
  - checked : true/false
- 메소드
  - click() : 체크박스 버튼의 체크를 넣어주거나 체크가 풀린다.


### ▶ Select 객체
- `<select name="xxx" ~>` 태그를 관리하는 객체

- 속성변수
  - value : 선택한 목록의 value 속성값
  - size : 목록상자의 펼쳐진 목록 개수
  - multiple : 다중 선택 가능 여부, 체크박스와 같음, ctrl키를 누르면 다중 선택이 가능
  - options : Option 객체들을 저장한 Array 객체 메모리 위치 주소값
- 메소드
  - focus() / blur()

### ▶ Option 객체
- select 태그 안에 삽입되는 option 태그를 관리하는 객체

- 속성변수
  - text : `<option value="값">문자열</option>`  에서 문자열
  - value : `<option value="값">문자열</option>`  에서 "값"

<br><br>
## ✔ JQuery 객체
####  장점
- 대부분의 브라우저에서 동일한 실행 결과를 가진다. (= 크로스 브라우징)
- 짧은 코딩으로 쉽게 처리할 수 있다.

#### JQuery 객체의 메모리 위치 주소
- jQuery("선택자") 또는 $("선택자") 라는 함수를 호출하면 JQuery 객체 메모리 위치 주소를 리턴한다.

#### JQuery 객체 사용 방법
1. jquery-x.x.x.min.js 다운 받는다. x 는 임의의 버전 번호이다.
2. HTML의 head 태그에 아래와 같이 수입하는 코드를 작성한다.   
		`<script src="jquery-x.x.x.min.js" type="text/javascript"></script>`  
		jquery-x.x.x.min.js 안에는 $ 함수와 JQuery 객체의 메소드/속성변수 등이 정의 되어 있다.
3. 위 수입하는 코드 이후에서  $("선택자") 를 호출하여 JQuery 객체의 메위주를 얻어 변수에 저장한다.
4. 변수.메소드(~)  로 JQuery 객체의 메소드를 호출한다.

