## Day47
2021.07.19

## ✔ 사용자 정의 객체
- 개발자가 선언하는 새로운 객체
- new Object() / 리터럴표기법(일회성사용자정의객체) / 프로토타입(생성자함수)

### ▶ new Object()로 객체 만들기 (일회성)
#### 객체 생성 코드
```javascript
var sungjuk = new Object();

// 속성변수
sungjuk.s_no = 1;
sungjuk.s_name = "사오정";

// 메소드
function getS_no() {  // 메소드로 사용할 함수 만들기
	return this.s_no;
}

sungjuk.getS_no = getS_no;  // 메소드 설정

```

#### 사용자 객체의 속성변수/메소드 사용
```javascript
// 객체변수명["속성변수명"]
var name = sungjuk["s_name"];   // name = "사오정"

// 객체변수명.속성변수명
sungjuk.s_no = 3;

// 객체변수명.메소드()
alert(sungjuk.getS_no());

```

### ▶ 리터럴 표기법으로 객체 만들기 (일회성)
- 생성자 함수 없이 만들어지는 객체이다.
- 일회만 사용할 목적으로 만들어진다.
- 실무적으로 일회성 사용자 정의 객체에는 메소드는 잘 나오지 않는다.
- 주로 여러 데이터를 보관하고 사용할 목적으로 사용한다.

#### 객체 생성 코드
```javascript
var sungjuk = {
	// 속성변수 선언
	s_no: 1
	, s_name: "사오정"
	, kor: 91
	, eng: 81
	, mat: 71

	// 메소드 선언
	,getS_no: function( ) {
		return this.s_no;       // 메소드 안에서는 this사용
	}
	,getS_name:function( ) {
		return this.s_name;
	}
}

// 속성변수, 메소드 사용
alert(sungjuk.getS_no());
```

#### 다량의 데이터를 관리하는 방법
- 데이터마다 변수 선언
```javascript
// 단점 : 과목의 개수가 늘어날수록 변수를 만들어줘야한다.
var kor = 91;
var eng = 81;
var mat = 71;
var che = 61;
var phy = 51;
alert(kor);
```

- 배열 사용
```javascript
// 배열 - 같은 종류의 데이터일 때 주로 사용한다. 반복문사용 쉬움.
// 단점 : 데이터가 무슨 데이터인지 알기 힘들다.
var jumsu = [91, 81, 71, 61, 51];
alert(jumsu[0]);
```

- 일회성 사용자 객체 사용
```javascript
// 일회성 사용자 정의 객체 - 다른 종류의 데이터일 때 무슨 데이터인지 알기 쉬워 주로 사용한다.
// 단점 : 반복문 사용이 힘들다.
var jumsu = {kor:91, eng:81, mat:71, che:61, phy:51};
alert(jumsu.kor);

// 똑같은 속성변수 2개일 경우 - 마지막껄로 덮어씌워짐
var jumsu = {kor:91, eng:81, mat:71, che:61, phy:51, kor:100};
```
  
#### 예제
```javascript
// dep_no/dep_name/loc
// 10/총무부/서울
// 20/영업부/부산
// 30/전산부/대전
// 40/자재부/광주

// [Array객체] 안에 [일회성 사용자 정의 객체]
var dept = [
	{dep_no:10, dep_name:"총무부", loc:"서울"}
	,{dep_no:20, dep_name:"영업부", loc:"부산"}
	,{dep_no:30, dep_name:"전산부", loc:"대전"}
	,{dep_no:40, dep_name:"자재부", loc:"광주"}
];

alert(dept[3].dep_name);  // 자재부
alert(dept.length)  // 부서의 개수
```


### ▶ 프로토타입으로 객체 만들기
#### 객체 생성 코드
```javascript
function Sungjuk( s_no, s_name, kor, eng, mat ) {
	// 속성변수
	this.s_no = s_no;
	this.s_name = s_name;
	this.kor = kor;
	this.eng = eng;
	this.mat = mat;

	// 메소드
	this.getS_no = function() {
		return this.s_no;
	}
	this.getS_name = function() {
		return this.s_name;
	}
	... 생략...
};

// 객체 생성 후, 속성변수, 메소드 사용
var sungjuk = new Sungjuk(1, "사오정", 91, 81, 71);
alert(sungjuk.getAvg());

```

## ✔ JSON
### JSON이란
- Javascript Object Notation 자바스크립트 객체 표기법
- 동종 또는 이기종 s/w끼리 쉽게 데이터를 전달하기 위해 만든 [개방형 표준 데이터 표기법]을 말한다.
- 일회성 사용자 정의 객체 표현법과 동일하다.

### 특징
- 각종 프로그래밍 언어나 [플랫폼]에 종속되지 않는 [독립형 데이터 포맷]이다.
- <참고> 플랫폼 platform : 특정 서비스를 하기 위한 기반 (ex. 카카오톡(플랫폼) - 카카오뱅크, 카카오택시...)

### 장점
- C, C++, C#, 자바, 자바스크립트, 파이썬 등 많은 프로그래밍 언어에서 동종 또는 이기종 s/w끼리 쉽게 데이터를 전달할 수 있다.
- 스프링 같은 프레임워크 사용 시, 웹 브라우저에서 비동기 방식으로 서버와 데이터를 주고받을 때 JSON을 사용하기도 한다.

- <참고 1> 비동기 : 병렬적으로 태스크 수행, 페이지 이동 없이 AJAX기술로 서버와 통신
	- ex. 검색 키워드 입력 시, 페이지 전환 없이 서버와 통신하여 관련 검색어가 밑에 뜨는 경우
	- ex. 지도에서 지도를 밀면 새로운 지도가 나오는 경우
	- ex. 아이디 입력 후 버튼을 눌러 페이지 전환 없이 서버와 통신하여 아이디 중복여부를 수신 받는 경우

- <참고 2> 동기 : 순서대로 작업 수행, 페이지 이동 하면서 웹서버와 통신

### 형식

```javascript
var 변수명 = {
	"문자열1" : 데이터
	, "문자열2" : 데이터
	, ~
	, "문자열n" : 데이터
}

변수명["문자열n"];  // 키값("문자열n")에 대응하는 데이터 호출


// 예시
var windowAirCondition = {
	"제품번호" : 1
	, "제품이름" : "창문형에어콘"
	, "제조사" : "파세코"
	, "재고물량" : 300
}

alert(windowAirCondition["제품이름"]);  // "창문형에어콘"

```
- <참고> "문자열1" ~ "문자열n" [키값]이라 부른다. (해시맵과 비슷)
- <주의> 키값은 서로 달라야 한다. 키값이 같으면 마지막 키값이 덮어 씌어진다.
- <주의> 데이터는 주로 문자열 또는 숫자이다. 즉 모든 프로그래밍 언어가 공유할 수 있는 데이터이다.




