INSERT INTO users (u_name) VALUES ('iboyles');

INSERT INTO book (book_name)VALUES ('Trading_book_1');
INSERT INTO book (book_name) VALUES ('Trading_book_2');
INSERT INTO book (book_name) VALUES ('Trading_book_3');
INSERT INTO book (book_name) VALUES ('Trading_book_4');
INSERT INTO book (book_name) VALUES ('Trading_book_6');

INSERT INTO security (cusip,isin,issuer_name, bond_maturity_date,bond_currency,face_value) VALUES ('','XS1988387210','BNPParibasIssu 4,37% Microsoft Corp (USD)','2021-08-05','USD',1000);
INSERT INTO security (cusip,isin,issuer_name, bond_maturity_date,bond_currency,face_value) VALUES ('','XS1988387210','BNPParibasIssu 4,37% Microsoft Corp (USD)','2021-08-05','USD',1000);
INSERT INTO security (cusip,isin,issuer_name, bond_maturity_date,bond_currency,face_value) VALUES ('123456780','USN0280EAR64','Airbus 3.15%  USD','2021-07-30','USD',900);
INSERT INTO security (cusip,isin,issuer_name, bond_maturity_date,bond_currency,face_value) VALUES ('123456780','USN0280EAR64','Airbus 3.15%  USD','2021-07-30','USD',900);
INSERT INTO security (cusip,isin,issuer_name, bond_maturity_date,bond_currency,face_value) VALUES ('123456bh0','A12356111','UBS Facebook (USD)','2021-09-30','USD',900);
INSERT INTO security (cusip,isin,issuer_name, bond_maturity_date,bond_currency,face_value) VALUES ('123456780','USN0280EAR64','Airbus 3.15%  USD','2021-07-30','USD',900);

INSERT INTO trade (bond_holder,trade_type,trade_currency,quantity,trade_settlement_date,trade_status,trade_date,unit_price,coupon_percent,status_of,type_of) VALUES ('AZ Holdings Inc','BUY','USD',50, '2021-08-04','open','2021-05-13',90,4.37,'active','CORP');


