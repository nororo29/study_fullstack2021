package chapter4_Practice;

public class Practice1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		
		//if-else if문
		if (operator == '+') {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		} else if (operator == '-') {
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		} else if (operator == '*') {
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		} else if (operator == '/') {
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
		} else {
			System.out.println("연산자 오류");
		}
		
		//switch-case문
		switch (operator) {
			case '+': {
				System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
				break;
			}
			case '-': {
				System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
				break;
			}
			case '*': {
				System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
				break;
			}
			case '/': {
				System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
				break;
			}
			default:
				System.out.println("연산자 오류");
				break;
		}
	}

}
