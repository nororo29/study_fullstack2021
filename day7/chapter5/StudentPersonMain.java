package chapter5;

import java.util.Arrays;

public class StudentPersonMain {

	public static void main(String[] args) {
		String msg;
		msg = new String("홍길동/구로구/2");
		System.out.println(msg);
		System.out.println(Arrays.toString(msg.split("/")));
		
		// 클래스는 객체화해서 사용 : instantiation
		Student student;
		student = new Student();
		
		student.address = "구로구";
		student.studentName = "황지현";
		student.grade = 2;
		student.studentId = 123;
		
		System.out.println(student.address);
		
		Person person = new Person();

		
		
		
		
	}

}
