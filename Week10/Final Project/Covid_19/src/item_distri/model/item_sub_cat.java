package item_distri.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "item_sub_cat")
public class item_sub_cat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_sub_cat;
	private int id_cat;
	private String nama_sub_cat;
	private String code_sub_cat;
	private int shown;
	
	public item_sub_cat(int id_sub_cat, int id_cat, String nama_sub_cat, String code_sub_cat, int shown) {
		super();
		this.id_sub_cat = id_sub_cat;
		this.id_cat = id_cat;
		this.nama_sub_cat = nama_sub_cat;
		this.code_sub_cat = code_sub_cat;
		this.shown = shown;
	}
	public int getId_sub_cat() {
		return id_sub_cat;
	}
	public void setId_sub_cat(int id_sub_cat) {
		this.id_sub_cat = id_sub_cat;
	}
	public int getId_cat() {
		return id_cat;
	}
	public void setId_cat(int id_cat) {
		this.id_cat = id_cat;
	}
	public String getNama_sub_cat() {
		return nama_sub_cat;
	}
	public void setNama_sub_cat(String nama_sub_cat) {
		this.nama_sub_cat = nama_sub_cat;
	}
	public String getCode_sub_cat() {
		return code_sub_cat;
	}
	public void setCode_sub_cat(String code_sub_cat) {
		this.code_sub_cat = code_sub_cat;
	}
	public int getShown() {
		return shown;
	}
	public void setShown(int shown) {
		this.shown = shown;
	}
	
	
}
