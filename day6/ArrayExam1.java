package java_basic.ch07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExam1 {

	public static void main(String[] args) {
		// ���� �迭�� ","�����ڷ� �Է� �ޱ� -> ���� ū �� ���
		// ���� �迭 �Է� �ޱ� -> while���� �̿��� ¦����° ��� �հ� ��� ���
		Scanner sc = new Scanner(System.in);
		
		int numArr[] = new int[10];
		
		String numStr = sc.nextLine();
		
		for(int i = 0; i < 10; i++) {
			numArr[i] = Integer.parseInt(numStr.split(", ")[i]);
		}
		
		//�ִ� ���ϱ�
		int maxNum = numArr[0];
		
		for(int i = 0; i < 10; i++) {
			if(maxNum < numArr[i])
				maxNum = numArr[i];
		}
		
		System.out.println(maxNum);
		
		
		//¦����� ��, ���
		int sum = 0;
		int avg = 0;
		
		int i = -1;
		while (++i < 10) {
			if (i % 2 == 1)
				continue;
			sum += numArr[i];
		}
		avg = sum / 5;
		
		System.out.println("¦����� �� : " + sum + " ��� : " + avg);
		
		//��������
		
	}

}
