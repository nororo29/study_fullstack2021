
class X {
	public static void modify(int[] a) {
		a[0]++;
	}
}

public class XExe {

	public static void main(String[] args) {
		int[] a = new int[1];
		System.out.println(a[0]);  // 0으로 초기화됨
		
		X.modify(a);
		System.out.println(a[0]);
		
		X.modify(a);
		System.out.println(a[0]);
	}

}
