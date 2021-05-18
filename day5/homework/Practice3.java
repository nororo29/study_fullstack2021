package chapter4_Practice;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("종료 할 경우 q나 -1을 입력하시오 : ");
			String quit = sc.next();
			
			if (quit.equals("q") || quit.equals("-1"))
				break;
			
			System.out.print("몸무게 키 입력 : ");
			int weight = sc.nextInt();
			int height = sc.nextInt();
			
			int BMI = weight + 100 - height;
			
			if (BMI > 0)
				System.out.println(BMI + " 비만");
			
			sc.close();
		}
	}

}
