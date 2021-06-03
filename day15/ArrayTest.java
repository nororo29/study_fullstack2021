package java_basic_day15;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = new int[] {0,1,2,3,4,5};
		int[] nums2 = new int[10];
		
		System.arraycopy(nums1, 0, nums2, 0, nums1.length);  // nums1 -> nums2로 복사
		for (int i : nums2)
			System.out.print(i + " ");  // 0 1 2 3 4 5 0 0 0 0 
		
		nums1[3] = 100;  // num1 배열 바꿔도 num2 안바뀜
		
		System.out.println();
		for (int i : nums2)
			System.out.print(i + " ");  // 0 1 2 3 4 5 0 0 0 0 
		
		nums2[3] = 100;  // num2 직접 변경
		
		System.out.println();
		for (int i : nums2)
			System.out.print(i + " ");  // 0 1 2 100 4 5 0 0 0 0

		System.out.println();
		String[] strs1 = {"a", "b", "c"};
		String[] strs2 = new String[5];
		
		System.arraycopy(strs1, 0, strs2, 0, strs1.length);  // strs1 -> strs2로 복사
		
		for (String s : strs2) {
			System.out.print(s + " ");  // a b c null null 
		}
		
		strs1[1] = "abcdef";  // String[] 배열 : strs1 바꿔도 str2 안바뀜
		
		System.out.println();
		for (String s : strs2) {
			System.out.print(s + " ");  // a b c null null 
		}
	}

}
