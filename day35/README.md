## Day35
2021.06.30

### 게시판 테이블 구조
```
CREATE TABLE board (
-- PK
					b_no					NUMBER(9)																-- 게시판 글 고유번호

-- 직접입력
					, subject 			VARCHAR2(50)				NOT NULL						-- 글 제목
					, writer 				VARCHAR2(30)				NOT NULL						-- 글쓴이
					, content				VARCHAR2(2000)			NOT NULL						-- 글 내용
					, pwd						VARCHAR2(12)				NOT NULL						-- 암호
					, email					VARCHAR2(30)														-- 이메일

-- 자동입력
					, reg_date			DATE								DEFAULT SYSDATE			-- 등록일
					, readcount			NUMBER(5)						DEFAULT 0						-- 조회수

-- 정렬위해 **
					, group_no			NUMBER(9)						NOT NULL						-- 게시판 글의 소속 그룹번호     **서브쿼리사용
					, print_no			NUMBER(9)						NOT NULL						-- 같은 그룹 내에 출력순서번호   **서브쿼리사용

					, print_level		NUMBER(9)						NOT NULL						-- 같은 그룹 내에 댓글 들여쓰기 레벨 번호 (부모, 자식관계)

					, PRIMARY KEY(b_no)
)
```

