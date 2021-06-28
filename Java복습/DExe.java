class D {
	public static void add3(Integer i) {  // 함수안에서만 활용되는 i
		int val = i.intValue();
		val += 4;
		i = new Integer(val);
		System.out.println("메소드 안 : " + i.intValue());
	}
}

public class DExe {
	public static void main(String args[]) {
//		Integer i = 3;  //오토박싱(형변환)
		Integer i = new Integer(0);
		D.add3(i);
		System.out.println(i.intValue());
	}
}

/*
 * What is the result? 
 * A. 0 
 * B. 3 
 * C. Compilation fails. 
 * D. An exception is thrown at runtime.
 */
