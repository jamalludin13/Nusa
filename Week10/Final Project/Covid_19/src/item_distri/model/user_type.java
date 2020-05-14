package item_distri.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "item_distributor")
public class user_type {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String type_name;
	
	
	
	public user_type(int id, String type_name) {
		super();
		this.id = id;
		this.type_name = type_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	
	
}
