INSERT INTO users (u_id,u_name) VALUES (1,'iboyles');

INSERT INTO book (book_id,book_name) VALUES (1,'Trading_book_1');
INSERT INTO book (book_id,book_name) VALUES (2,'Trading_book_2');
INSERT INTO book (book_id,book_name) VALUES (3,'Trading_book_3');
INSERT INTO book (book_id,book_name) VALUES (4,'Trading_book_4');
INSERT INTO book (book_id,book_name) VALUES (5,'Trading_book_6');



INSERT INTO trade (trade_type, trade_currency, quantity, trade_settlement_date, trade_status, trade_date, unit_price, coupon_percent, bond_currency, cusip, face_value, isin, issuer_name, bond_maturity_date, status_of, type_of, book_name, bond_holder) VALUES ('buy', 'USD', 50, '2021-04-08', 'open', '2022-01-05', 90, 4.37, 'USD', '', 1000, 'XS1988387210', 'BNPParibasIssu 4,37% Microsoft Corp (USD)', '2021-05-08', 'active', 'CORP', 'trading_book_1', 'AZ Holdings Inc');
