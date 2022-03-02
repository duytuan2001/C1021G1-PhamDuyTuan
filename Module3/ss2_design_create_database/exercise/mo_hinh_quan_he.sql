DROP DATABASE mo_hinh_quan_he;
CREATE DATABASE mo_hinh_quan_he;
USE mo_hinh_quan_he;

CREATE TABLE vat_tu(
	ma_vtu INT PRIMARY KEY AUTO_INCREMENT,
	ten_vtu VARCHAR(100)
);

CREATE TABLE phieuxuat(
    so_px INT PRIMARY KEY AUTO_INCREMENT,
    ngay_xuat DATE
);

CREATE TABLE chi_tiet_phieu_xuat(
	don_gia_xuat DOUBLE,
    so_luong_xuat INT,
    so_px INT,
    ma_vtu INT,
    PRIMARY KEY(so_px, ma_vtu),
    FOREIGN KEY (so_px) REFERENCES phieuxuat(so_px),
    FOREIGN KEY (ma_vtu) REFERENCES vat_tu(ma_vtu)
);

CREATE TABLE phieu_nhap(
	so_pn INT PRIMARY KEY AUTO_INCREMENT,
    ngay_nhap DATE
);

CREATE TABLE chi_tiet_phieu_nhap(
	don_gia_nhap DOUBLE,
	so_luong_nhap INT,
    so_pn INT,
    ma_vtu INT,
    PRIMARY KEY(so_pn, ma_vtu),
    FOREIGN KEY (so_pn) REFERENCES phieu_nhap(so_pn),
    FOREIGN KEY (ma_vtu) REFERENCES vat_tu(ma_vtu)
);

CREATE TABLE don_dat_hang(
	so_dh INT PRIMARY KEY AUTO_INCREMENT,
    ngay_dh DATE
);

CREATE TABLE chi_tiet_don_dat_hang(
	so_dh INT,
    ma_vtu INT,
    PRIMARY KEY(so_dh, ma_vtu),
    FOREIGN KEY (so_dh) REFERENCES don_dat_hang(so_dh),
    FOREIGN KEY (ma_vtu) REFERENCES vat_tu(ma_vtu)
);

CREATE TABLE nha_cung_cap(
	ma_ncc INT PRIMARY KEY,
    ten_ncc VARCHAR(100),
    dia_chi_ncc VARCHAR(100),
    so_dh int,
    FOREIGN KEY(so_dh) REFERENCES don_dat_hang(so_dh)
);


CREATE TABLE so_dien_thoai(
	so_dien_thoai VARCHAR(10),
    ma_ncc INT,
    FOREIGN KEY (ma_ncc) REFERENCES nha_cung_cap(ma_ncc)
);    