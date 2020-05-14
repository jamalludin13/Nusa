package item_distri.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "labs")
public class labs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_lab;
	private String code_lab;
	private String password;
	private String nama_lab;
	private String alamat_lab;
	private String pic_lab;
	private String mail_lab;
	private String created_at;
	private String updated_at;
	private String created_by;
	private int shown;
	private String contact_lab;
	
	
	
	public labs(int id_lab, String code_lab, String password, String nama_lab, String alamat_lab, String pic_lab,
			String mail_lab, String created_at, String updated_at, String created_by, int shown, String contact_lab) {
		super();
		this.id_lab = id_lab;
		this.code_lab = code_lab;
		this.password = password;
		this.nama_lab = nama_lab;
		this.alamat_lab = alamat_lab;
		this.pic_lab = pic_lab;
		this.mail_lab = mail_lab;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.created_by = created_by;
		this.shown = shown;
		this.contact_lab = contact_lab;
	}
	public int getId_lab() {
		return id_lab;
	}
	public void setId_lab(int id_lab) {
		this.id_lab = id_lab;
	}
	public String getCode_lab() {
		return code_lab;
	}
	public void setCode_lab(String code_lab) {
		this.code_lab = code_lab;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNama_lab() {
		return nama_lab;
	}
	public void setNama_lab(String nama_lab) {
		this.nama_lab = nama_lab;
	}
	public String getAlamat_lab() {
		return alamat_lab;
	}
	public void setAlamat_lab(String alamat_lab) {
		this.alamat_lab = alamat_lab;
	}
	public String getPic_lab() {
		return pic_lab;
	}
	public void setPic_lab(String pic_lab) {
		this.pic_lab = pic_lab;
	}
	public String getMail_lab() {
		return mail_lab;
	}
	public void setMail_lab(String mail_lab) {
		this.mail_lab = mail_lab;
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
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public int getShown() {
		return shown;
	}
	public void setShown(int shown) {
		this.shown = shown;
	}
	public String getContact_lab() {
		return contact_lab;
	}
	public void setContact_lab(String contact_lab) {
		this.contact_lab = contact_lab;
	}
	
	
}
