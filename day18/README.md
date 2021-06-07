## Day18
2021.06.07

- findViewById() : id로 ...
- 이벤트
  - btn.setOnClickListener(new View.OnClickListener() {});
  - checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {});
  - switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {});
  - ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {});
- 결과 출력(확인)
  - textview : setText()
  - logcat : Log.d() / Log.i()
  - toast : Toast.makeText().show();
- res > values > strings : 스트링 변수들..저장... @string/name값 으로 사용...
- module 삭제 : settings.gradle에서 삭제 후 폴더 삭제
- Linear Layout
  - horizontal
  - vertical
- match_parent / wrap_content
