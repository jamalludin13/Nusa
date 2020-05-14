package item_distri.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "stock_details")
public class stock_details {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_transaction;
	private int id_sto;
	private int id_sto_ref;
	private String description;
	private int amount;
	private int id_item;
	private String created_at;
	private String update_at;
	private int shown;
	private int created_by;
	
	public stock_details(int id_transaction, int id_sto, int id_sto_ref, String description, int amount, int id_item,
			String created_at, String update_at, int shown, int created_by) {
		super();
		this.id_transaction = id_transaction;
		this.id_sto = id_sto;
		this.id_sto_ref = id_sto_ref;
		this.description = description;
		this.amount = amount;
		this.id_item = id_item;
		this.created_at = created_at;
		this.update_at = update_at;
		this.shown = shown;
		this.created_by = created_by;
	}
	public int getId_transaction() {
		return id_transaction;
	}
	public void setId_transaction(int id_transaction) {
		this.id_transaction = id_transaction;
	}
	public int getId_sto() {
		return id_sto;
	}
	public void setId_sto(int id_sto) {
		this.id_sto = id_sto;
	}
	public int getId_sto_ref() {
		return id_sto_ref;
	}
	public void setId_sto_ref(int id_sto_ref) {
		this.id_sto_ref = id_sto_ref;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getId_item() {
		return id_item;
	}
	public void setId_item(int id_item) {
		this.id_item = id_item;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(String update_at) {
		this.update_at = update_at;
	}
	public int getShown() {
		return shown;
	}
	public void setShown(int shown) {
		this.shown = shown;
	}
	public int getCreated_by() {
		return created_by;
	}
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	
	
	
}
