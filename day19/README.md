## Day19
2021.06.08

속성 다 안나옴 -> 테마문제 :  file -> Project Structure > Min SDK 20 이상으로..
- 계산기
  - textAlignment, textAppearance(텍스트 크기)
  - `Integer.parseIng(textview.getText().toString())` : 텍스트뷰의 텍스트 내용을 int로 받기
  - `textview.append(btn1.getText())` : 텍스트뷰에 setText말고, 텍스트 연결해서 넣고싶을 때

- guessNum(컴퓨터가 정한 랜덤한 수 맞추기)
  - editTextNumber : 숫자만 입력받음
  - Math.random()

- guessNum2(버튼 눌러서 랜덤한 수 맞추기)
  - TableLayout : tableRow 안 뷰 요소들 weight 주기
  - `setVisibility(View.INVISIBLE)`
  - `getResources()` : res폴더 밑 자원을 다룰 수 있는 객체 반환
  - `getIdentifier(이름, 종류, 패키지명)`
  - OnClickListener 따로 빼서 만들고 여러곳에 사용하기...

- Intent
  - onclick속성에 바로 메소드 이름 넣기 : `android:onClick="onHomepage"`
  - common intent...
  - Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("...")) -> startActivity(intent);
  - finish();
  - setBackgroundColor

- padding/margin
  - padding
  - margin
  - visibility(invisible, visible, gone)
  - enabled(동작여부)
  - clickable(클릭이나 터치 가능여부)
  - 
