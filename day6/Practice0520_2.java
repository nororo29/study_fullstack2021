package java_basic.ch07;

import java.util.Scanner;

public class Practice0520_2 {

	public static void main(String[] args) {
		// �ڿ��� n�Է¹޾� �𷡽ð� ���
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int spaceNum = 0;
		int starNum = 2 * n - 1;
		
		for (int i = 0; i < (2 * n - 1); i++) {
			for (int j = 0; j < spaceNum; j++)
				System.out.print(" ");
			for (int z = 0; z < starNum; z++)
				System.out.print("*");
			
			if (i >= n - 1) {
				spaceNum--;
				starNum += 2;
			} else {
				spaceNum++;
				starNum -= 2;
			}
			
			System.out.println();
		}
	}

}
