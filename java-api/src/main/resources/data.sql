INSERT INTO book (name) VALUES ('Trading_book_1');
INSERT INTO book (name) VALUES ('Trading_book_2');
INSERT INTO book (name) VALUES ('Trading_book_3');
INSERT INTO book (name) VALUES ('Trading_book_4');
INSERT INTO book (name) VALUES ('Trading_book_6');

INSERT INTO `client` (name,email,role) VALUES ('iboyles','ianboyles2@gmail.com','Analyst');
INSERT INTO `client` (name,email,role) VALUES ('neelkanth','neelkanth@gmail.com','Admin');
INSERT INTO `client` (name,email,role) VALUES ('bob','bobberson@gmail.com','No Access');
INSERT INTO `client` (name,email,role) VALUES ('nicole','nic@gmail.com','Analyst');
INSERT INTO `client` (name,email,role) VALUES ('richard','rich@gmail.com','Trader');
INSERT INTO `client` (name,email,role) VALUES ('ben','ben@gmail.com','Trader');

INSERT INTO counterparty (name) VALUES ('jeff');
INSERT INTO counterparty (name) VALUES ('john');
INSERT INTO counterparty (name) VALUES ('swetha');

INSERT INTO book_client (book_id, client_id) VALUES (1, 1),(3, 2),(2, 1);

