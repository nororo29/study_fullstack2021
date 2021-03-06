## Day45
2021.07.15

## ✔ 예외처리
#### ▪ 예외 (Exception)
예외(exception)란  프로그램이 실행 중에 발생하는 런타임 오류를 의미합니다.  
<주의> 감지할 수 없는 오류는 예외가 아니다. (ex. 전원 꺼짐)  
<주의> 오류(error)란 프로그램 구문의 문법적인 오류를 의미합니다.  

#### ▪ 예외처리 (Exception Handling)
예외가 발생할 경우, 프로그램의 갑작스런 중단을 막고 원하는 방향으로 프로그램을 진행하는 것을 말한다.  

```javascript
try{
  // 예외 발생할 가능성이 있는 코드
}
catch(e){
  // 예외가 발생했을 때 실행할 코드		
}
finally{
  // 예외가 발생하든 안하든 무조건 실행할 코드		
}
```

<br><br>
## ✔ BOM 객체 (window/location/history/screen/navigator/document)
윈도우, 윈도우에 로드된 문서의 URL, 브라우저가 출력된 스크린 장치, 
브라우저의 종류와 기능 등 브라우저와 브라우저가 실행되고 있는 환경을 
자바스크립트 코드로 접근하고 제어할 수 있도록 설계된 객체들의 그룹  

<br>

### ▶ window 객체
#### 객체 생성되는 경우
- 브라우저가 새로운 웹 페이지를 로드할 때 window 객체 자동 생성
- iframe 태그 당 하나의 window 객체 자동 생성
- `window.open("웹페이지 URL", "윈도우이름", "윈도우속성")` 코드로 임의의 window 객체 생성

#### 속성변수
|속성변수명|설명|r/w|
|---------|----|----|
|innerHeight|문서가 출력되는 영역의 높이|r|
|innerWidth|문서가 출력되는 영역의 넓이|r|
|status|상태바에 출력되는 문자열|r/w|
|defaultStatus|상태바에 출력되는 문자열 디폴트값||

#### 메소드
|메소드명|설명|
|---------|----|
|open()|새 윈도우를 연다|
|close()|새 윈도우를 닫는다|
|focus()|윈도우에 포커스를 준다|
|blur()|현재 윈도우는 포커스를 잃는다|
|alert()|경고 다이얼로그 출력|
|confirm()|확인 다이얼로그 출력|
|setInterval()|타이머 가동 - 타임아웃 코드가 반복 호출|
|clearInterval()|setInterval()로 가동 중인 타이머 중단|
|setTimeout()|타이머 가동 - 타임아웃 코드가 1회 호출|
|clearTimeout()|setTimeout()로 가동 중인 타이머 중단|
|moveBy()|지정된 픽셀만큼 윈도우 이동|
|moveTo()|지정된 위치로 윈도우 이동|
|resizeBy()|지정된 크기만큼 윈도우 조절|
|resizeTo()|지정된 크기로 윈도우 조절|


<br>

### ▶ location 객체
- 윈도우에 로드된 웹 페이지의 **URL정보**를 나타내는 객체

#### 속성변수
|속성변수명|설명|r/w|
|---------|----|----|
|port|웹 브라우저의 port번호<br> *(ex. 8080)*|r/w|
|protocol|웹 브라우저의 protocol가 저장되어 있다.<br> *프로토콜 : 통신규약, 통신방법 (ex. http:, https:)*|r/w|
|href|URL 전체 문자열, 웹페이지의 URL 주소를 알려주거나 지정한  URL 주소의 페이지를 열어준다.|r/w|
|hostname|웹 서버 이름|r/w|
|host|도메인과 포트번호를 포함하는 웹 서버 주소 문자열|r/w|

#### 메소드
|메소드명|설명|
|---------|----|
|replace()|현재 웹 페이지의 URL을 히스토리에서 제거하고, 새로운 페이지를 로드한다.|
|reload()|현재 웹 화면에 있는 페이지를 다시 로드한다.|

