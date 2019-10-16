package springBoot.Project.Version1.admin.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adminDetails")
public class Admin {

	@Id
   // @GeneratedValue(strategy=GenerationType.AUTO)
    private int adminId;

    private String adminName;
    
    private String password;
    
    @Embedded
    private Address address;
      
    @ElementCollection
    @CollectionTable(name = "Admin_CagId", joinColumns = @JoinColumn(name = "admin_Id"))
    @Column(name = "cagId")
    private List<String> cagId = new ArrayList<String>();
    
    private String adminType;
    
    private String adminAccessLevel;
    
    private boolean terms;
    
    

	public Admin() {
		super();
	}



	public Admin(int adminId, String adminName, String password, Address address, List<String> cagId, String adminType,
			String adminAccessLevel, boolean terms) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.password = password;
		this.address = address;
		this.cagId = cagId;
		this.adminType = adminType;
		this.adminAccessLevel = adminAccessLevel;
		this.terms = terms;
	}



	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", password=" + password + ", address="
				+ address + ", cagId=" + cagId + ", adminType=" + adminType + ", adminAccessLevel=" + adminAccessLevel
				+ ", terms=" + terms + "]";
	}



	public int getAdminId() {
		return adminId;
	}



	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}



	public String getAdminName() {
		return adminName;
	}



	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public List<String> getCagId() {
		return cagId;
	}



	public void setCagIds(List<String> cagId) {
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
