package com.money.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_noi_dung_de_xuat database table.
 * 
 */
@Entity
@Table(name="tbl_noi_dung_de_xuat")
@NamedQuery(name="NoiDungDeXuat.findAll", query="SELECT n FROM NoiDungDeXuat n")
public class NoiDungDeXuat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="don_gia")
	private double donGia;

	@Column(name="ghi_chu")
	private String ghiChu;

	@Lob
	@Column(name="noi_dung_de_xuat")
	private String noiDungDeXuat;

	@Column(name="so_luong")
	private int soLuong;

	@Column(name="so_ngay")
	private int soNgay;

	@Column(name="thanh_tien")
	private double thanhTien;

	//bi-directional many-to-one association to PhieuDeXuat
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_phieu_de_xuat")
	private PhieuDeXuat tblPhieuDeXuat;

	public NoiDungDeXuat() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDonGia() {
		return this.donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public String getNoiDungDeXuat() {
		return this.noiDungDeXuat;
	}

	public void setNoiDungDeXuat(String noiDungDeXuat) {
		this.noiDungDeXuat = noiDungDeXuat;
	}

	public int getSoLuong() {
		return this.soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getSoNgay() {
		return this.soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}

	public double getThanhTien() {
		return this.thanhTien;
	}

	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}

	public PhieuDeXuat getTblPhieuDeXuat() {
		return this.tblPhieuDeXuat;
	}

	public void setTblPhieuDeXuat(PhieuDeXuat tblPhieuDeXuat) {
		this.tblPhieuDeXuat = tblPhieuDeXuat;
	}

}