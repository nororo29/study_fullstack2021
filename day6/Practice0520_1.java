package java_basic.ch07;

import java.util.Scanner;

public class Practice0520_1 {

	public static void main(String[] args) {
		// �ڿ��� n�Է¹ް� 1���� Ȧ���� ���ʴ�� ���� ���� n �̻��̸� ������ Ȧ���� ������ �� �� ���
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int oddNum = 0;
		int oddSum = 0;
		
		for (int i = 1; i <= n; i += 2) {
			oddSum += i;
			oddNum++;
			if (oddSum >= n) {
				System.out.println("������ Ȧ�� ���� : " + oddNum);
				System.out.println("������ Ȧ�� �� : " + oddSum);
				break;
			}
		}
	}

}
