

CREATE TABLE CADENAS(
BRAND_ID NUMBER(2) PRIMARY KEY,
BRAND_NAME VARCHAR (20)
);

CREATE TABLE PRICES (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    BRAND_ID INT,
    FOREIGN KEY (BRAND_ID) REFERENCES CADENAS(BRAND_ID),
    START_DATE DATETIME,
    END_DATE DATETIME,
    PRICE_LIST INT,
    PRODUCT_ID INT,
    PRIORITY INT,
    PRICE DECIMAL(10,2),
    CURR VARCHAR(3)
);
