
class E {
	
	public static void replaceJ(String text) {  // �Լ� �ȿ����� ���Ǵ� text
		text = text.replace('j', 'l');
		System.out.println("�޼ҵ��: " + text);
	}
	
}


public class EExe {
	public static void main(String args[]) {
		
		String text = new String("java");
		E.replaceJ(text);
		System.out.println(text);
		
		
		// replace�Լ� string�� ��ȭ X ,,���Կ������� ��ȭ������� ��
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
