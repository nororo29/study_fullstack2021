## Day51
2021.07.26

### ✔ 선택자의 종류
- ### $(".xxx")
- ### $("#xxx")
- ### $("태그명")
  - ex. `$("li")`
- ### $("*")
  - ex. `$("[name='memRegForm'] *")`  
    name="memRegForm" 속성을 가진 태그의 모든 **후손** 태그

<hr>

- ### $("선택자1 선택자2")
  - 선택자1이 가리키는 태그의 **자손** 중 선택자2가 가리키는 태그
  ```
  ex. $(".xxx:checked")   // class=xxx를 가진 태그 중 체크된 태그
  ex. $(".xxx :checked")  // class=xxx를 가진 태그 **자손** 중 체크된 태그
  ```
- ### $("선택자1,선택자2") 
  - 선택자1이 가리키는 태그와 선택자2가 가리키는 태그
- ### $("선택자1>선택자2")
  - 선택자1이 가리키는 태그의 **자식** 중 선택자2 가 가리키는 태그

<hr>

- ### $("[태그속성명='xxx']")
  - 태그속성명='xxx'을 가진 태그
  - ex. `$("[name='mem_id']")` `$("[type='radio']")`
- ### $("[태그속성명!='xxx']")
  - 태그속성명='xxx'을 가지고 있지 않는 태그
- ### $("[태그속성명^='xxx']")
  - 태그속성명이 xxx 로 시작하는 태그
  - ex. `$("[name^='mem_']")`
- ### $("[태그속성명$='xxx']")
  - 태그속성명이 xxx 로 끝나는 태그
  - ex. `ex. $("[name$='name']")`
- ### $("[태그속성명*='xxx']")
  - 태그속성값으로 xxx 를 포함한 태그

<hr>

- ### $("선택자:first")
  - 선택자가 가리키는 태그 중 첫 번째 태그
  - ex. `$(".gender:first")`
- ### $("선택자:last")
  - 선택자가 가리키는 태그 중 마지막 태그
- ### $("선택자:odd")
  - 선택자가 가리키는 태그 중 인덱스 번호가 홀수인 태그
- ### $("선택자:even")
  - 선택자가 가리키는 태그 중 인덱스 번호가 짝수인 태그
- ### $("선택자:eq(i)")
  - 선택자가 가리키는 태그 중 인덱스 번호가 i 인 태그

<hr>

- ### $("선택자:first-child")
  - 선택자가 가리키는 태그 중 **각 태그의 부모 입장**에서 첫번째 태그
  - #### $(".student td:first-child")
  - #### $(".student td:last-child")
  - #### $(".student td:nth-child(n)")
  - #### $(".student td:nth-child(odd)")
  - #### $(".student td:nth-child(even)")
  - #### $(".student td:gt(2)")  *인덱스 2번 이후(크거나 같은*
  - #### $(".student td:lt(2)")  *인덱스 2번 작은*

<hr>

- ### $("선택자1:has(선택자2)")
  - 선택자1 가리키는 태그 중 **자손**으로 선택자2 요소를 가진 **선택자1** 태그
    ```
    <div class="movie">
      <span class="action">삼국지</span>
    </div>
    <div class="movie">
      <span class="sf">인터스텔라</span>
    </div>
    <div class="movie">
      <span class="marvel">블랙위도우</span>
    </div>
    ```
  - ex. `$(".movie:has(.marvel)")` // 3번째 div 태그를 관리
  
- ### $("선택자1:contains('문자열')")
  - 선택자1 가리키는 태그 중 '문자열'을 내포하고 있는 태그
  - ex. `$(".movie:contains('인터스텔라')")`  // 2번째 div 태그를 관리
  - 
- ### $("선택자1:not(선택자2)")
  - 선택자1 가리키는 태그 중 선택자2가 가리키는 태그가 아닌 태그
  - ex. `$( ".hobby:not(":checked")" )` 

<hr>

- ### input type 관련 선택자
  - $(":text")
  - $(":password")
  - $(":checkbox")
  - $(":radio")
  - $(":file")
  - $(":button")
  - $(":submit")
  - $(":reset")
 
- ### 속성 관련 선택자
  - $(":checked")
  - $(":focus")
  - $(":disabled")
  - $(":enabled")
  - $(":visible")
  - $(":hidden")


