package com.money.model;

import java.util.Date;

public class PhieuChiDTO {

	private int id;

	private String diaChi;

	private String giamDoc;

	private int kemTheo;

	private String lyDoChi;

	//private String ngayLapPhieu;
	
	private Date ngayLapPhieu;

	private String nguoiLapPhieu;

	private String nguoiNhanTien;

	private double soTien;
	
	private String tongtien;

	public String getTongtien() {
		return tongtien;
	}

	public void setTongtien(String tongtien) {
		this.tongtien = tongtien;
	}

	private int trangThai;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getGiamDoc() {
		return giamDoc;
	}

	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}

	public int getKemTheo() {
		return kemTheo;
	}

	public void setKemTheo(int kemTheo) {
		this.kemTheo = kemTheo;
	}

	public String getLyDoChi() {
		return lyDoChi;
	}

	public void setLyDoChi(String lyDoChi) {
		this.lyDoChi = lyDoChi;
	}

	public Date getNgayLapPhieu() {
		return ngayLapPhieu;
	}

	public void setNgayLapPhieu(Date ngayLapPhieu) {
		this.ngayLapPhieu = ngayLapPhieu;
	}

	public String getNguoiLapPhieu() {
		return nguoiLapPhieu;
	}

	public void setNguoiLapPhieu(String nguoiLapPhieu) {
		this.nguoiLapPhieu = nguoiLapPhieu;
	}

	public String getNguoiNhanTien() {
		return nguoiNhanTien;
	}

	public void setNguoiNhanTien(String nguoiNhanTien) {
		this.nguoiNhanTien = nguoiNhanTien;
	}

	public double getSoTien() {
		return soTien;
	}

	public void setSoTien(double soTien) {
		this.soTien = soTien;
	}

	public int getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}

	public PhieuChiDTO(int id, String diaChi, String giamDoc, int kemTheo, String lyDoChi, Date ngayLapPhieu,
			String nguoiLapPhieu, String nguoiNhanTien, double soTien, int trangThai) {
		super();
		this.id = id;
		this.diaChi = diaChi;
		this.giamDoc = giamDoc;
		this.kemTheo = kemTheo;
		this.lyDoChi = lyDoChi;
		this.ngayLapPhieu = ngayLapPhieu;
		this.nguoiLapPhieu = nguoiLapPhieu;
		this.nguoiNhanTien = nguoiNhanTien;
		this.soTien = soTien;
		this.trangThai = trangThai;
	}

	public PhieuChiDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
