## 비트 연산자
#### & , | , ^ , ~

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
		
		boolean t1 = (num1 > num2) & (num1 < num2);  // true & flase = false (비트연산)
		boolean t2 = (num1 > num2) | (num1 < num2);
		boolean t3 = (num1 > num2) ^ (num1 < num2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}

}
```

## shift 연산자
#### << , >> , >>>

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

## System.in (Scanner)  

- Ctrl + Shift + O : import 단축키  

```java
package chapter3;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		//Scanner 클래스, 매개변수(System.in) - import java.util.Scanner
		//단축키 Ctrl + Shift + O
		Scanner scanner = new Scanner(System.in);
		
		//String - java.lang 패키지 - import 안해도 됨
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
#### scanner 예제1
```java
package chapter3;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println("sum : " + (a + b));
		System.out.println("avg : " + ((a + b) / 2));
		
	}

}

```

## 조건문
#### if문
```java
package chapter4;

public class IfExample {

	public static void main(String[] args) {
		
		int age1 = 10;
		int age2 = 15;
		
		if (age1 >= 8) {
			System.out.println("8살 이상");
		} else {
			System.out.println("8살 이하");
		}
		
		//복합조건
		if ((age1 >= 8) && (age2 > 10)) {
			System.out.println("true");
		} else {
			System.out.println("false");			
		}
	}

}

```

#### if, Scanner 예제
```java
package chapter4;

import java.util.Scanner;

public class InputIfExam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println(num);
		} else {
			System.out.println("양수를 입력하세요!");
		}
	}

}

```

#### if, else if, else 예제
```java
package chapter4;

import java.util.Scanner;

public class InputIfExam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();

		if (a > 0) {
			System.out.println("양수");
		} else if (a == 0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수");
		}
		
	}

}

```

#### switch case 예제
```java
package chapter4;

import java.util.Scanner;

public class InputIfExam {

	public static void main(String[] args) {

		int ranking = 1;
		char medalColor;
		
		switch (ranking) {
			case 1:
				medalColor = 'G';
				//break;
			case 2:
				medalColor = 'S';
				//break;
			case 3:
				medalColor = 'B';
				//break;
			default:
				medalColor = 'A';
				break;
		}
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다.");
		//1등 메달의 색깔은 A입니다. (위에서 break없기 때문)
	}

}

```



## eclipse 단축어
- Alt + Shift + R : 변수명 일괄 변경
- Ctrl + D : 한줄삭제
- Ctrl + / : 한줄 또는 선택영역 주석처리 / 제거
- Alt + UP,DOWN : 현재 줄 위치 이동
- Ctrl + Alt + up/down : 한줄 duplicate
- Ctrl + Shift + O : import 단축키  

