import java.util.Scanner;

public class StringExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� n �Է¹޾� 1~n���� �Ҽ� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0 || i % 3 == 0)
				continue;
			for (int j = 5; j <= i / j; j += 2) {
				if (i % j == 0)
					break;
			}
			System.out.print(i + " ");
		}
		
		sc.close();
	}

}
