## Day6
2021.05.20

## String
- charAt, length, equals, split, substring
#### 예제1
```java
import java.util.Scanner;

public class StringExam1 {

	public static void main(String[] args) {
		//사칙연산 scanner로 "1 + 1" 같이 입력받아 결과 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산식을 입력하세요 : ");
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		
		int num1 = Integer.parseInt(strArr[0]);
		int num2 = Integer.parseInt(strArr[2]);
		int result = 0;
		
		switch (strArr[1]) {
		case "+": {
			result = num1 + num2;
			break;
		}
		case "-": {
			result = num1 - num2;
			break;
		}
		case "*": {
			result = num1 * num2;
			break;
		}
		case "/": {
			result = num1 / num2;
			break;
		}
		default:
			System.out.println("연산자 오류");
			break;
		}
		
		System.out.println(result);
		sc.close();
		
	}

}
```
