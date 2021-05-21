package chapter5;

public class StudentMain2 {

	public static void main(String[] args) {
		// Student 는 과목별 점수에 대해서 Score 클래스 표현한다
		// 어떤 한색의 수학/과학 과목의 점수를 처리하도록

		// 학생 : 홍길동/구로구/3학년, 수학:100점
		Student2 student = new Student2();
		student.studentName = "홍길동";
		student.address = "구로구";
		student.grade = 3;
		// subj는 클래스이기 때문에 메모리할당하기
//		student.subj = new Score2();
//		student.subj.subject = "수학";
//		student.subj.score = 100;

		System.out.println(student.toString());
		System.out.println(student.subj.toString());
	}

}
