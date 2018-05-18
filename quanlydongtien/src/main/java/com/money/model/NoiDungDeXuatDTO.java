package com.money.model;

public class NoiDungDeXuatDTO {

	private int id;

	private double donGia;

	private String ghiChu;

	private String noiDungDeXuat;

	private int soLuong;

	private int soNgay;

	private double thanhTien;

	private String idPhieuDeXuat;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public String getNoiDungDeXuat() {
		return noiDungDeXuat;
	}

	public void setNoiDungDeXuat(String noiDungDeXuat) {
		this.noiDungDeXuat = noiDungDeXuat;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}

	public double getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}

	public String getIdPhieuDeXuat() {
		return idPhieuDeXuat;
	}

	public void setIdPhieuDeXuat(String idPhieuDeXuat) {
		this.idPhieuDeXuat = idPhieuDeXuat;
	}

	public NoiDungDeXuatDTO(int id, double donGia, String ghiChu, String noiDungDeXuat, int soLuong, int soNgay,
			double thanhTien, String idPhieuDeXuat) {
		super();
		this.id = id;
		this.donGia = donGia;
		this.ghiChu = ghiChu;
		this.noiDungDeXuat = noiDungDeXuat;
		this.soLuong = soLuong;
		this.soNgay = soNgay;
		this.thanhTien = thanhTien;
		this.idPhieuDeXuat = idPhieuDeXuat;
	}

	public NoiDungDeXuatDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
