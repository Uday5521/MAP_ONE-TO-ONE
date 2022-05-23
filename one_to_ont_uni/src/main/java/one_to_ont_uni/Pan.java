package one_to_ont_uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Pan {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String address;
	private int pannumber;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPannumber() {
		return pannumber;
	}
	public void setPannumber(int pannumber) {
		this.pannumber = pannumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
