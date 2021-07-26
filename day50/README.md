## Day50
2021.07.22

### ✔ load시 함수호출
- $(document).ready()
```javascript
$(document).ready( function() {
    // body 태그 안의 모든 태그를 읽어드린 후 실행하고 싶은 코드 
});
```

- $()
```javascript
$( function() {
    // body 태그 안의 모든 태그를 읽어드린 후 실행하고 싶은 코드 
});
```


<br><br>
### ✔ click이벤트시 함수호출
- .click( function(){} );
```javascript
$("선택자").click(
  function() {
    클릭이벤트 발생하면 실행할 코드
});
```

- .on( "click", function(){} );
```javascript
$("선택자").on("click", function() {
  클릭이벤트 발생하면 실행할 코드
});
```

<br><br>
### ✔ form객체 선택자
#### html
```html
<form name="loginForm">
  <input type="text" name="uid" class="uid" >
</form>
```

#### jquery 선택자
- **class이름으로 선택**
```javascript
var uid = $(".uid").val();
```
- name 속성 값으로 선택
```javascript
var uid = $("[name='uid']").val();
```
- **form의 name 속성 값 선택 후, class이름으로 선택**  
    - 2개 이상의 form에 같은 class이름을 가진 태그가 존재할 때 사용한다.
    - *공백은 자손태그들을 뜻함*
```javascript
var uid = $("[name='loginForm'] .uid").val();  
```
- form의 name 속성 값 선택 후, name 속성 값으로 선택
```javascript
var uid = $("[name='loginForm'] [name='uid']").val();
```


<br><br>
### ✔ val() 메소드
- class=xxx를 가진 태그의 value 값을 리턴(getter)
```javascript
$(".xxx").val()
```
- class=xxx를 가진 태그의 value 값을 ""로 세팅(setter)
```javascript
$(".xxx").val("")
```

<br><br>
<hr>

#### common_func에서 유효성 검사 함수
```javascript
// 한글 2-20자 사이인지 검사하는 함수
function isHangulName(hangulName) {
  return isValidPattern(/^[가-힣]{2,20}$/, hangulName);
}

// 첫글자 영소문자로, 나머지 영소문자,숫자,_ 인 5-10자
function isMem_id(mem_id) {
  return isValidPattern(/^[a-z][a-z0-9_]{4,9}$/, mem_id);
}

// 첫글자 영소문자로, 나머지 영소문자,숫자,_ 인 5-10자
function isMem_pwd(mem_pwd) {
  return isValidPattern(/^[a-z0-9_]{5,8}$/, mem_pwd);
}
```

#### memberRegForm.html(회원가입 화면)에서 유효성 검사 함수

- 입력양식 입력값 가져오기
```javascript
var mem_name = $(".mem_name").val();
var mem_id = $(".mem_id").val();
var mem_pwd = $(".mem_pwd").val();
var addr = $(".addr").val();         // select 입력양식
```


- mem_name 유효성 체크 : 이름 한글 2-20자
```javascript
if ( !isHangulName(mem_name) ) {
    alert("회원명은 한글 2~20자로 입력해주세요.");
    $(".mem_name").val("");  // 입력값 지우기
    $(".mem_name").focus();  // 입력양식에 포커스
    return;
}
```

- mem_id 유효성 체크 : 첫글자 영소문자로, 나머지 영소문자,숫자,_ 인 5-10자
```javascript
if ( !isMem_id(mem_id) ) {
    alert("아이디는 첫글자는 영소문자로, 영소문자,숫자,_로 5-10자입니다.");
    $(".mem_id").val("");
    $(".mem_id").focus();
    return;
}
```

- mem_pwd 유효성 체크 : 영소문 또는 숫자 또는 _ 로 5-8자
```javascript
if ( !isMem_pwd(mem_pwd) ) {
    alert("암호는 영소문 또는 숫자 또는 _ 로 5-8자입니다.");
    $(".mem_pwd").val("");
    $(".mem_pwd").focus();
    return;
}
```

- selector-options (addr) 유효성 체크 : 비어있으면 안됨
```javascript
if (isEmpty(addr)) {
    alert("주소를 입력해주세요.");
    $(".addr").focus();
    return;
}
```

- 라디오박스 (gender) 유효성 체크 : 체크된 라디오 개수 1개여야 한다.
  - ":checked" 선택자 사용
  - .filter() 메소드 사용
  - .length 속성변수 
```javascript
// var checkedGenderCnt = $(".gender:checked").length;      // 체크된 라디오버튼 개수
var checkedGenderCnt = $(".gender").filter(":checked").length;      // 체크된 라디오버튼 개수

if (checkedGenderCnt == 0) {
    alert("성별을 선택해주세요.");
    return;
}
```





