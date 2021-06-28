class C {
	public static void modify(String s) {
		s += "world!";  // 함수 안에서만 사용되는 s...
		System.out.println("클래스함수 안 : " + s);  //Helloworld!
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
