package springBoot.Project.Version1.admin.bean;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

private String city;
    
    private String state;
    
    private String postalCode;
    
    

	public Address() {
		super();
	}

	public Address(String city, String state, String postalCode) {
		super();
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
    
    
	
}
