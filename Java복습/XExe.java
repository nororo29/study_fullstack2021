
class X {
	public static void modify(int[] a) {
		a[0]++;
	}
}

public class XExe {

	public static void main(String[] args) {
		int[] a = new int[1];
		System.out.println(a[0]);  // 0���� �ʱ�ȭ��
		
		X.modify(a);
		System.out.println(a[0]);
		
		X.modify(a);
		System.out.println(a[0]);
	}

}
