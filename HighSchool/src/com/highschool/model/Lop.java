package com.highschool.model;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Lop {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	@Persistent
	private String tenLop;
	@Persistent(mappedBy="lop")
	private GiaoVien giaoVienChuNhiem;
	@Persistent
	private int siSo;
	@Persistent(mappedBy="lop")
	private List<HocSinh> listHocSinh;
	@Persistent
	private NamHoc namHoc;

	public Lop() {
		super();
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public GiaoVien getGiaoVienChuNhiem() {
		return giaoVienChuNhiem;
	}

	public void setGiaoVienChuNhiem(GiaoVien giaoVienChuNhiem) {
		this.giaoVienChuNhiem = giaoVienChuNhiem;
	}

	public int getSiSo() {
		return siSo;
	}

	public void setSiSo(int siSo) {
		this.siSo = siSo;
	}

	public List<HocSinh> getListHocSinh() {
		return listHocSinh;
	}

	public void setListHocSinh(ArrayList<HocSinh> listHocSinh) {
		this.listHocSinh = listHocSinh;
	}

}
