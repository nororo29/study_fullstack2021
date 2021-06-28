
class A {
	int x;
	
	boolean check() {
		x++;
		return true;
	}
	
	void zzz() {
		x = 0;
		if( (check() | check()) || check()) {   // 비트연산자 | (앞,뒤 다 검사), 조건연산자 || (앞에 true이면 그냥 true 반환)
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
		System.out.println(a.check() | a.check());  //true  => 비트연산자 a.check() 첫번째와 두번째 다 실행된 후 or연산함,,, 증가 2번됨
		System.out.println( (a.check() | a.check()) || a.check() );  //true => 논리연산자 앞에 값이 true이기 때문에 뒤에 확인안하고 true 반환!! 증가 안됨
		
		
		(new A()).zzz();  // 3
	}

}


