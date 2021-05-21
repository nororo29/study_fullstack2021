package chapter5;

public class StudentMain3 {

	public static void main(String[] args) {
		// Student2, Score2 사용
		// subj -> 배열로
		/*
		 * Student2[] students = new Student2[2]; students[0] = new Student2();
		 * students[1] = new Student2();
		 */

		// 홍길동/구로구/3학년 "수학,100", "국어,90"
		Student2 student1 = new Student2();
		student1.studentName = "홍길동";
		student1.address = "구로구";
		student1.grade = 3;

		student1.subj = new Score2[2];
		student1.subj[0] = new Score2();
		student1.subj[1] = new Score2();

		student1.subj[0].subject = "수학";
		student1.subj[0].score = 100;
		student1.subj[1].subject = "국어";
		student1.subj[1].score = 90;

		// 고길동/영등포구/3학년 "수학,70", "국어,80"
		Student2 student2 = new Student2();
		student2.studentName = "고길동";
		student2.address = "영등포구";
		student2.grade = 3;

		student2.subj = new Score2[2];
		student2.subj[0] = new Score2();
		student2.subj[1] = new Score2();

		student2.subj[0].subject = "수학";
		student2.subj[0].score = 70;
		student2.subj[1].subject = "국어";
		student2.subj[1].score = 80;

		System.out.println(student1.studentName + " ===== ");
		for (int i = 0; i < 2; i++)
			System.out.println(student1.subj[i].subject + " " + student1.subj[i].score);

		System.out.println(student2.studentName + " ===== ");
		// 향상된 for문  // iterator
		for (Score2 s : student2.subj) 
			System.out.println(s.subject + " " + s.score);

	}

}
