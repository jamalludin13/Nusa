package item_distri.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "item_category")
public class item_category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_category;
	private String nama_category;
	private String code_category;
	private int shown;
	
	
	public item_category(int id_category, String nama_category, String code_category, int shown) {
		super();
		this.id_category = id_category;
		this.nama_category = nama_category;
		this.code_category = code_category;
		this.shown = shown;
	}
	public int getId_category() {
		return id_category;
	}
	public void setId_category(int id_category) {
		this.id_category = id_category;
	}
	public String getNama_category() {
		return nama_category;
	}
	public void setNama_category(String nama_category) {
		this.nama_category = nama_category;
	}
	public String getCode_category() {
		return code_category;
	}
	public void setCode_category(String code_category) {
		this.code_category = code_category;
	}
	public int getShown() {
		return shown;
	}
	public void setShown(int shown) {
		this.shown = shown;
	}
	
	
	
}
