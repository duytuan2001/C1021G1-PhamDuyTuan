USE QuanLyBanHang;

-- Thêm dữ liệu vào trong 4 bảng như dưới đây:
INSERT INTO Customer(cName, cAge) 
VALUE ('Minh Quan',10),
('Ngoc Oanh',20),
('Hong Ha',50);
SELECT * FROM Customer;

INSERT INTO `order`(cID,oDate,oTotalPrice)
VALUE
(1,'2006/03/21',Null),
(2,'2006/03/23',Null),
(1,'2006/03/16',Null);
SELECT * FROM `order`;

INSERT INTO Product(pName,pPrice)
VALUE 
('May Giat',3),
('Tu Lanh',5),
('Dieu Hoa',7),
('Quat',1),
('Bep Dien',2);
SELECT * FROM Product;

INSERT INTO orderDetail(oID,pID,odQTY)
VALUE
(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);
SELECT * FROM orderDetail;

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
SELECT `Order`.oID,`Order`.oDate,`Order`.oTotalPrice 
FROM `Order`;


-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
SELECT Customer.cName, Product.pName 
FROM Customer INNER JOIN `Order` on Customer.cID = `Order`.cID
INNER JOIN orderDetail ON `Order`.oID = orderDetail.oID
INNER JOIN Product ON Product.pID = orderDetail.pID;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
-- SELECT Customer.cName, Product.pName, `Order`.oID,
-- orderDetail.odQTY FROM Customer JOIN `Order` ON customer.cID = `Order`.cID JOIN orderDetail on `Order`.oID = orderDetail.oID
-- JOIN Product ON Product.pID = orderDetail.pID
-- WHERE orderDetail.odQTY = NULL;

SELECT * FROM customer
WHERE customer.cName NOT IN (
SELECT customer.cName
 FROM customer 
 inner join `order` on customer.cID = `order`.cID
);
-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn.
SELECT orderDetail.oID, `order`.oDate, SUM(orderDetail.odQTY * product.pPrice ) AS "total price"
 FROM customer INNER JOIN `order` on customer.cID = `order`.cID 
 INNER JOIN orderDetail on orderDetail.oID = `order`.oID 
 INNER JOIN product on product.pID = orderDetail.pID 
 GROUP BY orderDetail.oID;
-- Giá bán của từng loại được tính = odQTY*pPrice)






