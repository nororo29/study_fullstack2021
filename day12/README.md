## Day12
2021.05.28

- 인터페이스
- Object
  - toString() - return getClass().getName() + ":" + bookTitle + "," + bookNumber;
  - getClass()
  - getName()
  - hashCode()
  - equals()
  - clone()
- 내부클래스
- System 정적메소드 
  - exit()
  - nanoTime() / currentTimeMillis()
  - getProperty()
- Garbage Collection `System.gc()`

---
#### 복사
- 배열복사 
  - `System.arrayCopy()` 주소값복사(얕은복사)
  - `bookArray2[i].setBookName(bookArray1[i].getBookName());`    
     변수값 복사, 주소값 다름(깊은복사)
- 객체복사
  - `Circle circle2 = circle`  =연산, 주소값복사(얕은복사)
  - `clone()`  멤버변수값 복사, 주소값 다름(깊은복사)


