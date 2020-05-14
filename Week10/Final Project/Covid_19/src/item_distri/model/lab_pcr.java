package item_distri.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "lab_pcr")
public class lab_pcr {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_pcr;
	private int id_lab;
	private String brand;
	private int capacity;
	private String created_at;
	private String updated_at;
	private int created_by;
	
	public lab_pcr(int id_pcr, int id_lab, String brand, int capacity, String created_at, String updated_at,
			int created_by) {
		super();
		this.id_pcr = id_pcr;
		this.id_lab = id_lab;
		this.brand = brand;
		this.capacity = capacity;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.created_by = created_by;
	}
	public int getId_pcr() {
		return id_pcr;
	}
	public void setId_pcr(int id_pcr) {
		this.id_pcr = id_pcr;
	}
	public int getId_lab() {
		return id_lab;
	}
	public void setId_lab(int id_lab) {
		this.id_lab = id_lab;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	public int getCreated_by() {
		return created_by;
	}
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	
	
}
