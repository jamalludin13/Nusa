package item_distri.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "stock_details")
public class stock_source {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String sumber;
	private String sub_sumber;
	
	public stock_source(int id, String sumber, String sub_sumber) {
		super();
		this.id = id;
		this.sumber = sumber;
		this.sub_sumber = sub_sumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSumber() {
		return sumber;
	}
	public void setSumber(String sumber) {
		this.sumber = sumber;
	}
	public String getSub_sumber() {
		return sub_sumber;
	}
	public void setSub_sumber(String sub_sumber) {
		this.sub_sumber = sub_sumber;
	}
	
}
