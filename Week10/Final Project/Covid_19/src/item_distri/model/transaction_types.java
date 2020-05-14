package item_distri.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "transaction_types")
public class transaction_types {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_types;
	private String tx_name;
	
	
	
	public transaction_types(int id_types, String tx_name) {
		super();
		this.id_types = id_types;
		this.tx_name = tx_name;
	}
	public int getId_types() {
		return id_types;
	}
	public void setId_types(int id_types) {
		this.id_types = id_types;
	}
	public String getTx_name() {
		return tx_name;
	}
	public void setTx_name(String tx_name) {
		this.tx_name = tx_name;
	}
	
	
}
