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
    category    varchar2(50)    check (category in('��õ�޴�', 'ġŲ��Ʈ', '���ż�Ʈ', '�������̵�', '����', '�ּҵ��')),
    memo        varchar2(255)   not null,
    imgPath     varchar2(100)   not null,
    deleteck    varchar2(10)    check (deleteck in ('yes','no'))
);
    
insert into kfc_menu(name, price, category, memo, imgPath, deleteck)
values('�����׽����޺�', '12,900', '��õ�޴�', '����������ġŲ2+���������׺���ġŲ2+�ݶ�M', '�����׽����޺�.png', 'yes');

insert into kfc_menu(name, price, category, memo, imgPath, deleteck)
values('2�κа���1����', '14,900', 'ġŲ��Ʈ', '�����Ĺ����÷���+Ʈ������+�ٴ�4+�ڿｽ��+�ݶ�M', '2�κа���1����.png', 'no');

insert into kfc_menu(name, price, category, memo, imgPath, deleteck)
values('�����Ÿ޴���', '17,900', '���ż�Ʈ', '���������׺���ġŲ2+���������+�Ұ�����+ĸġ��ʹ��+�ݶ�M2', '�����Ÿ޴���.png', 'yes');

insert into kfc_menu(name, price, category, memo, imgPath, deleteck)
values('����Ʈ������', '18,900', '���ż�Ʈ', 'Ÿ������+¡�Ź���+����ġŲ+��������ġŲ+�߲���Ƣ��(���ҽ�)', '����Ʈ������.png', 'no');

insert into kfc_menu(name, price, category, memo, imgPath, deleteck)
values('ġŲ������Ƽ��', '23,900', '���ż�Ʈ', '¡�Ź���+�Ұ�����+Ÿ������+��������ġŲ2+�ٴ�4+�ݶ�M3', 'ġŲ������Ƽ��.png', 'yes');

insert into kfc_menu(name, price, category, memo, imgPath, deleteck)
values('���������׺���ġŲ 8����', '26,000', 'ġŲ��Ʈ', 'ġŲ����Ʈ 1+1 ����', '���������׺���ġŲ 8����.png', 'yes');

commit;
