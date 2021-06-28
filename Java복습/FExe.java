class F1 {
	public byte getNumber() { return 1; }
}


class F2 extends F1 {
	
//	public short getNumber() { return 2; }  //line 8   
//	=> �޼ҵ� ��ȯ�� ���ƾ� ��!
	
	public byte getNumber() { return 2; }  
//	=> �޼ҵ� �������̵� : �޼ҵ� �̸�, �Ű�����, ��ȯ�� ���ƾ���.
	
	public int getNumber(byte i) { return i; }
//	=> �޼ҵ� �����ε� : �޼��� �̸��� ����
}


class FExe {
	public static void main(String args[]) {
		F2 b = new F2();
		System.out.println(b.getNumber());   //line 14  //�������̵��� F2 �޼ҵ� ȣ��
		
		byte i = 2;
		System.out.println(b.getNumber(i));  // �Ű������� ���� �����ε��� �޼ҵ� ȣ��
	}
}

/*
 * What is the result? 
 * A. 1 
 * B. 2 
 * C. An exception is thrown at runtime. 
 * D. Compilation fails because of an error in line 8. 
 * E. Compilation fails because of an error in line 14.
 */