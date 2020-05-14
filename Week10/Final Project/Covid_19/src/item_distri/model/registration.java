package item_distri.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "item_distributor")
public class registration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fullname;
	private String mail;
	private String password;
	private int id_lab;
	private int status;
	private String date_created;
	
	public registration(int id, String fullname, String mail, String password, int id_lab, int status,
			String date_created) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.mail = mail;
		this.password = password;
		this.id_lab = id_lab;
		this.status = status;
		this.date_created = date_created;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId_lab() {
		return id_lab;
	}
	public void setId_lab(int id_lab) {
		this.id_lab = id_lab;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getDate_created() {
		return date_created;
	}
	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}
	
	
}
