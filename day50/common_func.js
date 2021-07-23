// 공백문자 체크 함수
function isEmpty(str) {
  var flag = false; // 공통 변수는 밖에 빼서 사용한다.

  try {
    if (str.split(" ").join("") == "") {
      flag = true;
    }
  } catch (e) {
    alert("isEmpty 함수 호출 시 예외 발생" + e.message);
    flag = false; // try문이 복잡할 때를 대비해서, return할 데이터를 확실하게 초기화
  }

  return flag;
}

// 이메일 체크 함수
function isValidEmail(str) {
  var flag = false;

  try {
    var regExp = new RegExp(
      /^([a-zA-z0-9_-]+)@([a-zA-Z0-9_-]+)(\.[a-zA-Z0-9_-]+){1,2}$/
    );
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

  try {
    // 예외처리
    var len = arrObj.length;

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
      // 체크박스 여러개일 때, 반복문 사용하여 array접근
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

// getTodayWeek()
function getTodayWeek() {
  var week = ["일", "월", "화", "수", "목", "금", "토"];

  var today = new Date();
  var weekNo = today.getDay();

  return week[weekNo];
}

// 파일 이름 같으면 덮어써짐~
function getTodayWeek() {
  return ["일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"][
    new Date().getDay()
  ];
}

// 현재 시각의 년-월-일(요일)을 문자로 리턴하는 함수
function getTodayYMDW() {
  var today = new Date();

  var year = today.getFullYear();
  var month = today.getMonth() + 1;
  var date = today.getDate();
  var day = getTodayWeek().replace("요일", "");

  if (month < 10) {
    month = "0" + month;
  }

  if (date < 10) {
    date = "0" + date;
  }

  return year + "-" + month + "-" + date + "(" + day + ")";
}

// 받은 날짜문자열 오늘인지 true/false 리턴
function isToday(dateStr) {
  var flag = false;

  try {
    // dateStr 배열로 ...["2021", "07", "21"]
    var arr = dateStr.split("-");

    // string값에 공백 들어갔을 경우!! => 공백이 숫자로 바뀔 때 오류...
    var year = arr[0].trim();
    var month = arr[1].trim();
    // deleteBlank함수 써서 공백제거
    var date = deleteBlank(arr[2]);

    // string값을 10진수 숫자로 바꿈
    var year = parseInt(year, 10);
    var month = parseInt(month, 10);
    var date = parseInt(date, 10);

    // 오늘날짜
    var today = new Date();
    var today_year = today.getFullYear();
    var today_month = today.getMonth() + 1;
    var today_date = today.getDate();

    flag = year == today_year && month == today_month && date == today_date;
  } catch (e) {
    alert("isToday 함수에서 에러발생" + e.message);
    flag = false;
  }

  return flag;
}

// deleteBlank 함수 : str의 모든 공백을 제거하고 난 후의 문자 리턴
function deleteBlank(str) {
  // var str_no_blank = "";

  // for (var i = 0; i < str.length; i++) {
  //   if (str.charAt(i) == " ")
  //     continue;

  //   str_no_blank += str.charAt(i);
  // }

  // return str_no_blank;

  try {
    return str.split(" ").join("");
  } catch (e) {
    alert("deleteBlank함수 오류" + e.message);
    return "";
  }
}

// 오늘날짜와 받은날짜 차이 구하는 함수 (d-day)
function get_dDay(dateStr) {
  var interval_day = -1;

  try {
    // 오늘 날짜
    var today = new Date();

    var dday_arr = dateStr.split("-");

    var dday_year = dday_arr[0];
    var dday_month = dday_arr[1];
    var dday_date = dday_arr[2];

    // 받은 날짜 생성
    var d_day = new Date(dday_year, dday_month - 1, dday_date);

    // 오늘날짜 - 받은날짜 : 차이 일수 리턴
    interval_day = Math.ceil(
      (d_day.getTime() - today.getTime()) / (1000 * 60 * 60 * 24)
    );
  } catch (e) {
    alert("get_dDay함수 예외 " + e.message);

    interval_day = -1;
  }

  return interval_day;
}


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