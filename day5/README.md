## 비트 연산자
& , | , ^ , ~

```java
package chapter3;

public class BitOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;  //1010
		int num2 = 7; //0111
		int result1 = num1 & num2;  //0010 = 2
		int result2 = num1 | num2;  //1111 = 15
		int result3 = num1 ^ num2;  //1101 = 13
		int result4 = ~num1;  //1111 0101

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		// boolean t = (num1 & num2) && (num1 ^ num2)
		// &&는 논리연산자, 값끼리 논리연산 안됨
		
		boolean t1 = (num1 > num2) & (num1 < num2);		// true & flase : 비트연산 = flase
		boolean t2 = (num1 > num2) | (num1 < num2);
		boolean t3 = (num1 > num2) ^ (num1 < num2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}

}
```

## shift 연산자
<< , >> , >>>

```java
package chapter3;

public class ShiftOperation {

	public static void main(String[] args) {
    // shift 연산 : << , >>, >>>
		int n1 = 5; // 0000 0101
		int n2 = -5; // 1111 1011
		
	// <<연산 : 뒷부분 0으로 채워짐
		System.out.println(n1 + " << 2 : " + (n1 << 2));  //5*(2^2) = 20
		System.out.println(n1 + " << 3 : " + (n1 << 3));  //5*(2^3) = 40
	
	// >>연산 : 부호비트로 왼쪽 값 채워짐
		System.out.println(n1 + " >> 1 : " + (n1 >> 1));  //5/(2^1) = 2
		System.out.println(n1 + " >> 2 : " + (n1 >> 2));  //5/(2^2) = 1
		System.out.println(n1 + " >> 3 : " + (n1 >> 3));  //5/(2^3) = 0

		System.out.println(n2 + " >> 1 : " + (n2 >> 1));  //음수 >>연산
		System.out.println(n2 + " >> 2 : " + (n2 >> 2));
		System.out.println(n2 + " >> 3 : " + (n2 >> 3));
		
	// >>>연산 : 0으로 왼쪽 값 채워짐
		System.out.println(n1 + " >>> 1 : " + (n1 >>> 1));  //양수 >>>연산 
		System.out.println(n1 + " >>> 2 : " + (n1 >>> 2));
		System.out.println(n1 + " >>> 3 : " + (n1 >>> 3));
		
		System.out.println(n2 + " >>> 1 : " + (n2 >>> 1));  //음수 >>>연산 : 0으로 왼쪽 값 채워짐
		System.out.println(n2 + " >>> 2 : " + (n2 >>> 2)); 
		System.out.println(n2 + " >>> 3 : " + (n2 >>> 3));
		
		
		System.out.println(Integer.toBinaryString(n2 >> 1));
		//1111 1111 1111 1111 1111 1111 1111 1101 = -3
		System.out.println(Integer.toBinaryString(n2 >>> 1));
		//0111 1111 1111 1111 1111 1111 1111 1101 = 2147483645

	}
}

```

## String 연결
```java
public class StringConcat {

	public static void main(String[] args) {
		//boolean t = true + false;   //error

		//new String()
		String s = "";  //스트링 리터럴
		
		System.out.println("유니코드 = " + "\uADAC");          //유니코드 = 궬
		System.out.println("유니코드 escape = " + "\\uADAC");  //유니코드 escape = \uADAC
		
		System.out.println("정수 + 정수 = " + (5 + 10));       //정수 + 정수 = 15
		System.out.println("정수 + 정수 = " + 5 + 10);         //정수 + 정수 = 510
		System.out.println("정수 + 실수 = " + 5 + 10.9);       //정수 + 실수 = 510.9
		System.out.println(5 + 10.9 + " = 정수 + 실수");       //15.9 = 정수 + 실수

	}

}
```

## System.in
Scanner
```java
package chapter3;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		//Scanner 클래스, 매개변수(System.in) - import java.util.Scanner
		Scanner scanner = new Scanner(System.in);
		//java.lang 패키지 - import 안해도 됨
		String s = new String();  
		
		System.out.println("이름: ");
		String name = scanner.nextLine();    //입력
		System.out.println("직업: ");
		String job = scanner.nextLine();     //입력
		System.out.println("사번: ");
		int num = scanner.nextInt();         //입력
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
		
	}

}

```
