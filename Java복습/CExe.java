class C {
	public static void modify(String s) {
		s += "world!";  // �Լ� �ȿ����� ���Ǵ� s...
		System.out.println("Ŭ�����Լ� �� : " + s);  //Helloworld!
	}
}
public class CExe {
	public static void main(String[] args) {
		String s = new String("Hello");
		
		C.modify(s);   
		System.out.println(s);  //Hello

		C.modify(s);   
		System.out.println(s);  //Hello
		
	}
}
	
/*
 * What is the result? 
 * A. Hello 
 * B. Hello world! 
 * C. Compilation fails. 
 * D. An exception is thrown at runtime.
 */
