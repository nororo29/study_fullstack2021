
class A {
	int x;
	
	boolean check() {
		x++;
		return true;
	}
	
	void zzz() {
		x = 0;
		if( (check() | check()) || check()) {   // ��Ʈ������ | (��,�� �� �˻�), ���ǿ����� || (�տ� true�̸� �׳� true ��ȯ)
			x++;
		}
		System.out.println("x=" + x);
	}
}

public class AExe {

	public static void main(String[] args) {
		System.out.println(true | true);  //true
		System.out.println(true | false); //true
		System.out.println(false | true); //true
		System.out.println(false | false); //false
		
		
		System.out.println(true & true);  //true
		System.out.println(true & false); //false
		System.out.println(false & true); //false
		System.out.println(false & false); //false
		
		
		A a = new A();
		System.out.println(a.check() | a.check());  //true  => ��Ʈ������ a.check() ù��°�� �ι�° �� ����� �� or������,,, ���� 2����
		System.out.println( (a.check() | a.check()) || a.check() );  //true => �������� �տ� ���� true�̱� ������ �ڿ� Ȯ�ξ��ϰ� true ��ȯ!! ���� �ȵ�
		
		
		(new A()).zzz();  // 3
	}

}


