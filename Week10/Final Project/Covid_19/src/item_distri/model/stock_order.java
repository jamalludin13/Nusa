package item_distri.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "stock_order")
public class stock_order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_sto;
	private int transaction_type;
	private String sto_send_time;
	private String sto_arrive_time;
	private String created_at;
	private String update_at;
	private int shown;
	private String delete_reason;
	private int sto_source;
	private String sto_source_desc;
	private String id_batch;
	private String receipt;
	private int source_point;
	private int end_point;
	private String description;
	private int status;
	private int id_ref;
	
	public stock_order(int id_sto, int transaction_type, String sto_send_time, String sto_arrive_time,
			String created_at, String update_at, int shown, String delete_reason, int sto_source,
			String sto_source_desc, String id_batch, String receipt, int source_point, int end_point,
			String description, int status, int id_ref) {
		super();
		this.id_sto = id_sto;
		this.transaction_type = transaction_type;
		this.sto_send_time = sto_send_time;
		this.sto_arrive_time = sto_arrive_time;
		this.created_at = created_at;
		this.update_at = update_at;
		this.shown = shown;
		this.delete_reason = delete_reason;
		this.sto_source = sto_source;
		this.sto_source_desc = sto_source_desc;
		this.id_batch = id_batch;
		this.receipt = receipt;
		this.source_point = source_point;
		this.end_point = end_point;
		this.description = description;
		this.status = status;
		this.id_ref = id_ref;
	}
	
	
	public int getId_sto() {
		return id_sto;
	}
	public void setId_sto(int id_sto) {
		this.id_sto = id_sto;
	}
	public int getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(int transaction_type) {
		this.transaction_type = transaction_type;
	}
	public String getSto_send_time() {
		return sto_send_time;
	}
	public void setSto_send_time(String sto_send_time) {
		this.sto_send_time = sto_send_time;
	}
	public String getSto_arrive_time() {
		return sto_arrive_time;
	}
	public void setSto_arrive_time(String sto_arrive_time) {
		this.sto_arrive_time = sto_arrive_time;
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
	public String getDelete_reason() {
		return delete_reason;
	}
	public void setDelete_reason(String delete_reason) {
		this.delete_reason = delete_reason;
	}
	public int getSto_source() {
		return sto_source;
	}
	public void setSto_source(int sto_source) {
		this.sto_source = sto_source;
	}
	public String getSto_source_desc() {
		return sto_source_desc;
	}
	public void setSto_source_desc(String sto_source_desc) {
		this.sto_source_desc = sto_source_desc;
	}
	public String getId_batch() {
		return id_batch;
	}
	public void setId_batch(String id_batch) {
		this.id_batch = id_batch;
	}
	public String getReceipt() {
		return receipt;
	}
	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}
	public int getSource_point() {
		return source_point;
	}
	public void setSource_point(int source_point) {
		this.source_point = source_point;
	}
	public int getEnd_point() {
		return end_point;
	}
	public void setEnd_point(int end_point) {
		this.end_point = end_point;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getId_ref() {
		return id_ref;
	}
	public void setId_ref(int id_ref) {
		this.id_ref = id_ref;
	}

	
	
}
