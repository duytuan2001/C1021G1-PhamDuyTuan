DROP DATABASE demo_sql;
CREATE DATABASE demo_sql;

USE demo_sql;

CREATE TABLE Products (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    productCode VARCHAR(50),
    productName VARCHAR(40),
    productPrice DOUBLE,
    productAmount INT,
    productDescription VARCHAR(100),
    productStatus VARCHAR(100)
);

INSERT INTO Products (
productCode,
productName,
productPrice,
productAmount,
productDescription,
productStatus )
VALUES
('A52',		  'SAMSUNG', 40000,    10,	'Nhập Khẩu',	'New'),
('F7 pro',	  'OPPO',	 200000,	4,	'Xuất Khẩu',	'Old'),
('Iphone 14', 'APPLE',	 60000,		4,	'Xuất Khẩu',	'New'),
('Mi 11 5G',  'XIAOMI',	 120000,	9,	'Xuất Khẩu',	'Old'),
('ROG 5G',	  'ASUS',	 180000,	3,	'Nhập Khẩu',	'New');
SELECT * FROM Products;

-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
CREATE UNIQUE INDEX index_product_code ON Products (productCode);

-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
CREATE INDEX pr_name_price ON Products ( productName, productPrice);

-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
EXPLAIN SELECT * FROM Products WHERE productCode = 'ROG 5G';

-- So sánh câu truy vấn trước và sau khi tạo index
DROP INDEX index_product_code ON Products;

-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
CREATE VIEW product_view AS
    SELECT 
        Products.productCode,
        Products.productName,
        Products.productPrice,
        Products.productStatus
    FROM
        Products;
SELECT * FROM product_view;
-- Tiến hành sửa đổi view
CREATE OR REPLACE VIEW product_view AS
    SELECT 
        product_code, 
        product_name, 
        product_price,
        product_status
    FROM
        products;

-- Tiến hành xoá view


-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
DELIMITER //
CREATE PROCEDURE products_sp()
BEGIN
SELECT * FROM Products;
END;
// DELIMITER ;
CALL products_sp();


-- Tạo store procedure thêm một sản phẩm mới
DELIMITER // 
CREATE PROCEDURE new_product (
id INT,
product_code INT,
product_name VARCHAR(50),
product_price INT,
product_amount INT,
product_description VARCHAR(50),
product_status VARCHAR(50))
BEGIN
INSERT INTO products
VALUES
(id, product_code, product_name, product_price, product_amount, product_description, product_status);
END; //
DELIMITER ;

CALL new_product('REDMI NOTE 10',	  'REDMI',	 64000,	7,	'Nhập Khẩu',	'Old');

-- Tạo store procedure sửa thông tin sản phẩm theo id
DELIMITER //
CREATE PROCEDURE edit_product (id INT ,
product_code INT,
product_name VARCHAR(50),
product_price INT,
product_amount INT,
product_description VARCHAR(50),
product_status VARCHAR(50))
BEGIN 
UPDATE products
SET 
product_code=product_code,
product_name=product_name,
product_price=product_price,
product_amount=product_amount,
product_description=product_description,
product_status=product_status
WHERE products.id=id;
END; //
DELIMITER ;
CALL edit_product(3,	'Iphone 15', 'APPLE',	 240000,		10,	'Xuất Khẩu',	'New');

-- Tạo store procedure xoá sản phẩm theo id
DELIMITER //
CREATE PROCEDURE delete_product (id INT)
BEGIN 
DELETE 
FROM products
WHERE products.id=id;
END; //
DELIMITER ;
CALL delete_product(6);

