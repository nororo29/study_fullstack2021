

// 공백문자 체크 함수
function isEmpty(str) {
  var flag = false;  // 공통 변수는 밖에 빼서 사용한다.

  try {
    if (str.split(" ").join("") == "") {
      flag = true;
    }
  } catch (e) {
    alert("isEmpty 함수 호출 시 예외 발생" + e.message);
    flag = false;  // try문이 복잡할 때를 대비해서, return할 데이터를 확실하게 초기화
  }

  return flag;

}


// 이메일 체크 함수
function isValidEmail(str) {
  var flag = false;

  try {
    var regExp = new RegExp(/^([a-zA-z0-9_-]+)@([a-zA-Z0-9_-]+)(\.[a-zA-Z0-9_-]+){1,2}$/);
    flag = regExp.test(str);
  } catch (e) {
    alert("isValidEmail 함수 호출 시 예외 발생" + e.message);
    flag = false;
  }

  return flag;
}


// 패턴검사 공용함수
function isValidPattern(regExpObj, targetStr) {
  var flag = false;

  try {
    flag = regExpObj.test(targetStr);
  } catch (e) {
    alert("isValidPattern 함수 호출 시 예외 발생" + e.message);
    flag = false;
  }

  return flag;
}


// 라디오버튼, 체크박스 (Array 객체) 유효성 검사 공용함수 - 체크된 개수 리턴
function getCheckedCnt(arrObj) {
  var checkedCnt = 0;

  try {  // 예외처리
    var len = arrObj.length;

    if (len == undefined) { // 체크박스가 1개밖에 없을 때,,, len에 undefined가 들어감
      if (arrObj.checked == false) { // 체크 안되어 있으면,,,
        return 0;
      } else {
        return 1;
      }
    }

    for (var i = 0; i < len; i++) {  // 체크박스 여러개일 때, 반복문 사용하여 array접근
      if (arrObj[i].checked) {
        checkedCnt++;
      }
    }

  } catch (e) {
    alert("getCheckedCnt함수 호출에서 에러가 발생했음!!" + e.message);
    checkedCnt = 0;
  }

  return checkedCnt;

}
