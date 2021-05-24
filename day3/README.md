# DAY3
2021.05.14

## cmd창에서 java 파일 컴파일, 실행

- java파일 컴파일 후 class파일 만듦
```bash
>javac HelloJava.java
```

- 실행
```bash
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

- 클래스의 분류가 용이하다. (비슷한 것 끼리 묶는다)
- 패키지가 다르다면 동일한 클래스명을 사용할 수 있다.
- 소스파일(*.java)에 class파일 1개만,,, 여러개 효과적이지 않다...
- 하나의 패키지(package)에 main class파일 1개만,,,

  
cmd에서 package
```bash
> javac -d . HelloJava.java
// 컴파일 할때 디렉토리(package이름) 밑으로 class파일만들기

> java -cp . hello.HelloJava
// cp(classpath)를 .(현재디렉)으로 강제로 지정하고 hello package 밑에 HelloJava 실행
```


## cmd 용어
mkdir / rmdir  
dir [/s  등... ]  
cd  
move  

