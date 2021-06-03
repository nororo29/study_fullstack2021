## Day15
2021.06.02

- arraycopy() : int[], String[] 배열같은 기본형 배열의 경우 arraycopy()메서드는 주소값 복사를 해주지 않는다. 객체배열만 주소값 복사됨

- = 대입 사용 : int[], String[] 같은 기본형 배열 주소값 복사

```java
		int[] nums1 = new int[] {0,1,2,3,4,5};
		int[] nums2 = new int[10];
    
		nums2 = nums1;  // 주소값 복사!!
		for (int s : nums2) {
			System.out.print(s + " ");	  // 0 1 2 3 4 5
		}
		
		System.out.println(nums1);  // [I@41a4555e
		System.out.println(nums2);  // [I@41a4555e
```

```java
		String[] strs1 = {"a", "b", "c"};
		String[] strs2 = new String[5];
    
		strs2 = strs1;
		for (String s : strs2) {
			System.out.print(s + " ");	  // a b c
		}
		
		System.out.println(strs1);  // [Ljava.lang.String;@3830f1c0
		System.out.println(strs2);  // [Ljava.lang.String;@3830f1c0
```
