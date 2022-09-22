package com.example.hrbackend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "ad")
	private String ad;

	@Column(name = "soyad")
	private String soyad;

	@Column(name = "cinsiyet")
	private String cinsiyet;

	@Column(name = "medeni_durum")
	private String medeni_durum;

	@Column(name = "tckn")
	private String tckn;

	@Column(name = "sicil_no")
	private String sicilNo;

	@Column(name = "mezun_durum", nullable = true)
	private String mezunDurum;

	@Column(name = "birim")
	private String birim;

	@Column(name = "gorev")
	private String gorev;

	@Column(name = "calisiyor_mu")
	private String calisiyorMu;

	@Column(name = "profil_foto", nullable = true)
	private String profilFoto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public String getMedeni_durum() {
		return medeni_durum;
	}

	public void setMedeni_durum(String medeni_durum) {
		this.medeni_durum = medeni_durum;
	}

	
	public String getMezunDurum() {
		return mezunDurum;
	}

	public void setMezunDurum(String mezunDurum) {
		this.mezunDurum = mezunDurum;
	}

	public String getBirim() {
		return birim;
	}

	public void setBirim(String birim) {
		this.birim = birim;
	}

	public String getGorev() {
		return gorev;
	}

	public void setGorev(String gorev) {
		this.gorev = gorev;
	}

	public String getCalisiyorMu() {
		return calisiyorMu;
	}

	public void setCalisiyorMu(String calisiyorMu) {
		this.calisiyorMu = calisiyorMu;
	}

	public String getProfilFoto() {
		return profilFoto;
	}

	public void setProfilFoto(String profilFoto) {
		this.profilFoto = profilFoto;
	}

	public String getTckn() {
		return tckn;
	}

	public void setTckn(String tckn) {
		this.tckn = tckn;
	}

	public String getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(String sicilNo) {
		this.sicilNo = sicilNo;
	}

 

}
