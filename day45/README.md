## Day45
2021.07.16

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



### ▶ location 객체

### ▶ history 객체

### ▶ screen 객체

### ▶ navigator 객체

### ▶ document 객체

