package item_distri.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "item_metric")
public class item_metric {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_metrics;
	private int sub_cat;
	private String code_sub_cat;
	private String metric_name;
	private Float metric_size;
	private String metric_code;

	public item_metric(int id_metrics, int sub_cat, String code_sub_cat, String metric_name, Float metric_size,
			String metric_code) {
		super();
		this.id_metrics = id_metrics;
		this.sub_cat = sub_cat;
		this.code_sub_cat = code_sub_cat;
		this.metric_name = metric_name;
		this.metric_size = metric_size;
		this.metric_code = metric_code;
	}
	public int getId_metrics() {
		return id_metrics;
	}
	public void setId_metrics(int id_metrics) {
		this.id_metrics = id_metrics;
	}
	public int getSub_cat() {
		return sub_cat;
	}
	public void setSub_cat(int sub_cat) {
		this.sub_cat = sub_cat;
	}
	public String getCode_sub_cat() {
		return code_sub_cat;
	}
	public void setCode_sub_cat(String code_sub_cat) {
		this.code_sub_cat = code_sub_cat;
	}
	public String getMetric_name() {
		return metric_name;
	}
	public void setMetric_name(String metric_name) {
		this.metric_name = metric_name;
	}
	public Float getMetric_size() {
		return metric_size;
	}
	public void setMetric_size(Float metric_size) {
		this.metric_size = metric_size;
	}
	public String getMetric_code() {
		return metric_code;
	}
	public void setMetric_code(String metric_code) {
		this.metric_code = metric_code;
	}
	
	
	
}
