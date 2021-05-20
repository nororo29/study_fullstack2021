import java.util.Scanner;

public class MathPowExam {

	public static void main(String[] args) {
		// 2N ^ (2N - 1) �յ�...  2^1 + 4^3 + 6^5...
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N�� ���� �Է��ϼ��� : ");
		int n = sc.nextInt();
		System.out.println("N�� �� : " + n);

		double total = 0;
		
		for (int i = 1; i <= n / 2; i++) {
			total += Math.pow(2 * i, 2 * i - 1);
		}
		System.out.println("�հ� : " + total);
		
		sc.close();
	}

}
