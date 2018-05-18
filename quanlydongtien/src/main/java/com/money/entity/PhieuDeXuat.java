package com.money.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the tbl_phieu_de_xuat database table.
 * 
 */
@Entity
@Table(name="tbl_phieu_de_xuat")
@NamedQuery(name="PhieuDeXuat.findAll", query="SELECT p FROM PhieuDeXuat p")
public class PhieuDeXuat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="giam_doc")
	private String giamDoc;

	@Column(name="kinh_gui")
	private String kinhGui;

	@Temporal(TemporalType.DATE)
	@Column(name="ngay_bat_dau")
	private Date ngayBatDau;

	@Temporal(TemporalType.DATE)
	@Column(name="ngay_de_xuat")
	private Date ngayDeXuat;

	@Temporal(TemporalType.DATE)
	@Column(name="ngay_hoan_thanh")
	private Date ngayHoanThanh;

	@Column(name="nguoi_de_nghi")
	private String nguoiDeNghi;

	@Column(name="nguoi_ke_toan")
	private String nguoiKeToan;

	@Column(name="tong_tien")
	private double tongTien;

	@Column(name="trang_thai")
	private int trangThai;

	@Lob
	@Column(name="y_kien_lanh_dao")
	private String yKienLanhDao;

	//bi-directional many-to-one association to NoiDungDeXuat
	@OneToMany(mappedBy="tblPhieuDeXuat")
	private List<NoiDungDeXuat> tblNoiDungDeXuats;

	public PhieuDeXuat() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGiamDoc() {
		return this.giamDoc;
	}

	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}

	public String getKinhGui() {
		return this.kinhGui;
	}

	public void setKinhGui(String kinhGui) {
		this.kinhGui = kinhGui;
	}

	public Date getNgayBatDau() {
		return this.ngayBatDau;
	}

	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public Date getNgayDeXuat() {
		return this.ngayDeXuat;
	}

	public void setNgayDeXuat(Date ngayDeXuat) {
		this.ngayDeXuat = ngayDeXuat;
	}

	public Date getNgayHoanThanh() {
		return this.ngayHoanThanh;
	}

	public void setNgayHoanThanh(Date ngayHoanThanh) {
		this.ngayHoanThanh = ngayHoanThanh;
	}

	public String getNguoiDeNghi() {
		return this.nguoiDeNghi;
	}

	public void setNguoiDeNghi(String nguoiDeNghi) {
		this.nguoiDeNghi = nguoiDeNghi;
	}

	public String getNguoiKeToan() {
		return this.nguoiKeToan;
	}

	public void setNguoiKeToan(String nguoiKeToan) {
		this.nguoiKeToan = nguoiKeToan;
	}

	public double getTongTien() {
		return this.tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	public int getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}

	public String getYKienLanhDao() {
		return this.yKienLanhDao;
	}

	public void setYKienLanhDao(String yKienLanhDao) {
		this.yKienLanhDao = yKienLanhDao;
	}

	public List<NoiDungDeXuat> getTblNoiDungDeXuats() {
		return this.tblNoiDungDeXuats;
	}

	public void setTblNoiDungDeXuats(List<NoiDungDeXuat> tblNoiDungDeXuats) {
		this.tblNoiDungDeXuats = tblNoiDungDeXuats;
	}

	public NoiDungDeXuat addTblNoiDungDeXuat(NoiDungDeXuat tblNoiDungDeXuat) {
		getTblNoiDungDeXuats().add(tblNoiDungDeXuat);
		tblNoiDungDeXuat.setTblPhieuDeXuat(this);

		return tblNoiDungDeXuat;
	}

	public NoiDungDeXuat removeTblNoiDungDeXuat(NoiDungDeXuat tblNoiDungDeXuat) {
		getTblNoiDungDeXuats().remove(tblNoiDungDeXuat);
		tblNoiDungDeXuat.setTblPhieuDeXuat(null);

		return tblNoiDungDeXuat;
	}

}