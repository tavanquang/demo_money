-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 18, 2018 lúc 06:31 AM
-- Phiên bản máy phục vụ: 10.1.26-MariaDB
-- Phiên bản PHP: 7.0.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanlydongtien`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_admin`
--

CREATE TABLE `tbl_admin` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `roles` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_admin`
--

INSERT INTO `tbl_admin` (`username`, `password`, `roles`) VALUES
('admin', '123', 'ROLE_ADMIN');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_noi_dung_de_xuat`
--

CREATE TABLE `tbl_noi_dung_de_xuat` (
  `id` int(11) NOT NULL,
  `noi_dung_de_xuat` text,
  `so_ngay` int(11) DEFAULT NULL,
  `so_luong` int(11) DEFAULT NULL,
  `don_gia` double DEFAULT NULL,
  `thanh_tien` double DEFAULT NULL,
  `ghi_chu` varchar(255) DEFAULT NULL,
  `id_phieu_de_xuat` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_noi_dung_de_xuat`
--

INSERT INTO `tbl_noi_dung_de_xuat` (`id`, `noi_dung_de_xuat`, `so_ngay`, `so_luong`, `don_gia`, `thanh_tien`, `ghi_chu`, `id_phieu_de_xuat`) VALUES
(1, 'Mua 15 chiếc laptop cho công ty', 2, 15, 15000000, 150000000, NULL, '1'),
(2, 'Mua 10 chiếc ghế cho công ty', 2, 15, 15000000, 150000000, NULL, '2'),
(3, 'Mua 15 chiếc bàn cho công ty', 2, 15, 15000000, 150000000, NULL, '1'),
(4, 'Mua 12 chiếc cốc cho công ty', 3, 15, 10000000, 150000000, NULL, 'Fri May 18 10:22:51 ICT 2018'),
(5, 'Mua 5 chiếc điều hòa cho công ty', 2, 15, 15000000, 150000000, NULL, 'Fri May 18 10:22:51 ICT 2018');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_phieu_chi`
--

CREATE TABLE `tbl_phieu_chi` (
  `id` int(11) NOT NULL,
  `nguoi_nhan_tien` varchar(100) NOT NULL,
  `dia_chi` varchar(250) DEFAULT NULL,
  `ly_do_chi` text,
  `so_tien` double DEFAULT NULL,
  `kem_theo` int(11) DEFAULT NULL,
  `ngay_lap_phieu` date DEFAULT NULL,
  `giam_doc` varchar(100) DEFAULT NULL,
  `nguoi_lap_phieu` varchar(100) DEFAULT NULL,
  `trang_thai` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_phieu_chi`
--

INSERT INTO `tbl_phieu_chi` (`id`, `nguoi_nhan_tien`, `dia_chi`, `ly_do_chi`, `so_tien`, `kem_theo`, `ngay_lap_phieu`, `giam_doc`, `nguoi_lap_phieu`, `trang_thai`) VALUES
(1, 'Nguyễn Thị Trang', 'Công ty TNHH NCCSOFT', 'Thanh toán 10 chiếc laptop', 150000000, 1, '2018-05-16', 'Mai Thế Hùng', 'Nguyễn thị Phương Anh', 1),
(2, 'Nguyễn Thị Phuong', 'Công ty TNHH NCCSOFT', 'Thanh toán 10 chiếc laptop', 150000000, 1, '2018-05-16', 'Mai Thế Hùng', 'Nguyễn thị Phương Anh', 0),
(3, 'Nguyễn Thị Huong', 'Công ty TNHH NCCSOFT', 'Thanh toán 10 chiếc tivi', 150000000, 1, '2018-05-17', 'Mai Thế Hùng', 'Nguyễn thị Phương Anh', 0),
(4, 'Nguyễn Thị Vân', 'Công ty TNHH NCCSOFT', 'Thanh toán 20 chiếc ghế', 120000000, 2, '2018-05-16', 'Mai Thế Hùng', 'Nguyễn thị Phương Anh', 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_phieu_de_xuat`
--

CREATE TABLE `tbl_phieu_de_xuat` (
  `id` varchar(100) NOT NULL,
  `kinh_gui` varchar(255) DEFAULT NULL,
  `nguoi_de_nghi` varchar(100) DEFAULT NULL,
  `ngay_bat_dau` date DEFAULT NULL,
  `ngay_hoan_thanh` date DEFAULT NULL,
  `y_kien_lanh_dao` text,
  `ngay_de_xuat` date DEFAULT NULL,
  `nguoi_ke_toan` varchar(45) DEFAULT NULL,
  `giam_doc` varchar(45) DEFAULT NULL,
  `trang_thai` int(11) DEFAULT NULL,
  `tong_tien` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_phieu_de_xuat`
--

INSERT INTO `tbl_phieu_de_xuat` (`id`, `kinh_gui`, `nguoi_de_nghi`, `ngay_bat_dau`, `ngay_hoan_thanh`, `y_kien_lanh_dao`, `ngay_de_xuat`, `nguoi_ke_toan`, `giam_doc`, `trang_thai`, `tong_tien`) VALUES
('1', 'Ban giám đốc công ty TNHH NCCSOFT', 'Nguyễn Thị Trang', '2018-05-15', '2018-05-16', NULL, '2018-05-15', 'Phuong Anh', 'Mai the Hung', 0, 150000000),
('2', 'Ban giám đốc công ty TNHH NCCSOFT', 'Nguyễn Thị Vân', '2018-05-15', '2018-05-16', NULL, '2018-05-16', 'Phuong Anh', 'Mai the Hung', 0, 250000000),
('3', 'Ban giám đốc công ty TNHH NCCSOFT', 'Nguyễn Thị Huyền', '2018-05-15', '2018-05-18', NULL, '2018-05-15', 'Phuong Anh', 'Mai the Hung', 0, 600000000),
('Fri May 18 10:22:51 ICT 2018', 'Ban giám đốc công ty TNHH NCCSOFT', 'Trần Phương Trang', '2018-05-18', '2018-05-20', NULL, '2018-05-18', 'Phuong Anh', 'Mai the Hùng', 0, 64000000);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `tbl_admin`
--
ALTER TABLE `tbl_admin`
  ADD PRIMARY KEY (`username`);

--
-- Chỉ mục cho bảng `tbl_noi_dung_de_xuat`
--
ALTER TABLE `tbl_noi_dung_de_xuat`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_phieu_de_xuat1_idx` (`id_phieu_de_xuat`);

--
-- Chỉ mục cho bảng `tbl_phieu_chi`
--
ALTER TABLE `tbl_phieu_chi`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `tbl_phieu_de_xuat`
--
ALTER TABLE `tbl_phieu_de_xuat`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `tbl_noi_dung_de_xuat`
--
ALTER TABLE `tbl_noi_dung_de_xuat`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `tbl_phieu_chi`
--
ALTER TABLE `tbl_phieu_chi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `tbl_noi_dung_de_xuat`
--
ALTER TABLE `tbl_noi_dung_de_xuat`
  ADD CONSTRAINT `fk_phieu_de_xuat1` FOREIGN KEY (`id_phieu_de_xuat`) REFERENCES `tbl_phieu_de_xuat` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
