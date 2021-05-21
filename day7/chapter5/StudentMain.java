package chapter5;

public class StudentMain {

	public static void main(String[] args) {
		// 다수의 학생정보 관리 - 5명
		Student[] students = new Student[5];

		students[0] = new Student();
		students[1] = new Student();
		students[2] = new Student();
		students[3] = new Student();
		//students[4] = new Student();   //주소값없음.

		students[0].studentName = "홍길동";
		students[0].grade = 3;

		students[1].studentName = "이순신";
		students[1].grade = 2;

		for (int i = 0; i < 5; i++) { // null오류 안남. 그냥 null로 출력가능 -> new로 메모리할당을 해줬기 때문
			System.out.println(students[i]); // 주소
			//System.out.println(students[i].studentName);
		}
		
		/*
		int[] intarr = new int[5];
		intarr[0] = 1;
		
		for (int i = 0; i < 5; i++)
			System.out.println(intarr[i]);
		 */
	}

}
