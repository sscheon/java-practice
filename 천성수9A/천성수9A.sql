drop table kfc_menu purge;
drop sequence kfc_menu_seq;

create SEQUENCE kfc_menu_seq
    start with 1
    increment by 1
    maxvalue 9999
    nocache
    nocycle;
    
create table kfc_menu (
    idx         number          default kfc_menu_seq.nextval primary key,
    name        varchar2(100)   not null,
    price       varchar2(100)   not null,
    category    varchar2(50)    check (category in('추천메뉴', '치킨세트', '버거세트', '스낵사이드', '음료', '주소등록')),
    memo        varchar2(255)   not null,
    imgPath     varchar2(100)   not null,
    deleteck    varchar2(10)    check (deleteck in ('yes','no'))
);
    
insert into kfc_menu(name, price, category, memo, imgPath, deleteck)
values('스노잉시즌콤보', '12,900', '추천메뉴', '갈릭스노잉치킨2+갈릭스노잉블랙라벨치킨2+콜라M', '스노잉시즌콤보.png', 'yes');

insert into kfc_menu(name, price, category, memo, imgPath, deleteck)
values('2인분같은1인팩', '14,900', '치킨세트', '스콜쳐버거플러스+트위스터+텐더4+코울슬로+콜라M', '2인분같은1인팩.png', 'no');

insert into kfc_menu(name, price, category, memo, imgPath, deleteck)
values('알찬신메뉴팩', '17,900', '버거세트', '갈릭스노잉블랙라벨치킨2+골든까르보버거+불고기버거+캡치즈꽈배기+콜라M2', '알찬신메뉴팩.png', 'yes');

insert into kfc_menu(name, price, category, memo, imgPath, deleteck)
values('베스트셀러팩', '18,900', '버거세트', '타워버거+징거버거+블랙라벨치킨+갓양념블랙라벨치킨+닭껍질튀김(살사소스)', '베스트셀러팩.png', 'no');

insert into kfc_menu(name, price, category, memo, imgPath, deleteck)
values('치킨버거파티팩', '23,900', '버거세트', '징거버거+불고기버거+타워버거+갓양념블랙라벨치킨2+텐더4+콜라M3', '치킨버거파티팩.png', 'yes');

insert into kfc_menu(name, price, category, memo, imgPath, deleteck)
values('갈릭스노잉블랙라벨치킨 8조각', '26,000', '치킨세트', '치킨나이트 1+1 제외', '갈릭스노잉블랙라벨치킨 8조각.png', 'yes');

commit;
