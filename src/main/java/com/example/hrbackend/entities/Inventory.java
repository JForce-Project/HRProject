package com.example.hrbackend.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.hrbackend.enums.StatuForInventory;

@Entity
@Table(name = "Inventory")
public class Inventory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "tip")
	private String tip;
	
	@Column(name = "marka")
	private String marka;
	
	
	@Column(name = "seriNo")  // ikisi birden?
	private String seriNo;
	

	@Column(name = "girisTarihi")
	private Date girisTarihi;
	
	
	//----------- enum 
	
	@Enumerated (EnumType.STRING)
	@Column(name = "statu")	
	private StatuForInventory statu;
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getSeriNo() {
		return seriNo;
	}

	public void setSeriNo(String seriNo) {
		this.seriNo = seriNo;
	}

	

	public Date getGirisTarihi() {
		return girisTarihi;
	}

	public void setGirisTarihi(Date girisTarihi) {
		this.girisTarihi = girisTarihi;
	}

	public StatuForInventory getStatu() {
		return statu;
	}

	public void setStatu(StatuForInventory statu) {
		this.statu = statu;
	}

	
	
	
	
}
