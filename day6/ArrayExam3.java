package java_basic.ch07;

import java.util.Scanner;

public class ArrayExam3 {

	public static void main(String[] args) {
		// 100���� ���� �迭 ���� ��, ���� ���ʷ� �Է¹޴ٰ� -1 �ԷµǸ� �Է� �ߴ��ϰ�
		// -1�� ������ ������ 3���� ���� ���
		// �Է¹��� ������ -1�� �����ϰ� 3�� �̸��� ��� -1�� �����ϰ� �Է¹��� ���� ��� ���
		Scanner sc = new Scanner(System.in);
		
		int[] numArr = new int[100];
		int len = 0;
		
		for (int i = 0; i < 100; i++) {
			int n = sc.nextInt();
			if (n == -1)
				break;
			
			numArr[i] = n;
			len++;
		}
		
		if (len == 0) {
			System.out.println("�Է¹��� ������ �����ϴ�.");
		} else if (len < 3) {
			for (int i = 0; i < len; i++) {
				System.out.print(numArr[i] + " ");
			}
		} else {
			for (int i = len - 3; i < len; i++) {
				System.out.println(numArr[i] + " ");
			}
		}
		
		
	}

}
