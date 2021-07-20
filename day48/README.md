## Day48
2021.07.20

### ✔ common_data.js 공용 데이터들

#### weekMsg : 요일(키값), 해당 요일 관련 메세지
```javascript
// JSON 선언
var weekMsg = {
      "월요일": "월요일은 9시에 회의 있습니다."  // JSON객체는 키값 문자열!!
      , "화요일": "화요일은 1시에 회의 있습니다."
      , "수요일": "수요일은 2시에 회의 있습니다."
      , "목요일": "목요일은 3시에 회의 있습니다."
      , "금요일": "금요일은 4시에 회의 있습니다."
      , "토요일": "토요일은 5시에 회의 있습니다."
};
```

#### scheduleMsg : 날짜문자열, 해당 날짜 설명 문자열
```javascript
// 2차원 배열 : 날짜문자열, 설명문자열
var scheduleMsg = [
      ["2021 - 07 - 2  0  ", "오늘... 입니다."]
      , ["2021-07-20", "오늘은 내 생일"]
      , ["2021-07-23", "2021-07-23 휴강일 입니다."]
      , ["2021-08-13", "2021-08-13 휴강일 입니다."]
      , ["2021-08-16", "2021-08-16 휴강일 입니다."]
      , ["2021-11-03", "2021-11-03 창립기념일."]
];
```

#### goldenSaying : 명언문자열
```javascript
// 명언 배열
var goldenSaying = [
      "노력은 배신하지 않는다."
      ,"피할수 없으면 즐겨라"
      ,"당신이 보낸 헛된 하루는 어제 죽은자가 그토록 바라던 내일이었다"
      ,"신념은 기적을 만들고, 훈련은 천재를 만든다"
      ,"오랫동안 꿈을 그리는 사람은 마침내 그 꿈을 닮아 간다"
      ,"모든 인생 문제의 정답은 상식적이라는 형용사를 붙여 생각하면 나옵니다."
      ,"강한자는 남에게 관대하고 자신에게 철저한 사람입니다. 항상 자신에게 관대함을 배풀지 마시길 바랍니다."
      ,"잘할 생각보단 동일한 실수를 하지 않으면 됩니다. "
      ,"멀리 있는 목표를 보지 말고 이번주 목표를 보고 달리 십시요. 이게 멀리 있는 목표를 달성하는 방법 입니다."
      ,"기회는 자기 소개서를 보내지 않는다."
      ,"나는 미래에 대해 생각하는 법이 없다. 어차피 곧 닥치니까"
      ,"인내할 수 있는 사람은 그가 바라는 것은 무엇이든지 손에 넣을 수 있다"
      ,"마음만을 가지고 있어서는 안된다. 반드시 실천하여야 한다"
      ,"천재성에는 한계가 있을 수 있지만 어리석음에는 이런 장애가 없다"
      ,"고통이 남기고 간 뒤를 보라! 고난이 지나면 반드시 기쁨이 스며든다"
];

```

#### dDayMsg : 날짜문자열, 해당 날짜 무슨날인지 설명문자열
```javascript
// d-day 메세지 2차원 배열 : 날짜문자열, 해당날짜무슨날인지
var dDayMsg = [
      ["2021-07-23", "휴강일"]
      , ["2021-07-23", "생일"]
      , ["2021-08-13", "휴강일"]
      , ["2021-08-16", "휴강일"]
      , ["2021-11-03", "창립기념일"]
];
```

<br><br>

### ✔ common_func.js 공용 함수들
#### isToday(dateStr) : 받은 날짜 문자열이 오늘인지 아닌지 true/false 
```javascript
// 받은 날짜문자열 오늘인지 true/false 리턴
function isToday(dateStr) {
        var flag = false;

        try {
              // dateStr문자열을 배열로 ...["2021", "07", "21"]
              var arr = dateStr.split("-");

              // string값에 공백 들어갔을 경우 => 공백이 숫자로 바뀔 때 오류...
              var year = arr[0].trim();
              var month = arr[1].trim();
              // deleteBlank함수 써서 공백제거
              var date = deleteBlank(arr[2]);

              // string값을 10진수 숫자로 바꿈
              var year = parseInt(year,10);
              var month = parseInt(month,10);
              var date = parseInt(date,10);

              // 오늘날짜
              var today = new Date();
              var today_year = today.getFullYear();
              var today_month = today.getMonth() + 1;
              var today_date = today.getDate();

              // 오늘날짜와 dateStr 비교해서 true/false를 flag에 저장
              flag = (year==today_year && month==today_month && date==today_date);

        } catch (e) {
              alert("isToday 함수에서 에러발생" + e.message);
              flag = false;
        }

        return flag;

}

```

