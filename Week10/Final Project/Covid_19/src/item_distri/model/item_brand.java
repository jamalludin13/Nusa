package item_distri.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "item_brand")
class item_brand {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_brand;
	private String code_brand;
	private String nama_brand;
	private int shown;
	
	public item_brand(int id_brand, String code_brand, String nama_brand, int shown) {
		super();
		this.id_brand = id_brand;
		this.code_brand = code_brand;
		this.nama_brand = nama_brand;
		this.shown = shown;
	}
	public int getId_brand() {
		return id_brand;
	}
	public void setId_brand(int id_brand) {
		this.id_brand = id_brand;
	}
	public String getCode_brand() {
		return code_brand;
	}
	public void setCode_brand(String code_brand) {
		this.code_brand = code_brand;
	}
	public String getNama_brand() {
		return nama_brand;
	}
	public void setNama_brand(String nama_brand) {
		this.nama_brand = nama_brand;
	}
	public int getShown() {
		return shown;
	}
	public void setShown(int shown) {
		this.shown = shown;
	}
	
}
