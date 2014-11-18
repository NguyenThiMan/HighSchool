package com.highschool.model;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class HocSinh {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	@Persistent
	private String hoTen;
	@Persistent
	private String ngaySinh;
	@Persistent
	private String gioiTinh;
	@Persistent
	private String dienChinhSach;
	@Persistent
	private String danToc;
	@Persistent
	private String diaChi;
	@Persistent
	private String dienThoai;
	@Persistent
	private String denTuTruong;
	@Persistent
	private String ngayChuyen;
	@Persistent
	private String hoTenBo;
	@Persistent
	private String ngheNghiepBo;
	@Persistent
	private String hoTenMe;
	@Persistent
	private String ngheNghiepMe;
	
	public HocSinh(){
		super();
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDienChinhSach() {
		return dienChinhSach;
	}

	public void setDienChinhSach(String dienChinhSach) {
		this.dienChinhSach = dienChinhSach;
	}

	public String getDanToc() {
		return danToc;
	}

	public void setDanToc(String danToc) {
		this.danToc = danToc;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getDienThoai() {
		return dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	public String getDenTuTruong() {
		return denTuTruong;
	}

	public void setDenTuTruong(String denTuTruong) {
		this.denTuTruong = denTuTruong;
	}

	public String getNgayChuyen() {
		return ngayChuyen;
	}

	public void setNgayChuyen(String ngayChuyen) {
		this.ngayChuyen = ngayChuyen;
	}

	public String getHoTenBo() {
		return hoTenBo;
	}

	public void setHoTenBo(String hoTenBo) {
		this.hoTenBo = hoTenBo;
	}

	public String getNgheNghiepBo() {
		return ngheNghiepBo;
	}

	public void setNgheNghiepBo(String ngheNghiepBo) {
		this.ngheNghiepBo = ngheNghiepBo;
	}

	public String getHoTenMe() {
		return hoTenMe;
	}

	public void setHoTenMe(String hoTenMe) {
		this.hoTenMe = hoTenMe;
	}

	public String getNgheNghiepMe() {
		return ngheNghiepMe;
	}

	public void setNgheNghiepMe(String ngheNghiepMe) {
		this.ngheNghiepMe = ngheNghiepMe;
	}

}
