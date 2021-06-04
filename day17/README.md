## Day17
2021.06.04

- 인터페이스
- 컬렉션프레임워크
- 안드로이드 
  - 설치
  - 개발환경 이해
  - 액티비티  vs main
  
  
- module -> 한 어플리케이션...
- java > com.examplem.어플리케이션이름 > MainActivity.java
- res > drawable : 이미지파일
      > layout :  activity_main등...한 화면,,,xml파일
      > mipmap : 그림들,,,
      > values :  colors, strings, themes - 여러 기본 값들
  
  
- `setContentView(R.layout.activity_main);` : 

```java
        Button button = findViewById(R.id.button);    // Button 객체에 id=button인 값 대입
        TextView result = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {  // button 클릭했을 때, 익명클래스(인터페이스-onClick메서드 재정의해야함)
            @Override
            public void onClick(View view) {
                result.setText("카운트 : " + (++count));
            }
        });
```
