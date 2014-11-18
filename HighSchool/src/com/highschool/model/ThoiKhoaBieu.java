package com.highschool.model;

import java.util.ArrayList;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class ThoiKhoaBieu {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	@Persistent
	private ArrayList<GiaoVien> giaoVien;
	@Persistent
	private ArrayList<MonHoc> monHoc;
	@Persistent
	private ArrayList<Lop> lop;
	@Persistent
	private int thu;
	@Persistent
	private int tiet;

	public ThoiKhoaBieu() {
		super();
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public ArrayList<GiaoVien> getGiaoVien() {
		return giaoVien;
	}

	public void setGiaoVien(ArrayList<GiaoVien> giaoVien) {
		this.giaoVien = giaoVien;
	}

	public ArrayList<MonHoc> getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(ArrayList<MonHoc> monHoc) {
		this.monHoc = monHoc;
	}

	public ArrayList<Lop> getLop() {
		return lop;
	}

	public void setLop(ArrayList<Lop> lop) {
		this.lop = lop;
	}

	public int getThu() {
		return thu;
	}

	public void setThu(int thu) {
		this.thu = thu;
	}

	public int getTiet() {
		return tiet;
	}

	public void setTiet(int tiet) {
		this.tiet = tiet;
	}

}
