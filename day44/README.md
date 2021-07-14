## Day44
2021.07.14

게시판 - 회원가입(memberRegForm.html)

## ✔ 드롭다운 select/option 태그
#### ▪ html에서 select/option 태그 사용하기
```html
<tr>
  <th bgcolor="lightgray">거주지</th>
  <td>
    <select name="addr">
      <option value="">--선택요망--</option>  // value값 비워서
      <option value="서울">서울</option>
      <option value="경기">경기</option>
      <option value="인천">인천</option>
      <option value="기타">기타</option>
    </select>
  </td>
</tr>

```

#### ▪ Javascript에서 드롭다운 태그 유효성 검사하기
```javascript
// select 객체 내 : options, value
// select 객체 > options 내 : Array객체 > option객체들...
var addr = formObj.addr.value;  // option객체에서 selected==true인 객체의 value값이 addr.value에 들어간다

// select태그 :주소 유효성 체크 - 선택되어 있는지 검사
if (isEmpty(addr)) { // isEmpty 함수 쓰는 이유 : "선택요망"부분 value값에 공백이 들어갈 경우를 대비하여
  alert("주소를 선택해주세요.");
  return;
}

```

<br><br>
게시판 - 수정/삭제(boardUpDelForm1.html)

## ✔ 수정/삭제 form 만들기
#### ▪ html에서 수정/삭제 form 만들기
```html
<!----------------------------- 수정 부분 form 생성 ----------------------------->
<form
  name="boardUpForm"               <!--- 수정form 이름 --->
  enctype="multipart/form-data"
  action="boardUpProc.html"        <!--- 수정form submit()했을 때 가는 곳 --->
>
  <table>
    <tr>
      <th>[글 수정/삭제]</th>
    </tr>
    <!----------------------------- 중간 생략 ----------------------------->
    <tr>
      <td align="center">
        <input type="button" value="수정" onclick="checkUpForm();" />            <!--- 수정 버튼 눌렀을 때--->
        <input type="button" value="삭제" onclick="checkDelForm();" />           <!--- 삭제 버튼 눌렀을 때 --->
        <input type="reset" value="초기화" />
        <input
          type="button"
          value="전체 글 보기"
          onclick="location.replace('boardList.html');"
        />
        <input
          type="button"
          value="로그아웃"
          onclick="location.replace('loginForm.html');"
        />
      </td>
    </tr>
  </table>
</form>

<!----------------------------- 삭제 부분 form 생성 ----------------------------->
<form name="boardDelForm" action="boardDelProc.html"></form>    <!--- 안에 내용 없음 --->

```

#### ▪ Javascript에서 수정/삭제 버튼 눌렀을 때 form 사용하여 작동하기
```javascript
// 수정버튼 눌렀을 때 유효성 체크
function checkUpForm() {
  var formObj = document.boardUpForm;      // boardUpForm!!
  
  // .... 중간 생략 : 유효성 검사 부분 ....
  
  // 수정 확정 질문
  if (confirm("댓글을 정말 수정 하시겠습니까?")) {
    formObj.submit();                      // boardUpProc.html로 submit()
  }
  
}

 // 삭제버튼 눌렀을 때 함수
function checkDelForm() {
  // 비밀번호가 맞아야 삭제
  var pwd = document.boardUpForm.pwd.value;        // boardUpForm!!  => pwd가 있는 form

  if (pwd != "1111") {
    alert("비밀번호가 일치하지 않아 수정 또는 삭제가 불가능 합니다.");
    return;
  }

  // 삭제 확정 질문
  if (confirm("댓글을 정말 삭제 하시겠습니까?")) {
    document.boardDelForm.submit();               // boardDelProc.html로 submit()
  }
  
}

```

