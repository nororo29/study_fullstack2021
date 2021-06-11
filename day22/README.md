## Day22
2021.06.11

### Oracle

#### 자료형
- 문자형 : CHAR(s), VARCHAR2(s)
- 숫자형 : NUMBER(p, s)
- 날짜형 : DATE
  - to_char / to_date / to_number

#### 제약조건
- NOT NULL : 반드시 입력
- UNIQUE : 중복x
- DEFAULT : 기본으로 들어가는 값
- CHECK : 지정한 데이터만
- PRIMARY KEY (PK) : not null, unique / 테이블당 0~1개
- FOREIGN KEY (FK) : PK 참조 / null 가능 / 테이블당 0개 이상

행 삭제 - PK가 FK로 참조되고 있으면 그 record먼저 삭제해줘야 삭제가능. 
