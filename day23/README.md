## Day23
2021.06.14

- 시퀀스(sequence)
- system계정과 동일한 권한을 가진 계정 만들기, 권한부여
  - create user 이름 identified by 비번;
  - grant connect,resource,dba to 이름;
- 테이블 
  - create table 테이블명 (...);
  - insert into 테이블명(컬럼명...) values(값...);
  - drop table 테이블명;
  - 날짜 데이터 입력할 때 : `alter session set nls_date_format = 'yyyy-mm-dd';`
  - FK 제약 조건 이름주기 : `constraint 제약조건명 foreign key(컬럼명) references 참조테이블(참조컬럼)`
    - FK 제약조건 끄기 : `alter table 테이블명 disable constraint 제약조건명;`
    - FK 제약조건 키기 : `alter table 테이블명 enable constraint 제약조건명;`
  - commit : commit전은 가상의 작업, 인정(commit)을 해줘야 함
