package java_basic.ch07;

import java.util.Scanner;

public class ArrayExam4 {

	public static void main(String[] args) {
		// 6���� ���ڹ迭 ����� {'P', 'R', 'O', 'G', 'R', 'A', 'M','M','I','N','G'}���� �ʱ�ȭ�� �� 
		// ���� �Ѱ��� �Է¹޾� �迭������ ��ġ ���
		// ù ��° ��ġ�� 0
		// �迭�� ���� ���� �Է¹����� "none" ���
		Scanner sc = new Scanner(System.in);
		
		char[] charArr = {'P', 'R', 'O', 'G', 'R', 'A', 'M', 'M', 'I', 'N', 'G'};
		int len = charArr.length;
		char ch = sc.next().charAt(0);
		
		int i;
		for (i = 0; i < len; i++) {
			if (ch == charArr[i]) {
				System.out.println(i);
				break;
			}
		}
		
		if (i == len)
			System.out.println("none");
	}

}
