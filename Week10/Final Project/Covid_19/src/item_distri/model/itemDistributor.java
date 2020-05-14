package item_distri.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "item_distributor")
public class itemDistributor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_distributor;
	private String nama_distributor;
	private String kode_distributor;
	private int shown;
	
	
	
	public itemDistributor(int id_distributor, String nama_distributor, String kode_distributor, int shown) {
		super();
		this.id_distributor = id_distributor;
		this.nama_distributor = nama_distributor;
		this.kode_distributor = kode_distributor;
		this.shown = shown;
	}
	public int getId_distributor() {
		return id_distributor;
	}
	public void setId_distributor(int id_distributor) {
		this.id_distributor = id_distributor;
	}
	public String getNama_distributor() {
		return nama_distributor;
	}
	public void setNama_distributor(String nama_distributor) {
		this.nama_distributor = nama_distributor;
	}
	public String getKode_distributor() {
		return kode_distributor;
	}
	public void setKode_distributor(String kode_distributor) {
		this.kode_distributor = kode_distributor;
	}
	public int getShown() {
		return shown;
	}
	public void setShown(int shown) {
		this.shown = shown;
	}
	
	
}
