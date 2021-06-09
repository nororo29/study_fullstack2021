## Day20
2021.06.09

- Activity추가 -> manifests 폴더에서 activity 등록해야 실행가능

- 텍스트뷰(View>TextView)
  - textSize : `setTextSize((float)size)`
  - textColor : `setTextColor(Color.parseColor("#ffffff"))` *ex.Color.RED, Color.rgb(255,255,255)*
  - textStyle : bold, italic
  - typeface : 글꼴 `setTypeface(Typeface.MONOSPACE, Typeface.BOLD)`
  - singleLine : 말줄임... `setSingleLine(true)`

- 컴파운드버튼(View>TextView>Button>CompoundButton)
  - CheckBox
  - RadioButton
  - Switch
  - ToggleButton

- 이미지뷰(View>ImageView>ImageButton)
  - drawble폴더에 이미지 넣기 (!!! v24폴더에 넣으면 안나옴...)
  - setImageResource(R.drawable.이미지이름)
  - setScaleType(ImageView.ScaleType.타입명) *ex.FIT_XY, FIT_CENTER...*
  - 



---
### 클릭 리스너 사용
- 멤버변수로 선언 : 공통된 리스너 사용할 때
- 사용할 때 선언 : 한번 쓸 때
- 메서드로 : onClick에서 설정

```java
public class CompoundActivity extends AppCompatActivity {

    // 멤버변수로 리스너 선언
    CompoundButton.OnCheckedChangeListener myCheckedListener = new CompoundButton.OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            CheckBox cb = (CheckBox)compoundButton;
            TextView tv = findViewById(R.id.textView);
            int id = compoundButton.getId();

            if (b == true) { // 체크박스 checked일 때
                Toast.makeText(CompoundActivity.this,
                        "" + cb.getText() + " is Checked!",
                        Toast.LENGTH_SHORT)
                        .show();

                switch (id) {
                    case R.id.checkBox4:
                        tv.setTextColor(Color.RED);
                        break;
                    case R.id.checkBox5:
                        tv.setTextColor(Color.BLUE);
                        break;
                }
            } else {
                Toast.makeText(CompoundActivity.this,
                        "" + cb.getText() + " is Unchecked",
                        Toast.LENGTH_SHORT)
                        .show();
                switch (id) {
                    case R.id.checkBox4:
                    case R.id.checkBox5:
                        tv.setTextColor(Color.GRAY);
                        break;
                }

            }

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound);

        CheckBox cbAndroid = findViewById(R.id.checkBox);
        CheckBox cbIphone = findViewById(R.id.checkBox2);
        CheckBox cbCellphone = findViewById(R.id.checkBox3);

        CheckBox cbRed = findViewById(R.id.checkBox4);
        CheckBox cbBlue = findViewById(R.id.checkBox5);

        // 공통된 리스너 사용
        cbAndroid.setOnCheckedChangeListener(myCheckedListener);
        cbIphone.setOnCheckedChangeListener(myCheckedListener);
        cbCellphone.setOnCheckedChangeListener(myCheckedListener);

        cbRed.setOnCheckedChangeListener(myCheckedListener);
        cbBlue.setOnCheckedChangeListener(myCheckedListener);

        // 라디오 그룹 리스너
        RadioGroup rg = findViewById(R.id.radiogroup2);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                switch (id) {
                    case R.id.radioButton:
                        Toast.makeText(CompoundActivity.this,
                                "dog: " + id,
                                Toast.LENGTH_SHORT)
                                .show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(CompoundActivity.this,
                                "cat: " + id,
                                Toast.LENGTH_SHORT)
                                .show();
                        break;
                }
            }
        });

    }

    // onClick속성에서 쓰는 메서드
    public void onCellPhone(View v) {
        CheckBox cb = (CheckBox)v;

        Toast.makeText(CompoundActivity.this,
                "" + cb.getText(),
                Toast.LENGTH_SHORT)
                .show();
    }
}
```
