## Day18
2021.06.07

- findViewById() : id로 ...
  - `Button btn = findViewById(R.id.button2);`
- 이벤트
  - 버튼
    - `btn.setOnClickListener()` : 클릭했을 때 이벤트
  - 체크박스
    - `checkbox.setOnCheckedChangeListener()` : 체크 바뀔 때
  - 스위치
    - `switch.setOnCheckedChangeListener()`
  - 레이팅바
    - `ratingBar.setOnRatingBarChangeListener()`
- 결과 출력(확인)
  - textview : setText()
    - `TextView result = findViewById(R.id.텍스트뷰id);`
    - `result.setText(스트링값);`
  - logcat : Log.d() / Log.i()
    - `Log.i(태그, 메세지);` : info에 나옴
    - `Log.d("버튼2:", "" + count);` : debug에 나옴
  - toast : Toast.makeText().show();
    - `Toast ts = Toast.makeText(MainActivity.this, "메세지",Toast.LENGTH_SHORT);` -> `ts.show();`
    - `Toast.makeText(MainActivity.this, "메세지", Toast.LENGTH_SHORT).show();`
- res > values > strings : 스트링 변수들..저장... @string/name값 으로 사용...
- module 삭제 : settings.gradle에서 삭제 후 sync now -> 폴더 삭제
- Linear Layout
  - horizontal
  - vertical
- match_parent / wrap_content