<br>

### ▶ history 객체
- 웹 브라우저의 History List(방문한 적이 있는 URL주소)를 관리하는 객체
- `window.history` 혹은 `history`로 접근한다.

#### 속성변수
|속성변수명|설명|r/w|
|---------|----|----|
|length|History List에 포함된 URL주소의 개수|r|

#### 메소드
|메소드명|설명|
|---------|----|
|go(n)|History List가 기억하고 있는 주소로 이동<br> 양의 정수일 경우 앞으로 이동, 음의 정수일 경우 뒤로 이동<br> *(ex. history.go(-1) : 이전 화면 이동)*|
|forward()|현재 페이지를 그 다음 페이지로 이동. go(1)과 동일|
|back()|현재 페이지를 그 이전 페이지로 이동. go(-1)과 동일|

<br>

### ▶ screen 객체
- 현재 모니터의 해상도, 색상, 화면의 크기 등에 관한 정보를 제공하는 객체
- `window.screen` 혹은 `screen`로 접근한다.

#### 속성변수
|속성변수명|설명|r/w|
|---------|----|----|
|height|모니터 전체 높이의 픽셀 단위|r|
|width|모니터 전체 너비의 픽셀 단위|r|
|availHeight|웹페이지가 나타날 실제 화면의 높이|r|
|availWidth|웹페이지가 나타날 실제 화면의 너비|r|
|pixelDepth|한 픽셀당 비트수|r|
|colorDepth|사용 가능한 색상수, pixelDepth와 동일|r|

<br>

### ▶ navigator 객체
- 현재 작동중인 브라우저에 대한 각종 정보를 제공하는 객체
- `window.navigator` 혹은 `navigator`로 접근한다.

#### 속성변수
|속성변수명|설명|r/w|
|---------|----|----|
|appCodeName|웹브라우저의 코드명|r|
|appName|웹브라우저의 이름|r|
|appVersion|웹브라우저의 버전|r|
|platform|사용중인 운영체제의 플랫폼 이름|r|
|userAgent|웹브라우저의 전체적인 정보|r|

<br>

### ▶ document 객체
- DOM 트리의 최상위 객체 (DOM객체는 아니다)
- HTML문서의 전반적인 속성을 나타낸다.
- HTML 태그들을 배열처럼 접근할 수 있는 컬렉션을 두고 있다. (ex. `<img>`태그들은 images 컬렉션, `<form>`태그들은 forms 커렉션)
- `window.document` 혹은 `document`로 접근한다.

#### 속성변수
|속성변수명|설명|r/w|
|---------|----|----|
|title|`<title>`태그가 안고 있는 문자|r/w|
|location|현재 페이지의 URL정보를 가진 location객체의 참조변수|w|
|lastModified|문서의 마지막 수정 날짜|r|

#### 메소드
|메소드명|설명|
|---------|----|
|write()|documetn에 html 컨텐츠 삽입|

<br>

### ▶ event 객체
- 웹 화면에서 발생하는 모든 움직임(=이벤트)를 관리하는 객체
- 이벤트가 발생하면, 이벤트에 관련된 다양한 정보를 담은 이벤트 객체를 만들어 이벤트 리스너에 전달한다.
- 이벤트가 처리되면, 이벤트 객체는 소멸된다.

#### 속성변수
|속성변수명|설명|
|---------|----|
|type|이벤트의 종류 (click, load 등)|
|target|이벤트를 발생시킨 객체(DOM객체 혹은 HTML객체|
|currentTarget|현재 이벤트 리스너를 실행하고 있는 DOM객체|
|defaultPrevented|이벤트의 디폴트 행동이 취소되었는지 true/false값|

#### 메소드
|메소드명|설명|
|---------|----|
|preventDefault()|이벤트의 디폴트 행동을 취소시키는 메소드|
