## Day47
2021.07.19

## ✔ 사용자 정의 객체
- 개발자가 선언하는 새로운 객체
- new Object() / 리터럴표기법(일회성사용자정의객체) / 프로토타입(생성자함수)

#### new Object()로 객체 만들기 (일회성)
- 객체 생성 코드
```javascript
var sungjuk = new Object();

// 속성변수
sungjuk.s_no = 1;
sungjuk.s_name = "사오정";

// 메소드
function getS_no() {  // 메소드로 사용할 함수 만들기
  return this.s_no;
}
sungjuk.getS_no = getS_no;

```

- 사용자 객체의 속성변수/메소드 사용
```javascript
// 객체변수명["속성변수명"]
var name = sungjuk["s_name"];   // name = "사오정"

// 객체변수명.속성변수명
sungjuk.s_no = 3;

// 객체변수명.메소드()
alert(sungjuk.getS_no());

```

#### 리터럴 표기법으로 객체 만들기 (일회성)
- 생성자 함수 없이 만들어지는 객체이다.
- 일회만 사용할 목적으로 만들어진다.
- 실무적으로 일회성 사용자 정의 객체에는 메소드는 잘 나오지 않는다.
- 주로 여러 데이터를 보관하고 사용할 목적으로 사용한다.

- 객체 생성 코드
```javascript
var sungjuk = {
    // 속성변수 선언
    s_no: 1
    ,s_name: "사오정"
    ,kor: 91
    ,eng: 81
    ,mat: 71

    // 메소드 선언
    ,getS_no: function( ) {
      return this.s_no;       // 메소드 안에서는 this사용
    }
    ,getS_name:function( ) {
      return this.s_name;
}

// 속성변수, 메소드 사용
alert(sungjuk.getS_no());
```

- 다량의 데이터를 관리하는 방법
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
  
  - 예제
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


#### 프로토타입으로 객체 만들기


- HTML에서 [태그]를 관리하는 객체
