package java_basic_0524;

import java.util.Arrays;
import java.util.Scanner;

public class DogName {

	public static void main(String[] args) {
		// �ֿϰ� �̸� "������", "������", "�����", "���ұ�", "���"
		// �ֿϰ� �̸� �ԷµǸ� ����� ��ȯ�ؼ� ���
		Scanner sc = new Scanner(System.in);
		
		String[] dog = {"������", "������", "�����", "���ұ�", "���"};
		String[] dog2 = {"Bear", "Gift", "White", "Sesami", "Black"};
		
		String myDog = sc.nextLine();
		int i = Arrays.asList(dog).indexOf(myDog);
		
		if (i == -1) {
			System.out.println("ã�� �̸��� �����ϴ�.");
			return ;
		}
		
		System.out.println(dog2[i]);
	}

}
