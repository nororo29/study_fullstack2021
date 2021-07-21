## Day49
2021.07.21


### ✔ JQuery
- 공개적으로 개발되고 무료로 제공되는 [자바스크립트 사용자 정의 객체]의 이름이다.
- 디자이너, 퍼블리셔, 개발자 모두가 사용하기 편하고 강력한 기능을 가진 메소드를 제공한다.
- 대부분의 브라우저에서 JQuery객체의 메소드를 호출하면 동일한 실행결과를 생산한다. (= Cross Browsing)


#### JQuery 사용하기 위한 사전 작업
- jquery-x.x.x.min.js 다운 받고 HTML의 head 태그에 아래와 같이 수입하는 코드를 작성한다.
- jquery-x.x.x.min.js  파일 안에는 JQuery 객체의 메위주를 리턴하는 jQuery 함수 또는 $ 함수가 존재하고 JQuery 객체의 메소드나 속성변수가 선언되어 있다.

```html
    <script src="jquery-1.11.0.min.js"></script>

```

#### JQuery 객체의 메모리 위치 주소값
- jQuery("선택자") 함수 도는 $("선택자") 함수를 호출하여 얻는다.
- JQuery 객체의 메모리 위치 주소값을 얻어야 메소드를 호출할 수 있다.

#### 선택자
- `var obj = $("[name=uid]");`  // name="uid"인 속성을 가진 태그를 관리
- `var obj = $(".pwd");`  // class="pwd"인 태그들을 관리
- `var obj = $("#addr");`  // id="addr"인 태그를 관리
- `var obj = $(".family .relation");`  // class="family"인 태그 자손 중 class="relation"인 태그들을 관리
- `var obj = $("div");`  // div태그들을 관리

<hr>

#### html파일에서 class값 주기
- name 속성 값은 서버로 가는 값이다.
- class 값은 서버로 가지 않는다. 디자인,제이쿼리 선택자 측면에서 설정한다.
```html
    <!-- 아이디, 비번 받는 입력양식에 class값 추가 -->
    <td><input type="text" name="uid" class="uid" size="10" /></td>
    <td><input type="password" name="pwd" class="pwd" size="10" /></td>


    <!-- 버튼은 입력양식이지만, 서버로 데이터가 가지않음 => name값 필요없음 -->
    <!-- class값 => JQuery에서 사용 -->
    <input type="button" value="로그인" class="login_btn" />
    <input type="reset" value="초기화" />

    <!-- 회원가입 화면으로 가기 -->
    <div style="cursor: pointer" class="regMember_btn">[회원가입]</div>

```

#### 화면 로드될 때 제이쿼리 함수 실행하는 법
- `<body onload="start();">` 사용해서 script태그 부분에 start함수를 만든다.
- html파일에 onload설정 없이, script부분에서 `$(document).ready(function(){  //코드 })`를 통해 실행
- `$(document).ready(function(){  //코드 })` 는 `$(function(){~})`와 같음
```javascript
// 로드될때 실행되는 함수
$(function() {
    // 로그인 버튼을 클릭하면, checkForm()함수 호출되도록 이벤트 설정하기

    // 1. 로그인 버튼 객체 class값으로 가져오기
    var obj = $(".login_btn");

    // 2. 클릭 이벤트
    // obj.click(function(){~}); 와 같음
    obj.on("click", function(){
        checkForm();
    });

});

```

- checkForm() 함수
```
// 유효성 체크 함수
function checkForm() {
    // .val() 메소드 : form요소 값 반환/설정
    var uid = $(".uid").val();  // form요소 값 반환 getter
    var pwd = $(".pwd").val();

    alert(uid + "/" + pwd);

    $(".uid").val("abc");  // form요소 값 설정 setter
}
```


