## Day12
2021.05.28

- 인터페이스
- Object
  - toString() - return getClass().getName() + ":" + bookTitle + "," + bookNumber;
  - getClass()
  - getName()
  - hashCode()
  - equals()
  - clone()
- 내부클래스
- System 정적메소드 
  - exit()
  - nanoTime() / currentTimeMillis()
  - getProperty() / getProperties()
  - getenv()
- Garbage Collection `System.gc()`
- String
  - Builder pattern
  - StringBuilder / StringBuffer
  - indexOf() / substring() / startsWith() / trim() / split()
  - StringTokenizer : hasMoreTokens() / nextToken()
- Wrapper
  - 박싱 / 언박싱
  - valueOf() / parseInt() ...
- Format
  - String format
  - 날짜 format : SimpleDateFormat / Date
  - 숫자 format : DecimalFormat
- Calendar
  - singleton pattern
- Class 클래스

---
#### 복사
- 배열복사 (int[], String[] 등...)
  - `numArr2 = numArr1` =연산, 주소값복사(얕은복사)
  - `System.arraycopy(nums1, 0, nums2, 0, nums1.length);`  변수값 복사, 주소값 다름(깊은복사)

- 객체배열복사
  - `System.arrayCopy()` 배열의 주소는 다르지만 **배열 속 객체의 주소값은 같음(얕은복사)**
  
  ```java
  		// 객체배열
		Student2[] sArr1 = {new Student2("lucy", 1), new Student2("gina", 2), new Student2("tom", 3)};
		Student2[] sArr2 = new Student2[3];
		/*
		sArr2 = sArr1;
		System.out.println(sArr1 + " " + sArr1[0].name);
		System.out.println(sArr2 + " " + sArr2[0].name);
		
		sArr1[0].name = "ddd";
		System.out.println(sArr1 + " " + sArr1[0].name);
		System.out.println(sArr2 + " " + sArr2[0].name);
		*/
		
		// arraycopy() 객체배열 -> 객체배열의 주소는 다르지만,,,,객체의 주소는 같음,,, (얕은복사)
		System.arraycopy(sArr1, 0, sArr2, 0, 3);
		
		// 객체배열의 주소는 다름
		System.out.println(sArr1);  // [Ljava_basic_day16.Student2;@71dac704
		System.out.println(sArr2);  // [Ljava_basic_day16.Student2;@123772c4
		// 객체배열 속 객체의 주소는 같음 -> 결론 얕은복사
		System.out.println(sArr1[0] + " " + sArr1[0].name);  // java_basic_day16.Student2@2d363fb3 lucy
		System.out.println(sArr2[0] + " " + sArr2[0].name);  // java_basic_day16.Student2@2d363fb3 lucy
		// 값 바꾸면 같이 변경됨
		sArr1[0].name = "ddd";
		System.out.println(sArr1[0].name); // ddd
		System.out.println(sArr2[0].name); // ddd
    
    ```
    
  - `bookArray2[i].setBookName(bookArray1[i].getBookName());`    
     변수값 복사, 주소값 다름(깊은복사)

- 객체복사
  - `Circle circle2 = circle`  =연산, 주소값복사(얕은복사)
  - `clone()`  멤버변수값 복사, 주소값 다름(깊은복사)


