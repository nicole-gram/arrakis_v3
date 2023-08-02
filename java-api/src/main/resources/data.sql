INSERT INTO users (u_name) VALUES ('iboyles');
INSERT INTO users (u_name) VALUES ('bob');

INSERT INTO book (book_name) VALUES ('Trading_book_1');
INSERT INTO book (book_name) VALUES ('Trading_book_2');
INSERT INTO book (book_name) VALUES ('Trading_book_3');
INSERT INTO book (book_name) VALUES ('Trading_book_4');
INSERT INTO book (book_name) VALUES ('Trading_book_6');

INSERT INTO book_user (book_id, u_id) VALUES (1, 1),(1, 2),(2, 1);

INSERT INTO counter_party (counter_party_id) VALUES (1);
INSERT INTO counter_party (counter_party_id) VALUES (2);

INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
VALUES ('', 'XS1988387210', 'BNPParibasIssu 4,37% Microsoft Corp (USD)', '2021-08-05', 'USD', 1000);

INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
VALUES ('123456780', 'USN0280EAR64', 'Airbus 3.15% USD', '2021-07-30', 'USD', 900);

INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
VALUES ('123456bh0', 'A12356111', 'UBS Facebook (USD)', '2021-09-30', 'USD', 900);

INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
VALUES ('AMZN 3.15 08/22/27 REGS', 'USU02320AG12', 'Amazon', '2021-08-03', 'USD', 900);

INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
VALUES ('BDCHBW8', 'GB00B6460505', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);

INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
VALUES ('BDCHBW8', 'GB00B6460506', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);

INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
VALUES ('BDCHBW8', 'GB00B6460507', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);

INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
VALUES ('BDCHBW8', 'GB00B6460508', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);

INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
VALUES ('BDCHBW8', 'GB00B6460509', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);

INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
VALUES ('BDCHBW8', 'GB00B6460510', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);

INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
VALUES ('BDCHBW8', 'GB00B6460511', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);

INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
VALUES ('BDCHBW8', 'GB00B6460512', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);

INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
VALUES ('BDCHBW8', 'GB00B6460513', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);

INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
VALUES ('BDCHBW8', 'GB00B6460514', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);

INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
VALUES ('BDCHBW8', 'GB00B6460515', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);

INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
VALUES ('','US87973RAA86', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S', '2030-12-22', 'USD', 340);

INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
VALUES ('', 'IE00B29LNP31', 'First Norway Alpha Kl.IV', '2030-12-22', 'USD', 340);

INSERT INTO trade (book_id, security_id, counter_party_id, bond_holder, trade_type, trade_currency, quantity, trade_settlement_date, trade_status, trade_date, unit_price, coupon_percent, status_of, type_of) VALUES (1, 1, 1, 'AZ Holdings Inc', 'BUY', 'USD', 50, '2021-08-04', 'open', '2021-05-13', 90, 4.37, 'active', 'CORP');
