class D {
	public static void add3(Integer i) {  // �Լ��ȿ����� Ȱ��Ǵ� i
		int val = i.intValue();
		val += 4;
		i = new Integer(val);
		System.out.println("�޼ҵ� �� : " + i.intValue());
	}
}

public class DExe {
	public static void main(String args[]) {
//		Integer i = 3;  //����ڽ�(����ȯ)
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
