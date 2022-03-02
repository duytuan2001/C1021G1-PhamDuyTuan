DROP DATABASE ThucTap;
CREATE DATABASE ThucTap;
USE ThucTap;

CREATE TABLE SinhVien(
	MSSV CHAR(7),
	Lop CHAR(7),
	Ho_ten VARCHAR(100),
	Ngay_sinh VARCHAR(100),
	gio_tinh VARCHAR(100),
	dia_chi VARCHAR(100)
);

ALTER TABLE SinhVien
ADD CONSTRAINT diemthi_ibfk_2 PRIMARY KEY (MSSV);


INSERT INTO SinhVien(MSSV, Lop, Ho_ten, Ngay_sinh, gio_tinh, dia_chi)
VALUE 
('MSV-001',	'C0120G1',	'Lê Phước Sỹ Phú',	'12/26/1993',	'Nam',	'Đà Nẵng'),
('MSV-002',	'A0120I1',	'Hoàng Phạm Đông',	'02/24/1997',	'Nam',	'Quảng Nam'),
('MSV-003',	'C0120G1',	'Võ Minh Vũ',		'01/30/2002',	'Nam',	'Đà Nẵng'),
('MSV-004',	'A0120I1',	'Trương Văn Nhật',	'05/06/1997',	'Nam',	'Quảng Nam'),
('MSV-005',	'A0120I1',	'Nguyễn Thị Chung',	'03/24/1994',	'Nữ',	'Huế'),
('MSV-006',	'C0120G1',	'Lê Như Tâm',		'02/21/2000',	'Nam',	'Đà Nẵng'),
('MSV-007',	'C0120G1',	'Đặng Anh Toàn',	'07/11/1997',	'Nam',	'Huế'),
('MSV-008',	'A0120I1',	'Đoàn Minh Đức',	'05/15/1993',	'Nam',	'Đà Nẵng'),
('MSV-009',	'C0120G1',	'Lê Ngọc Anh',		'09/18/1993',	'Nữ',	'Quảng Nam'),
('MSV-010',	'A0120I1',	'Nguyễn Văn Hoàng',	'01/24/1990',	'Nam',	'Huế');


CREATE TABLE MonHoc(
	MSMon VARCHAR(7) PRIMARY KEY,
	TenMon VARCHAR(100)
);

ALTER TABLE MonHoc
ADD CONSTRAINT diemthi_ibfk_1 PRIMARY KEY (MSMon);

CREATE TABLE DiemThi(
    LanThi INT,
    Diem INT,
    MSSV VARCHAR(7),
    MSMon VARCHAR(7),
    CONSTRAINT FOREIGN KEY (MSSV) REFERENCES SinhVien(MSSV),
	CONSTRAINT FOREIGN KEY (MSMon) REFERENCES SinhVien(MSMon)
);

