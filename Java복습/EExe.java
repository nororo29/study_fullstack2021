
class E {
	
	public static void replaceJ(String text) {  // 함수 안에서만 사용되는 text
		text = text.replace('j', 'l');
		System.out.println("메소드안: " + text);
	}
	
}


public class EExe {
	public static void main(String args[]) {
		
		String text = new String("java");
		E.replaceJ(text);
		System.out.println(text);
		
		
		// replace함수 string값 변화 X ,,대입연산통해 변화시켜줘야 함
		text.replace('j', 'l');
		System.out.println(text);
		
		text = text.replace('j', 'l');
		System.out.println(text);
		
	}
}

/*
 * What is the result? 
 * A. lava 
 * B. java 
 * C. Compilation fails. 
 * D. An exception is thrown at runtime.
 */
