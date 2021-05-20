package java_basic.ch07;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] dArr1 = new double[5];
		double dArr2[] = new double[8];
		double[] dArr3 = new double[] {0, 0, 0};
		
		System.out.println(dArr1.length + " " + dArr2.length + " " + dArr3.length);
		System.out.println(dArr1[0]);
		
		System.out.println(Arrays.toString(dArr1));
	}

}
