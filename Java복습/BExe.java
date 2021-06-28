

class B {
	public static int a;  // 0으로 자동 초기화됨
	public static void modify(int a) {  // 입력변수 a와 정적변수 a는 다르다!!
		a++;  // 함수안에서만 사용되는 a , 정적변수와 다름...
		System.out.println("B클래스 안: " + a);
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