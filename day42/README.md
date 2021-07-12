## Day42
2021.07.12

게시판 - 새글쓰기(boardRegForm.html)

## ✔ 유효성 검사
- RegExp를 이용하여 유효성을 검색하는 공용함수 만들기
```javascript
// common_func.js파일
// 패턴검사 공용함수
function isValidPattern(regExpObj, targetStr) {
    return regExpObj.test(targetStr);
}
```

- 공용함수 사용하여 유효성 체크
```javascript
// writer 검사 : 한글 2~10자
// 공용함수 isValidPattern(패턴식, 검사값) 사용!!
if(!isValidPattern(/^[가-힣]{2,10}$/, writer)) {
    alert("글쓴이는 한글 2자 이상 10자 이하여야 합니다.");
    document.boardRegForm.writer.focus();
    return;
}
```

- RegExp사용이 더 복잡할 경우 (ex. 글제목, 글내용 - 공백 X, n자 미만인지 검사)
```javascript
// 제목 subject 검사 : 공백 X, 2~30자
if (isEmpty(subject)) {  // 공백일 경우
    alert("제목을 입력해주세요.");
    document.boardRegForm.subject.value = "";   // 제목 입력란 비우기
    document.boardRegForm.subject.focus();  // focus함수 이용하기!!
    return;
}
if (subject.length < 2 || subject.length > 30) {
    alert("제목은 2자이상 30자 이하여야 합니다.");
    document.boardRegForm.subject.focus();
    return;
}
```

## ✔ 첨부파일 보내기
- 들어온 첨부파일 확인해보기
```javascript
var pic = document.boardRegForm.pic.value;
alert(pic);  // C:\fakepath\파일명.PNG
```

- body에서 첨부파일 <input type="file"> 태그
```html
<tr>
    <!-- 이미지의 경로 키보드로 칠 수 없음,,,마우스로 선택만 가능 -->
    <!-- 유효성 체크 1 : 파일이 있냐 없냐 검사 -->
    <!-- 유효성 체크 2 : 확장자 검사, 올리지 못하는 확장자 골라내기 -->
    <th bgcolor="#f2f2f2">사진</th>
    <td><input type="file" name="pic"></td>
</tr>
```

- 첨부파일 유효성 검사 : 파일 있는지 없는지 검사 => 있다면, 확장자 검사
```javascript
if (!isEmpty(pic)) {  // 체크 1 : 파일 있는지 없는지 검사,, 이미지 있으면 코드실행
  // 체크 2 : 선택된 이미지 확장자가 jpg 또는 png 아니면 경고하고, 함수 중단
  if( !isValidPattern(/\.(jpg|png)$/, pic.toLowerCase()) ) {  // toLowerCase : jpg,png 대소문자 구분 없이 체크
      alert("선택하신 파일의 확장자는 jpg 또는 png이어야 합니다.");
      document.boardRegForm.pic.value="";  // 올린 첨부파일 없애기
      return;
  }
}
```

- form의 enctype 지정해주기
```html
// enctype 속성은 폼 데이터(form data)가 서버로 제출될 때 해당 데이터가 인코딩되는 방법을 명시한다.
// multipart/form-data : <form> 요소가 파일이나 이미지를 서버로 전송할 때 주로 사용
<form name="boardRegForm" enctype="multipart/form-data" action="boardRegProc.html">
```

## ✔ onload이벤트 
- <body> 부분에서 이벤트 처리
```html
<!-- load이벤트 : 로딩이 완료된 후 함수 호출!! -->
<body onload="setting();"> 
```
  
- 웹 화면 테스트 중에, 입력을 미리 해주는 함수 => 함수로 빼 놓아야 나중에 삭제하기 쉬움!!
```javascript
function setting() {
    // alert(1);  // 화면 맨처음 뜰 때 호출
    document.boardRegForm.writer.value = "사오정";
    document.boardRegForm.subject.value = "글제목입니다...";
    document.boardRegForm.email.value = "a@aaa.com";
    document.boardRegForm.content.value = "글내용입니다...";
    document.boardRegForm.pwd.value = "1111";
}
```

## ✔ form 서버로 보내기
- 새글쓰기 확정 질문
```javascript
// form의 action부분으로 전달 : boardRegProc.html로 submit()
if(confirm("새글쓰기를 정말 하시겠습니까?")) {
    document.boardRegForm.submit();
}
```

- 새글쓰기 성공할 경우 : 게시판목록("boardList.html")으로 이동
```javascript
// boardRegProc.html

<script>
    alert("새글쓰기 성공");
    location.replace("boardList.html");
</script>
```

- 새글쓰기 실패할 경우 : 바로 이전 페이지로 이동
```javascript
// boardRegProc.html

<script>
    alert("새글쓰기 실패");
    history.go(-1);  // 바로 이전 페이지로 이동
</script>
```

