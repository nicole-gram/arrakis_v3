drop schema if exists bonds;
CREATE schema bonds;
USE bonds;

CREATE TABLE book (
    book_id INT AUTO_INCREMENT PRIMARY KEY,
    book_name VARCHAR(255)
);

CREATE TABLE users (
    u_id INT AUTO_INCREMENT PRIMARY KEY,
    u_name VARCHAR(50)
);

CREATE TABLE counter_party (
    counter_party_id INT AUTO_INCREMENT PRIMARY KEY
);

CREATE TABLE security (
    security_id INT AUTO_INCREMENT PRIMARY KEY,
    cusip VARCHAR(50),
    isin VARCHAR(50),
    issuer_name VARCHAR(255),
    bond_maturity_date DATE,
    bond_currency VARCHAR(3),
    face_value INT
);

CREATE TABLE book_user (
    book_id INT,
    u_id INT ,
    PRIMARY KEY (book_id, u_id),
    FOREIGN KEY (book_id) REFERENCES book(book_id),
    FOREIGN KEY (u_id) REFERENCES users(u_id)
);

CREATE TABLE trade (
    trade_id INT AUTO_INCREMENT PRIMARY KEY,
    book_id INT,
    security_id INT,
    counter_party_id INT,
    bond_holder VARCHAR(255),
    trade_type VARCHAR(50),
    trade_currency VARCHAR(3),
    quantity INT,
    trade_settlement_date DATE,
    trade_status VARCHAR(50),
    trade_date DATE,
    unit_price DECIMAL(6, 3),
    coupon_percent DECIMAL(5, 4),
    status_of VARCHAR(50),
    type_of VARCHAR(50),
    FOREIGN KEY (book_id) REFERENCES book(book_id),
    FOREIGN KEY (security_id) REFERENCES security(security_id),
    FOREIGN KEY (counter_party_id) REFERENCES counter_party(counter_party_id)
);