#### deleteBlank(str) : 받은 문자열의 앞,뒤,중간에 있는 모든 공백 제거
```javascript
// deleteBlank 함수 : str의 모든 공백을 제거하고 난 후의 문자 리턴
function deleteBlank(str) {
        /*
        // var str_no_blank = "";

        // for (var i = 0; i < str.length; i++) {
        //   if (str.charAt(i) == " ")  // charAt()으로 공백이면 continue
        //     continue;

        //   str_no_blank += str.charAt(i);  // 공백아니면 문자열에 저장
        // }

        // return str_no_blank;
        */


        try {
              return str.split(" ").join("");  // 공백을 기준으로 배열로 만든후 공백없이 연결
        } catch (e) {
              alert("deleteBlank함수 오류" + e.message);
              return "";
        }
        
}

```

#### get_dDay(dateStr) : 받은 날짜 문자열과 오늘 날짜의 차이 일 수 반환
```javascript
// 오늘날짜와 받은날짜 차이 구하는 함수 (d-day)
function get_dDay(dateStr) {
        var interval_day = -1;

        try {
               // 오늘 날짜
              var today = new Date(); 

              var d_day_arr = dateStr.split("-");

              var d_day_year = d_day_arr[0];
              var d_day_month = d_day_arr[1];
              var d_day_date = d_day_arr[2];

              // 받은 날짜 생성
              var d_day = new Date(d_day_year, d_day_month-1, d_day_date);

              // 오늘날짜 - 받은날짜 : 차이 일수 리턴
              interval_day = Math.ceil((d_day.getTime() - today.getTime()) / (1000*60*60*24));
              return interval_day;

        } catch (error) {
              alert("get_dDay함수 예외 " + error.message);

              interval_day = -1;
              return interval_day;
        }

}
```

<br><br>

### ✔ boardList.html 에서 자바스크립트 코드

#### getScheduleMsg() : 오늘 날짜에 맞는 scheduleMsg 
```javascript
// 오늘날짜이면 scheduleMsg 출력하기.
function getScheduleMsg() {
      var tot_msg = [];  // 메세지가 여러개일 경우를 대비해 배열로

      for (var i = 0; i < scheduleMsg.length; i++) {
            var date = scheduleMsg[i][0];
            var msg = scheduleMsg[i][1];

            if (isToday(date)) {  // isToday함수(common_func.js에) 사용하여 오늘이면,,
                  // tot_msg += msg 같이 스트링에 더하기 형식은 메모리 낭비가 심함!
                  tot_msg.push(msg);  // 배열에 push
            }
      }

      return tot_msg.join(" ");  // 배열 공백으로 연결하여 리턴
      
}

```

#### get_goldenSaying() : 명언 랜덤으로 반환
```javascript
// 명언 랜덤으로 내보내는 함수
function get_goldenSaying() {
      var goldenSayingLen = goldenSaying.length;  // goldenSaying(명언 저장한 배열)
      var ranNum = Math.floor(Math.random()*goldenSayingLen)
      
      // ranNum난수 인덱스에 있는 명언 리턴
      return goldenSaying[ranNum];

}
```

#### get_DDayMsg() : 디데이 구하는 함수
```javascript
// 디데이 구하는 함수
function get_DDayMsg() {
      var arr = [];

      for (var i = 0; i < dDayMsg.length; i++) {  // dDayMsg (날짜와 무슨날인지 저장되어있는 2차원 배열)
            var date = deleteBlank(dDayMsg[i][0]);  // 앞뒤, 중간 공백 제거해주는 deleteBlank공용함수
            var msg = dDayMsg[i][1];
            
            // 오늘 - 디데이날짜 : 차이 일수 구하는 함수 get_dDay(디데이날짜)
            var interval_day = get_dDay(date);

            if (interval_day >= 0 && interval_day <= 10) {  // 디데이가 0보다 크고 10보다 작으면 배열에 문자열 저장
              arr.push(date + " " + msg + "까지 " + interval_day + "일 남았습니다."); 
            }
      }

      if (arr.length > 0) {  // 배열안에 값 존재하면, 리턴
            return arr.join("<br>");
      } else {
            return "";
      }

}
```


