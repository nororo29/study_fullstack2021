package java_basic.ch07;

import java.util.Scanner;

public class Practice0520_3 {

	public static void main(String[] args) {
		// �ڿ��� n�Է¹޾� n*nũ�⿡ �������� �����Ͽ� ���
		// 10�̸��� Ȧ���� ���
		// ���ڴ� �������� ���� , �� ���̿� ������ ����
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] oddArr = {1, 3, 5, 7, 9};
		int[][] odd2Arr = new int[n][n];
		

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				odd2Arr[i][j] = oddArr[(n * i + j)  % 5];
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(odd2Arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
