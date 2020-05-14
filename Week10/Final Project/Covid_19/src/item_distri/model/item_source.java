package item_distri.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "item_source")
public class item_source {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String source_name;
	
	public item_source(int id, String source_name) {
		super();
		this.id = id;
		this.source_name = source_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSource_name() {
		return source_name;
	}
	public void setSource_name(String source_name) {
		this.source_name = source_name;
	}
	
}
