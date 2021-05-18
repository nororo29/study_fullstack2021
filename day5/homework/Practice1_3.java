package chapter4_Practice;

public class Practice1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan;
		int i;
		
		for (dan = 2; dan <= 9; dan++) {
			for (i = 1; i <= 9; i++) {
				if (i > dan)
					break;
				System.out.println(dan + "X" + i + "=" + (dan * i));
			}
			System.out.println();
		}
	}

}
