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
@Table(name = "InventoryInfo")
public class InventoryInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "verilis_tarihi")
	private Date verilisTarihi;

	@Column(name = "geri_teslim_tarihi", nullable = true)
	private Date geriTeslimTarihi;

	@JoinColumn(name = "employee_id")
	@ManyToOne
	private Employee employeId;

	@JoinColumn(name = "inventory_id")
	@ManyToOne
	private Inventory inventoryId;

	@JoinColumn(name = "teslim_eden_employeeID")
	@ManyToOne
	private Employee teslimEdenEmployeeID;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getVerilisTarihi() {
		return verilisTarihi;
	}

	public void setVerilisTarihi(Date verilisTarihi) {
		this.verilisTarihi = verilisTarihi;
	}

	public Date getGeriTeslimTarihi() {
		return geriTeslimTarihi;
	}

	public void setGeriTeslimTarihi(Date geriTeslimTarihi) {
		this.geriTeslimTarihi = geriTeslimTarihi;
	}

	public Employee getEmployeId() {
		return employeId;
	}

	public void setEmployeId(Employee employeId) {
		this.employeId = employeId;
	}

	public Inventory getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Inventory inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Employee getTeslimEdenEmployeeID() {
		return teslimEdenEmployeeID;
	}

	public void setTeslimEdenEmployeeID(Employee teslimEdenEmployeeID) {
		this.teslimEdenEmployeeID = teslimEdenEmployeeID;
	}

}
