package com.money.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhieuDeXuatDTO {

	private String id;

	private String giamDoc;

	private String kinhGui;

	private Date ngayBatDau;

	private Date ngayDeXuat;

	private Date ngayHoanThanh;

	private String nguoiDeNghi;

	private String nguoiKeToan;

	private double tongTien;

	private int trangThai;

	private String yKienLanhDao;

	List<NoiDungDeXuatDTO> noiDungDeXuats = new ArrayList<NoiDungDeXuatDTO>();
	
	public List<NoiDungDeXuatDTO> getNoiDungDeXuats() {
		return noiDungDeXuats;
	}

	public void setNoiDungDeXuats(List<NoiDungDeXuatDTO> noiDungDeXuats) {
		this.noiDungDeXuats = noiDungDeXuats;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGiamDoc() {
		return giamDoc;
	}

	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}

	public String getKinhGui() {
		return kinhGui;
	}

	public void setKinhGui(String kinhGui) {
		this.kinhGui = kinhGui;
	}

	public Date getNgayBatDau() {
		return ngayBatDau;
	}

	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public Date getNgayDeXuat() {
		return ngayDeXuat;
	}

	public void setNgayDeXuat(Date ngayDeXuat) {
		this.ngayDeXuat = ngayDeXuat;
	}

	public Date getNgayHoanThanh() {
		return ngayHoanThanh;
	}

	public void setNgayHoanThanh(Date ngayHoanThanh) {
		this.ngayHoanThanh = ngayHoanThanh;
	}

	public String getNguoiDeNghi() {
		return nguoiDeNghi;
	}

	public void setNguoiDeNghi(String nguoiDeNghi) {
		this.nguoiDeNghi = nguoiDeNghi;
	}

	public String getNguoiKeToan() {
		return nguoiKeToan;
	}

	public void setNguoiKeToan(String nguoiKeToan) {
		this.nguoiKeToan = nguoiKeToan;
	}

	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	public int getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}

	public String getyKienLanhDao() {
		return yKienLanhDao;
	}

	public void setyKienLanhDao(String yKienLanhDao) {
		this.yKienLanhDao = yKienLanhDao;
	}

	public PhieuDeXuatDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhieuDeXuatDTO(String id, String giamDoc, String kinhGui, Date ngayBatDau, Date ngayDeXuat, Date ngayHoanThanh,
			String nguoiDeNghi, String nguoiKeToan, double tongTien, int trangThai, String yKienLanhDao) {
		super();
		this.id = id;
		this.giamDoc = giamDoc;
		this.kinhGui = kinhGui;
		this.ngayBatDau = ngayBatDau;
		this.ngayDeXuat = ngayDeXuat;
		this.ngayHoanThanh = ngayHoanThanh;
		this.nguoiDeNghi = nguoiDeNghi;
		this.nguoiKeToan = nguoiKeToan;
		this.tongTien = tongTien;
		this.trangThai = trangThai;
		this.yKienLanhDao = yKienLanhDao;
	}
	
	
}
