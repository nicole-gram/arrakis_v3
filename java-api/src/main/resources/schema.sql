CREATE TABLE book (
    book_id INT PRIMARY KEY,
    book_name VARCHAR(255),
);

CREATE TABLE user (
    user_id INT PRIMARY KEY,
    user_name VARCHAR(50)
);

CREATE TABLE book_user (
    book_id INT,
    user_id INT,
    PRIMARY KEY (book_id, user_id),
    FOREIGN KEY (book_id) REFERENCES book(book_id),
    FOREIGN KEY (user_id) REFERENCES user(user_id)
);

CREATE TABLE trade (
    trade_id INT PRIMARY KEY,
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
    unit_price DECIMAL(18, 2),
    coupon_percent DECIMAL(5, 2),
    bond_currency VARCHAR(3),
    cusip VARCHAR(50),
    face_value DECIMAL(18, 2),
    isin VARCHAR(50),
    issuer_name VARCHAR(255),
    bond_maturity_date DATE,
    status VARCHAR(50),
    type VARCHAR(50),
    FOREIGN KEY (book_id) REFERENCES book(book_id),
    FOREIGN KEY (security_id) REFERENCES security(security_id),
    FOREIGN KEY (counter_party_id) REFERENCES counter_party(counter_party_id)
    -- Add other relevant columns for the trade entity
    -- ...
);

CREATE TABLE security (
    security_id INT PRIMARY KEY
    -- Add other relevant columns for the security entity
    -- ...
);

CREATE TABLE counter_party (
    counter_party_id INT PRIMARY KEY
    -- Add other relevant columns for the counter_party entity
    -- ...
);

