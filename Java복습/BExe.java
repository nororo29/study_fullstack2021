

class B {
	public static int a;  // 0���� �ڵ� �ʱ�ȭ��
	public static void modify(int a) {  // �Էº��� a�� �������� a�� �ٸ���!!
		a++;  // �Լ��ȿ����� ���Ǵ� a , ���������� �ٸ�...
		System.out.println("BŬ���� ��: " + a);
	}
}
public class BExe {
	public static void main(String[] args) {
		System.out.println(B.a);
		
		B.modify(B.a);
		System.out.println(B.a);
		
		B.modify(B.a);
		System.out.println(B.a);
		
		B.a = 10;
		B.modify(B.a);
		System.out.println(B.a);
	}
}

/*
 * What is the result? 
 * A. 0 
 * B. 1 
 * C. Compilation fails. 
 * D. An exception is thrown at runtime.
 */