--
--INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
--VALUES ('', 'XS1988387210', 'BNPParibasIssu 4,37% Microsoft Corp (USD)', '2021-08-05', 'USD', 1000);
--INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
--VALUES ('123456780', 'USN0280EAR64', 'Airbus 3.15% USD', '2021-07-30', 'USD', 900);
--INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
--VALUES ('123456bh0', 'A12356111', 'UBS Facebook (USD)', '2021-09-30', 'USD', 900);
--INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
--VALUES ('AMZN 3.15 08/22/27 REGS', 'USU02320AG12', 'Amazon', '2021-08-03', 'USD', 900);
--INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
--VALUES ('BDCHBW8', 'GB00B6460505', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);
--INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
--VALUES ('BDCHBW8', 'GB00B6460506', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);
--INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
--VALUES ('BDCHBW8', 'GB00B6460507', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);
--INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
--VALUES ('BDCHBW8', 'GB00B6460508', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);
--INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
--VALUES ('BDCHBW8', 'GB00B6460509', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);
--INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
--VALUES ('BDCHBW8', 'GB00B6460510', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);
--INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
--VALUES ('BDCHBW8', 'GB00B6460511', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);
--INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
--VALUES ('BDCHBW8', 'GB00B6460512', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);
--INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
--VALUES ('BDCHBW8', 'GB00B6460513', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);
--INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
--VALUES ('BDCHBW8', 'GB00B6460514', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);
--INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
--VALUES ('BDCHBW8', 'GB00B6460515', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900);
--INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
--VALUES ('','US87973RAA86', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S', '2030-12-22', 'USD', 340);
--INSERT INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
--VALUES ('', 'IE00B29LNP31', 'First Norway Alpha Kl.IV', '2030-12-22', 'USD', 340);
--
--INSERT INTO trade (book_id, security_id, counter_party_id, bond_holder, trade_type, trade_currency, quantity, trade_settlement_date, trade_status, trade_date, unit_price, coupon_percent, status_of, type_of) VALUES (1, 1, 1, 'AZ Holdings Inc', 'BUY', 'USD', 50, '2021-08-04', 'open', '2021-05-13', 90, 4.37, 'active', 'CORP');

INSERT INTO security (isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status)
VALUES
    -- Row 1
    ('XS1988387210', '', 'BNPParibasIssu 4,37% Microsoft Corp (USD)', '2021-08-05', 4.37, '', 1000, 'USD', NULL),
    -- Row 2
    ('USN0280EAR64', '123456780', 'Airbus 3.15% USD', '2021-07-30', 3.15, '', 900, 'USD', NULL),
    -- Row 3
    ('A12356111', '123456bh0', 'UBS Facebook (USD)', '2021-09-30', 2, '', 900, 'USD', NULL),
    -- Row 4
    ('USU02320AG12', 'AMZN 3.15 08/22/27 REGS', 'Amazon', '2021-08-03', 3.15, '', 900, 'USD', NULL),
    -- Row 5
    ('GB00B6460505', 'BDCHBW8', 'HM Treasury United Kingdom', '2021-08-09', 0.75, 'GBP', 900, 'GBP', NULL),
    -- Row 6
    ('GB00B6460506', 'BDCHBW8', 'HM Treasury United Kingdom', '2021-08-09', 0.75, 'GBP', 900, 'GBP', NULL),
    -- Row 7
    ('GB00B6460507', 'BDCHBW8', 'HM Treasury United Kingdom', '2021-08-09', 0.75, 'GBP', 900, 'GBP', NULL),
    -- Row 8
    ('GB00B6460508', 'BDCHBW8', 'HM Treasury United Kingdom', '2021-08-09', 0.75, 'GBP', 900, 'GBP', NULL),
    -- Row 9
    ('GB00B6460509', 'BDCHBW8', 'HM Treasury United Kingdom', '2021-08-09', 0.75, 'GBP', 900, 'GBP', NULL),
    -- Row 10
    ('GB00B6460510', 'BDCHBW8', 'HM Treasury United Kingdom', '2021-08-09', 0.75, 'GBP', 900, 'GBP', NULL),
    -- Row 11
    ('GB00B6460511', 'BDCHBW8', 'HM Treasury United Kingdom', '2021-08-09', 0.75, 'GBP', 900, 'GBP', NULL),
    -- Row 12
    ('GB00B6460512', 'BDCHBW8', 'HM Treasury United Kingdom', '2021-08-09', 0.75, 'GBP', 900, 'GBP', NULL),
    -- Row 13
    ('GB00B6460513', 'BDCHBW8', 'HM Treasury United Kingdom', '2021-08-09', 0.75, 'GBP', 900, 'GBP', NULL),
    -- Row 14
    ('GB00B6460514', 'BDCHBW8', 'HM Treasury United Kingdom', '2021-08-09', 0.75, 'GBP', 900, 'GBP', NULL),
    -- Row 15
    ('GB00B6460515', 'BDCHBW8', 'HM Treasury United Kingdom', '2021-08-09', 0.75, 'GBP', 900, 'GBP', NULL),
    -- Row 16
    ('US87973RAA86', '', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S', '2030-12-22', 1.123, 'USD', 340, 'USD', NULL),
    -- Row 17
    ('IE00B29LNP31', '', 'First Norway Alpha Kl.IV', '2030-12-22', 1.123, 'USD', 340, 'USD', NULL);


INSERT INTO trades (book_id, security_id, counterparty_id, currency, status, quantity, unit_price, buy_sell, trade_date, settlement_date)
VALUES
    -- Row 1
    (1, 1, 1, 'USD', 'open', 50, 90, 'buy', '2021-05-13 00:00:00', '2021-08-04 00:00:00'),
    -- Row 2
    (1, 2, 3, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04 00:00:00', '2021-08-04 00:00:00'),
    -- Row 3
    (2, 3, 2, 'USD', 'open', 1000, 105.775, 'buy', '2021-05-13 00:00:00', '2021-08-23 00:00:00'),
    -- Row 4
    (2, 4, 1, 'GBP', 'open', 900, 105.775, 'sell', '2021-02-04 00:00:00', '2021-09-10 00:00:00'),
    -- Row 5
    (3, 5, 2, 'USD', 'open', 50, 90, 'buy', '2021-05-13 00:00:00', '2021-08-23 00:00:00'),
    -- Row 6
    (2, 6, 3, 'USD', 'open', 1000, 105.775, 'buy', '2021-05-13 00:00:00', '2021-08-23 00:00:00'),
    -- Row 7
    (2, 7, 1, 'USD', 'open', 50, 90, 'sell', '2021-05-13 00:00:00', '2021-08-23 00:00:00'),
    -- Row 8
    (4, 8, 2, 'GBP', 'open', 60, 98.56, 'buy', '2021-02-04 00:00:00', '2021-09-27 00:00:00'),
    -- Row 9
    (4, 9, 1, 'USD', 'active', 50, 98.56, 'buy', '2012-02-04 00:00:00', '2021-08-23 00:00:00'),
    -- Row 10
    (5, 10, 2, 'GBP', 'open', 1100, 110.35, 'buy', '2021-09-27 00:00:00', '2021-09-27 00:00:00'),
    -- Row 11
    (5, 11, 1, 'GBP', 'open', 900, 110.35, 'sell', '2021-09-28 00:00:00', '2021-09-28 00:00:00'),
    -- Row 12
    (5, 12, 3, 'GBP', 'active', 2000, 110.35, 'buy', '2021-09-29 00:00:00', '2021-09-29 00:00:00'),
    -- Row 13
    (5, 13, 2, 'GBP', 'active', 2000, 110.35, 'sell', '2021-09-30 00:00:00', '2021-09-30 00:00:00'),
    -- Row 14
    (5, 14, 1, 'GBP', 'active', 1000, 110.35, 'buy', '2021-10-01 00:00:00', '2021-10-01 00:00:00'),
    -- Row 15
    (5, 15, 2, 'GBP', 'active', 900, 110.35, 'buy', '2019-10-02 00:00:00', '2019-10-02 00:00:00'),
    -- Row 16
    (5, 16, 1, 'GBP', 'active', 1900, 110.35, 'sell', '2019-10-03 00:00:00', '2019-10-03 00:00:00'),
    -- Row 17
    (5, 17, 3, 'GBP', 'active', 600, 110.35, 'buy', '2018-10-04 00:00:00', '2018-10-04 00:00:00'),
    -- Row 18
    (5, 17, 1, 'GBP', 'active', 600, 110.35, 'buy', '2019-10-05 00:00:00', '2019-10-05 00:00:00'),
    -- Row 19
    (5, 17, 2, 'GBP', 'active', 700, 110.35, 'buy', '2021-06-06 00:00:00', '2021-06-06 00:00:00'),
    -- Row 20
    (5, 17, 1, 'GBP', 'active', 1300, 110.35, 'sell', '2021-10-07 00:00:00', '2011-10-07 00:00:00'),
    -- Row 21
    (4, 17, 3, 'USD', 'active', 60, 100.13, 'buy', '2021-09-27 00:00:00', '2012-04-02 00:00:00'),
    -- Row 22
    (4, 17, 1, 'USD', 'active', 50, 100.13, 'buy', '2021-08-23 00:00:00', '2012-08-23 00:00:00'),
    -- Row 23
    (4, 17, 2, 'USD', 'active', 75, 100.13, 'buy', '2021-09-27 00:00:00', '2013-04-02 00:00:00'),
    -- Row 24
    (4, 17, 3, 'USD', 'active', 50, 100.13, 'buy', '2021-08-23 00:00:00', '2014-08-23 00:00:00'),
    -- Row 25
    (4, 17, 1, 'USD', 'active', 300, 98.76, 'buy', '2021-09-27 00:00:00', '2016-04-02 00:00:00'),
    -- Row 26
    (4, 17, 2, 'USD', 'active', 300, 98.76, 'buy', '2021-08-23 00:00:00', '2012-08-23 00:00:00'),
    -- Row 27
    (4, 17, 1, 'USD', 'active', 300, 98.76, 'buy', '2021-09-27 00:00:00', '2013-04-02 00:00:00'),
    -- Row 28
    (4, 17, 3, 'USD', 'active', 300, 98.76, 'sell', '2021-08-23 00:00:00', '2015-08-23 00:00:00');
