INSERT IGNORE INTO security (cusip, isin, issuer_name, bond_maturity_date, bond_currency, face_value)
VALUES
    -- Row 1
    ('', 'XS1988387210', 'BNPParibasIssu 4,37% Microsoft Corp (USD)', '2021-08-05', 'USD', 1000),
    -- Row 2
    ('', 'XS1988387210', 'BNPParibasIssu 4,37% Microsoft Corp (USD)', '2021-08-05', 'USD', 1000),
    -- Row 3
    ('123456780', 'USN0280EAR64', 'Airbus 3.15% USD', '2021-07-30', 'USD', 900),
    -- Row 4
    ('123456780', 'USN0280EAR64', 'Airbus 3.15% USD', '2021-07-30', 'USD', 900),
    -- Row 5
    ('123456bh0', 'A12356111', 'UBS Facebook (USD)', '2021-09-30', 'USD', 900),
    -- Row 6
    ('123456780', 'USN0280EAR64', 'Airbus 3.15% USD', '2021-07-30', 'USD', 900),
    -- Row 7
    ('123456bh0', 'A12356111', 'UBS Facebook (USD)', '2021-09-30', 'USD', 900),
    -- Row 8
    ('AMZN 3.15 08/22/27 REGS', 'USU02320AG12', 'Amazon', '2021-08-03', 'USD', 900),
    -- Row 9
    ('AMZN 3.15 08/22/27 REGS', 'USU02320AG12', 'Amazon', '2021-08-03', 'USD', 900),
    -- Row 10
    ('BDCHBW8', 'GB00B6460505', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900),
    -- Row 11
    ('BDCHBW8', 'GB00B6460506', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900),
    -- Row 12
    ('BDCHBW8', 'GB00B6460507', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900),
    -- Row 13
    ('BDCHBW8', 'GB00B6460508', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900),
    -- Row 14
    ('BDCHBW8', 'GB00B6460509', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900),
    -- Row 15
    ('BDCHBW8', 'GB00B6460510', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900),
    -- Row 16
    ('BDCHBW8', 'GB00B6460511', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900),
    -- Row 17
    ('BDCHBW8', 'GB00B6460512', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900),
    -- Row 18
    ('BDCHBW8', 'GB00B6460513', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900),
    -- Row 19
    ('BDCHBW8', 'GB00B6460514', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900),
    -- Row 20
    ('BDCHBW8', 'GB00B6460515', 'HM Treasury United Kingdom', '2021-08-09', 'GBP', 900),
    -- Row 21
    ('US87973RAA86', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S', '2030-12-22', 'USD', 340),
    -- Row 22
    ('US87973RAA86', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S', '2030-12-22', 'USD', 340),
    -- Row 23
    ('US87973RAA86', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S', '2030-12-22', 'USD', 340),
    -- Row 24
    ('US87973RAA86', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S', '2030-12-22', 'USD', 340),
    -- Row 25
    ('IE00B29LNP31', 'First Norway Alpha Kl.IV', '2030-12-22', 'USD', 340),
    -- Row 26
    ('IE00B29LNP31', 'First Norway Alpha Kl.IV', '2030-12-22', 'USD', 340),
    -- Row 27
    ('IE00B29LNP31', 'First Norway Alpha Kl.IV', '2030-12-22', 'USD', 340),
    -- Row 28
    ('IE00B29LNP31', 'First Norway Alpha Kl.IV', '2030-12-22', 'USD', 340);
INSERT INTO trade (bond_holder, trade_type, trade_currency, quantity, trade_settlement_date, trade_status, trade_date, unit_price, coupon_percent, bond_currency, cusip, face_value, isin, issuer_name, bond_maturity_date, status, type, book_name)
VALUES
    -- Row 1
    ('AZ Holdings Inc', 'buy', 'USD', 50, '2021-08-04', 'open', '2021-05-13', 90, 4.37, 'USD', 'XS1988387210', 1000, 'BNPParibasIssu 4,37% Microsoft Corp (USD)', '2021-08-05', 'active', 'CORP', 'trading_book_1'),
    -- Row 2
    ('AZ Holdings Inc', 'sell', 'GBP', 40, '2021-08-04', 'open', '2021-02-04', 89.56, 4.37, 'USD', 'XS1988387210', 1000, 'BNPParibasIssu 4,37% Microsoft Corp (USD)', '2021-08-05', 'active', 'CORP', 'trading_book_1'),
    -- Row 3
    ('Acme co', 'buy', 'USD', 1000, '2021-08-23', 'open', '2021-05-13', 105.775, 3.15, 'USD', '123456780', 900, 'USN0280EAR64', 'Airbus 3.15% USD', '2021-07-30', 'active', 'CORP', 'trading_book_2'),
    -- Row 4
    ('Acme Co', 'sell', 'GBP', 900, '2021-09-10', 'open', '2021-02-04', 105.775, 3.15, 'USD', '123456780', 900, 'USN0280EAR64', 'Airbus 3.15% USD', '2021-07-30', 'active', 'CORP', 'trading_book_2'),
    -- Row 5
    ('Sovereign Investments', 'buy', 'USD', 50, '2021-08-23', 'open', '2021-05-13', 90, 2, 'USD', '123456bh0', 900, 'A12356111', 'UBS Facebook (USD)', '2021-09-30', 'active', 'CORP', 'Trading_book_3'),
    -- Row 6
    ('Astra Trading Ltd', 'buy', 'USD', 1000, '2021-08-23', 'open', '2021-05-13', 105.775, 3.15, 'USD', '123456780', 900, 'USN0280EAR64', 'Airbus 3.15% USD', '2021-07-30', 'active', 'CORP', 'trading_book_2'),
    -- Row 7
    ('Sovereign Investments', 'sell', 'USD', 50, '2021-08-23', 'open', '2021-05-13', 90, 2, 'USD', '123456bh0', 900, 'A12356111', 'UBS Facebook (USD)', '2021-09-30', 'active', 'CORP', 'Trading_book_2'),
    -- Row 8
    ('Muncipal Gov Of Orange County', 'buy', 'GBP', 60, '2021-09-27', 'open', '2021-02-04', 98.56, 3.15, 'USD', 'AMZN 3.15 08/22/27 REGS', 900, 'USU02320AG12', 'Amazon', '2021-08-03', 'active', 'CORP', 'Trading_book_4'),
    -- Row 9
    ('Muncipal Gov Of Orange County', 'buy', 'USD', 50, '2021-08-23', 'open', '2022-08-23', 98.56, 3.15, 'USD', 'AMZN 3.15 08/22/27 REGS', 900, 'USU02320AG12', 'Amazon', '2021-08-03', 'active', 'CORP', 'Trading_book_4'),
    -- Row 10
    ('Muncipal Gov Of Orange County', 'buy', 'USD', 75, '2021-09-27', 'open', '2013-02-04', 100.13, 2.02, 'USD', '87973RAA8', 690, 'US87973RAA86', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S', '2030-12-22', 'active', 'SOVN', 'Trading_book_4'),
    -- Row 11
    ('Muncipal Gov Of Orange County', 'buy', 'USD', 50, '2021-08-23', 'open', '2014-08-23', 100.13, 2.02, 'USD', '87973RAA8', 690, 'US87973RAA86', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S', '2030-12-22', 'active', 'SOVN', 'Trading_book_4'),
    -- Row 12
    ('Zurich Pension fund 4', 'buy', 'USD', 300, '2021-09-27', 'open', '2016-02-04', 98.76, 1.123, 'USD', '87973RAA8', 340, 'IE00B29LNP31', 'First Norway Alpha Kl.IV', '2030-12-22', 'active', 'SOVN', 'Trading_book_4'),
    -- Row 13
    ('Zurich Pension fund 4', 'buy', 'USD', 300, '2021-08-23', 'open', '2012-08-23', 98.76, 1.123, 'USD', '87973RAA8', 340, 'IE00B29LNP31', 'First Norway Alpha Kl.IV', '2030-12-22', 'active', 'SOVN', 'Trading_book_4'),
    -- Row 14
    ('Zurich Pension fund 4', 'buy', 'USD', 300, '2021-09-27', 'open', '2013-02-04', 98.76, 1.123, 'USD', '87973RAA8', 340, 'IE00B29LNP31', 'First Norway Alpha Kl.IV', '2030-12-22', 'active', 'SOVN', 'Trading_book_4'),
    -- Row 15
    ('Zurich Pension fund 4', 'sell', 'USD', 300, '2021-08-23', 'open', '2015-08-23', 98.76, 1.123, 'USD', '87973RAA8', 340, 'IE00B29LNP31', 'First Norway Alpha Kl.IV', '2030-12-22', 'active', 'SOVN', 'Trading_book_4'),
    -- Row 16
    ('Goldman Sachs', 'buy', 'GBP', 1100, '2021-09-27', 'open', '2021-09-27', 110.35, 0.75, 'GBP', 'BDCHBW8', 900, 'GB00B6460505', 'HM Treasury United Kingdom', '2021-08-09', 'active', 'GOVN', 'Trading_book_6'),
    -- Row 17
    ('Goldman Sachs', 'sell', 'GBP', 900, '2021-09-28', 'open', '2021-09-28', 110.35, 0.75, 'GBP', 'BDCHBW8', 900, 'GB00B6460506', 'HM Treasury United Kingdom', '2021-08-09', 'active', 'GOVN', 'Trading_book_6'),
    -- Row 18
    ('UBS', 'buy', 'GBP', 2000, '2021-09-29', 'open', '2021-09-29', 110.35, 0.75, 'GBP', 'BDCHBW8', 900, 'GB00B6460507', 'HM Treasury United Kingdom', '2021-08-09', 'active', 'GOVN', 'Trading_book_6'),
    -- Row 19
    ('UBS', 'sell', 'GBP', 2000, '2021-09-30', 'open', '2021-09-30', 110.35, 0.75, 'GBP', 'BDCHBW8', 900, 'GB00B6460508', 'HM Treasury United Kingdom', '2021-08-09', 'active', 'GOVN', 'Trading_book_6'),
    -- Row 20
    ('Barclays', 'buy', 'GBP', 1000, '2021-10-01', 'open', '2021-10-01', 110.35, 0.75, 'GBP', 'BDCHBW8', 900, 'GB00B6460509', 'HM Treasury United Kingdom', '2021-08-09', 'active', 'GOVN', 'Trading_book_6'),
    -- Row 21
    ('Barclays', 'buy', 'GBP', 900, '2019-10-02', 'open', '2019-10-02', 110.35, 0.75, 'GBP', 'BDCHBW8', 900, 'GB00B6460510', 'HM Treasury United Kingdom', '2021-08-09', 'active', 'GOVN', 'Trading_book_6'),
    -- Row 22
    ('Barclays', 'sell', 'GBP', 1900, '2019-10-03', 'open', '2019-10-03', 110.35, 0.75, 'GBP', 'BDCHBW8', 900, 'GB00B6460511', 'HM Treasury United Kingdom', '2021-08-09', 'active', 'GOVN', 'Trading_book_6'),
    -- Row 23
    ('British Telecom', 'buy', 'GBP', 600, '2018-10-04', 'open', '2018-10-04', 110.35, 0.75, 'GBP', 'BDCHBW8', 900, 'GB00B6460512', 'HM Treasury United Kingdom', '2021-08-09', 'active', 'GOVN', 'Trading_book_6'),
    -- Row 24
    ('Pension Holdings', 'buy', 'GBP', 600, '2019-10-05', 'open', '2019-10-05', 110.35, 0.75, 'GBP', 'BDCHBW8', 900, 'GB00B6460513', 'HM Treasury United Kingdom', '2021-08-09', 'active', 'GOVN', 'Trading_book_6'),
    -- Row 25
    ('Pension Holdings', 'buy', 'GBP', 700, '2021-06-06', 'open', '2021-06-06', 110.35, 0.75, 'GBP', 'BDCHBW8', 900, 'GB00B6460514', 'HM Treasury United Kingdom', '2021-08-09', 'active', 'GOVN', 'Trading_book_6'),
    -- Row 26
    ('Pension Holdings', 'sell', 'GBP', 1300, '2011-10-07', 'open', '2011-10-07', 110.35, 0.75, 'GBP', 'BDCHBW8', 900, 'GB00B6460515', 'HM Treasury United Kingdom', '2021-08-09', 'active', 'GOVN', 'Trading_book_6'),
    -- Row 27
    ('Zurich Pension fund 4', 'buy', 'USD', 60, '2021-09-27', 'open', '2012-02-04', 100.13, 2.02, 'USD', '87973RAA8', 690, 'US87973RAA86', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S', '2021-08-06', 'active', 'SOVN', 'Trading_book_4'),
    -- Row 28
    ('Zurich Pension fund 4', 'buy', 'USD', 50, '2021-08-23', 'open', '2012-08-23', 100.13, 2.02, 'USD', '87973RAA8', 690, 'US87973RAA86', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S', '2021-08-06', 'active', 'SOVN', 'Trading_book_4');


