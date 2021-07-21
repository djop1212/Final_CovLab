package reservation.vo;

import java.io.Serializable;
import java.sql.Date;

public class Vaccine implements Serializable {
	private static final long serialVersionUID = 102L;
	
	private String serial_num;
	private String vac_name;
	private Date product;
	public Vaccine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vaccine(String serial_num, String vac_name, Date product) {
		super();
		this.serial_num = serial_num;
		this.vac_name = vac_name;
		this.product = product;
	}
	public String getSerial_num() {
		return serial_num;
	}
	public void setSerial_num(String serial_num) {
		this.serial_num = serial_num;
	}
	public String getVac_name() {
		return vac_name;
	}
	public void setVac_name(String vac_name) {
		this.vac_name = vac_name;
	}
	public Date getProduct() {
		return product;
	}
	public void setProduct(Date product) {
		this.product = product;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
