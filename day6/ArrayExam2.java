package java_basic.ch07;

import java.util.Scanner;

public class ArrayExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10�� ���� �Է¹޾� ���������� �Է� ���� ���ں��� ..�������� ���
		Scanner sc = new Scanner(System.in);
		
		String[] strArr = new String[10];

		for (int i = 0; i < 10; i++)
			strArr[i] = sc.next();
		
		for (int j = 9; j >=0; j--)
			System.out.print(strArr[j] + " ");
		
		sc.close();
	}

}
