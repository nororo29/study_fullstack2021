## Day30
2021.06.23

- group by
- group by ~ having ~

---

- add_months함수로 20년 5개월10일 후 구하기
`ADD_MONTHS(hire_date, 5 + 20 * 12) + 10`
- interval 함수 ex.`hire_date + (interval '20' year)`

---

- join과 group by
  - count(*) 조심하기, 이왕이면 컬럼명으로 count
  - outer join 과 group by... null값인 그룹도 나올 수 있게
