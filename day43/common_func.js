// 공백문자 체크 함수
function isEmpty(str) {
  var flag = false;

  if (str.split(" ").join("") == "") {
    flag = true;
  }

  return flag;
}

// 이메일 체크 함수
function isValidEmail(str) {
  var regExp = new RegExp(
    /^([a-zA-z0-9_-]+)@([a-zA-Z0-9_-]+)(\.[a-zA-Z0-9_-]+){1,2}$/
  );
  return regExp.test(str);
}

// 패턴검사 공용함수
function isValidPattern(regExpObj, targetStr) {
  return regExpObj.test(targetStr);
}

// 라디오버튼, 체크박스 (Array 객체) 유효성 검사 공용함수 - 체크된 개수 리턴
function getCheckedCnt(arrObj) {
  try {  // 예외처리
    var len = arrObj.length;
    var checkedCnt = 0;

    if (len == undefined) {
      // 체크박스가 1개밖에 없을 때,,, len에 undefined가 들어감
      if (arrObj.checked == false) {
        // 체크 안되어 있으면,,,
        return 0;
      } else {
        return 1;
      }
    }

    for (var i = 0; i < len; i++) {
      if (arrObj[i].checked) {
        checkedCnt++;
      }
    }

    return checkedCnt;
  } catch (e) {
    alert("getCheckedCnt함수 호출에서 에러가 발생했음!!");
  }
}
