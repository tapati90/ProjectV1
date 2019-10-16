package springBoot.Project.Version1.admin.TO;

import java.util.ArrayList;
import java.util.List;

public class AdminTO {

	
	private String adminName;
	
    private int adminId;
    
    private String password;
    
    private String city;
    
    private String state;
    
    private String postalCode;
      
    private List<String> cagId;
    
    private String adminType;
    
    private String adminAccessLevel;
    
    private boolean terms;
    
    

	
	@Override
	public String toString() {
		return "AdminTO [adminName=" + adminName + ", adminId=" + adminId + ", password=" + password + ", city=" + city
				+ ", state=" + state + ", postalCode=" + postalCode + ", cagId=" + cagId + ", adminType=" + adminType
				+ ", adminAccessLevel=" + adminAccessLevel + ", terms=" + terms + "]";
	}

	public AdminTO() {
		super();
	}

	public AdminTO(String adminName, int adminId, String password, String city, String state, String postalCode,
			List<String> cagId, String adminType, String adminAccessLevel, boolean terms) {
		super();
		this.adminName = adminName;
		this.adminId = adminId;
		this.password = password;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.cagId = cagId;
		this.adminType = adminType;
		this.adminAccessLevel = adminAccessLevel;
		this.terms = terms;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public List<String> getCagId() {
		return cagId;
	}

	public void setCagId(List<String> cagId) {
		this.cagId = cagId;
	}

	public String getAdminType() {
		return adminType;
	}

	public void setAdminType(String adminType) {
		this.adminType = adminType;
	}

	public String getAdminAccessLevel() {
		return adminAccessLevel;
	}

	public void setAdminAccessLevel(String adminAccessLevel) {
		this.adminAccessLevel = adminAccessLevel;
	}

	public boolean isTerms() {
		return terms;
	}

	public void setTerms(boolean terms) {
		this.terms = terms;
	}

	
	
}
