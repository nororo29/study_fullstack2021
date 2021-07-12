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
    var regExp = new RegExp(/^([a-zA-z0-9_-]+)@([a-zA-Z0-9_-]+)(\.[a-zA-Z0-9_-]+){1,2}$/);
    return regExp.test(str);
}

// 패턴검사 공용함수
function isValidPattern(regExpObj, targetStr) {
    return regExpObj.test(targetStr);
}

// 한글이름 체크 함수
function checkMemName(str) {
    var flag = false;
    var regExp = new RegExp(/^[가-힣]{2,20}$/);

    if (regExp.test(str)) {
        flag = true;
    }

    return flag;
}

// id 체크 함수
function checkUid(str) {
    var flag = false;
    var regExp = new RegExp(/^[a-z]{a-z0-9_]{4,9}$/);

    if (regExp.test(str)) {
        flag = true;
    }

    return flag;
}

// 비번 체크 함수
function checkPwd(str) {
    var flag = false;
    var regExp = new RegExp(/^[a-z0-9]{5,8}$/);

    if (regExp.test(str)) {
        flag = true;
    }

    return flag;
}