class F1 {
	public byte getNumber() { return 1; }
}


class F2 extends F1 {
	
//	public short getNumber() { return 2; }  //line 8   
//	=> 메소드 반환형 같아야 함!
	
	public byte getNumber() { return 2; }  
//	=> 메소드 오버라이딩 : 메소드 이름, 매개변수, 반환형 같아야함.
	
	public int getNumber(byte i) { return i; }
//	=> 메소드 오버로딩 : 메서드 이름만 같음
}


class FExe {
	public static void main(String args[]) {
		F2 b = new F2();
		System.out.println(b.getNumber());   //line 14  //오버라이딩된 F2 메소드 호출
		
		byte i = 2;
		System.out.println(b.getNumber(i));  // 매개변수로 인해 오버로딩된 메소드 호출
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