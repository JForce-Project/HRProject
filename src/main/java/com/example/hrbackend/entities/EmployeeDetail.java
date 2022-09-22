package com.example.hrbackend.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeDetail")
public class EmployeeDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "ise_giris_tarihi")
	private Date iseGirisTarihi;

	@Column(name = "pozisyon")
	private String pozisyon;

	@Column(name = "unvan")
	private String unvan;

	@Column(name = "son_isten_ayrilis_tarihi", nullable = true)
	private Date sonIstenAyrilisTarihi;

	@Column(name = "son_isten_ayrilis_nedeni", nullable = true)
	private String sonIstenAyrilisNedeni;

	@JoinColumn(name = "employee_id")
	@ManyToOne
	private Employee employeId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getIseGirisTarihi() {
		return iseGirisTarihi;
	}

	public void setIseGirisTarihi(Date iseGirisTarihi) {
		this.iseGirisTarihi = iseGirisTarihi;
	}

	public String getPozisyon() {
		return pozisyon;
	}

	public void setPozisyon(String pozisyon) {
		this.pozisyon = pozisyon;
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	public Date getSonIstenAyrilisTarihi() {
		return sonIstenAyrilisTarihi;
	}

	public void setSonIstenAyrilisTarihi(Date sonIstenAyrilisTarihi) {
		this.sonIstenAyrilisTarihi = sonIstenAyrilisTarihi;
	}

	public String getSonIstenAyrilisNedeni() {
		return sonIstenAyrilisNedeni;
	}

	public void setSonIstenAyrilisNedeni(String sonIstenAyrilisNedeni) {
		this.sonIstenAyrilisNedeni = sonIstenAyrilisNedeni;
	}

	public Employee getEmployeId() {
		return employeId;
	}

	public void setEmployeId(Employee employeId) {
		this.employeId = employeId;
	}

}
