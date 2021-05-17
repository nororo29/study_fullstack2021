# DAY3
2021/05/14

## cmd창에서 java 파일 컴파일, 실행

- java파일 컴파일 후 class파일 만듦
```
>javac HelloJava.java
```

- 실행
```
>java HelloJava
```
1. Programfiles\java 디렉토리 밑에서 먼저 class파일 있는지 확인
2. 그 다음 현재 로컬 디렉토리 밑(예: C:\Users\wlgus)에서 class파일 있는지 확인

없을 경우 오류 : java.lang.ClassNotFoundException


## package 사용하기
패키지는 비슷한 성격의 자바 클래스들을 모아 넣는 자바의 디렉토리이다.
```java
package hello;
package java.basic.ch02;
// Java_basic(java project 이름) > src > java > basic > ch02 > .java파일
// Java_basic(java project 이름) > bin > java > basic > ch02 > .class파일
```
위 예제를 보면 패키지명이 java.basic.ch02 으로 되어 있다.  
이렇게 도트(.)를 이용하여 하위 패키지를 계속해서 만들어 나갈 수 있다.   
여기서 java.basic.ch02은 java.basic패키지의 서브패키지라고 말한다.


## cmd 용어
mkdir / rmdir
dir [/s  등... ]
cd
move

