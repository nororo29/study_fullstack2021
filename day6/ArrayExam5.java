package java_basic.ch07;

import java.util.Scanner;

public class ArrayExam5 {

	public static void main(String[] args) {
		// 1�ݺ��� 6�ݱ��� ������� ���� �� �� ���� ��ȣ �Է¹޾�
		// �� �� ��������� ���� ���
		// �ݺ� ������� �ʱⰪ : 85.6, 79.5, 83.1, 80.0, 78.2, 75.0
		// ����� �Ҽ� �� ��° �ڸ����� �ݿø��Ͽ� �Ҽ� ù°�ڸ�����
		Scanner sc = new Scanner(System.in);
		
		double[] classAvg = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		
		int class1 = sc.nextInt();
		int class2 = sc.nextInt();
		
		System.out.println(classAvg[class1 - 1] + classAvg[class2 - 1]);
	}

}
