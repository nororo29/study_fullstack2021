## Day43
2021.07.13

게시판 - 회원가입(memberRegForm.html)


## ✔ 라디오버튼/체크박스 유효성 검사
#### ▪ html에서 라디오버튼/체크박스 넣기 - name값 동일하게!!
```html
<tr>
  <th bgcolor="lightgray">성별</th>
  <td>
    <!-- 라디오버튼 : name값이 똑같아야 체크 중복 안됨!! -->
    <input type="radio" name="gender" value="m" />남
    <input type="radio" name="gender" value="f" />여
  </td>
</tr>

<tr>
  <th bgcolor="lightgray">취미</th>
  <td>
    <!-- 체크박스 : 값 여러개 -->
    <input type="checkbox" name="hobby" value="운동" />운동
    <input type="checkbox" name="hobby" value="여행" />여행
    <input type="checkbox" name="hobby" value="독서" />독서
    <input type="checkbox" name="hobby" value="기타" />기타
  </td>
</tr>

```

#### ▪ Javascript에서 라디오버튼 값 가져오기
```javascript
// document.memberRegForm.gender[인덱스]
// checked 속성변수 : checked 되었는지 true/false 반환

// 밑의 코드 : 라디오버튼 개수가 늘어났을 때, 유지보수가 힘들다.
var isMen = formObj.gender[0].checked;
var isWomen = formObj.gender[1].checked;

```

#### ▪ 반복문 사용하여 라디오버튼 값 가져오기
```javascript
var len = formObj.gender.length;  // 라디오버튼 길이
var checkedCnt = 0;  // 체크된 버튼 개수

for (var i = 0; i < len; i++) { // 라디오버튼 개수가 변해도 사용가능!!
  if (arrObj[i].checked) {
    checkedCnt++;
  }
}

if (checkedCnt == 0) {  // 체크된 값이 없을 경우
  alert("성별을 선택해주세요.");
  return;
}

```

<br><br>
## ✔ 공용함수 만들기
#### ▪ 라디오버튼/체크박스의 체크된 값 개수 반환하는 공용함수
```javascript
function getCheckedCnt(arrObj) {  // 매개변수 : 라디오버튼/체크박스 객체
  var len = arrObj.length;
  var checkedCnt = 0;

  for (var i = 0; i < len; i++) {
    if (arrObj[i].checked) {
      checkedCnt++;
    }
  }

  return checkedCnt;
}

```

#### ▪ 공용함수 사용하기
```javascript
// 라디오버튼 : 성별 유효성 체크 - 체크가 안되어 있으면 경고
if (getCheckedCnt(formObj.gender) == 0) {
  alert("성별을 선택해주세요.");
  return;
}

// 체크박스 : 취미 유효성 체크 - 1개 이상 선택되었는지 검사
if (getCheckedCnt(formObj.hobby) < 1) {
  alert("취미를 선택해주세요.");
  return;
}
      
```

<br><br>
## ✔ 체크박스 값이 1개인 경우
#### ▪ Array객체가 아니다. => length 속성변수가 없다. (ex. 동의합니다 버튼)
```html
<tr>
  <td colspan="2">
    <!-- 동의 구하는 체크박스 값 1개인 경우-->
    <input type="checkbox" name="confirm" value="동의" />동의(가입하신 개인정보는 보관이 됩니다.)
  </td>
</tr>
```

```javascript
// 동의버튼 (체크박스 값 1개인 경우) : 반복문 X, Array객체가 아님!!

// length : 존재하지 않는 속성변수 => undefined 반환(Array가 아니기 때문)
alert(formObj.confirm.length);  // undefined

```
  
#### ▪ 공용함수 수정하기
```javascript
if (len == undefined) {
  // 체크박스가 1개밖에 없을 때,,, len에 undefined가 들어감
  if (arrObj.checked == false) {
    // 체크 안되어 있으면,,,
    return 0;
  } else {
    return 1;
  }
}

```

```javascript
if (getCheckedCnt(formObj.confirm) == 0) {
  alert("개인정보 수집에 동의해주세요.");
  return;
}

```

