package springBoot.Project.Version1.admin.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;

import org.springframework.stereotype.Service;

import springBoot.Project.Version1.admin.TO.AdminTO;
import springBoot.Project.Version1.admin.bean.Address;
import springBoot.Project.Version1.admin.bean.Admin;

@Service
public class MapperService {

	
	public Admin mapTOtoBean(AdminTO adminTO)
	{
	  /*  Admin admin = new Admin();
	    admin.setAdminId(adminTO.getAdminId());
	    admin.setAdminName(adminTO.getAdminName());
	    admin.setAdminType(adminTO.getAdminType());
	    admin.setAdminAccessLevel(adminTO.getAdminAccessLevel());
	    admin.setPassword(adminTO.getPassword());
	    admin.setTerms(adminTO.isTerms());
	    admin.setAddress(new Address(adminTO.getCity(),adminTO.getState(),adminTO.getPostalCode()));
	    admin.setCagIds(adminTO.getCagIds());;
	    
	    */
	    
	    System.out.println("The AdminTO cagid is "+adminTO.getCagId().toString());
	    Admin admin = new Admin();
		Address address= new Address(adminTO.getCity(),adminTO.getState(),adminTO.getPostalCode());	
		
		/*List<CagId> cagIds = new ArrayList<CagId>();
		
		for (String cg : adminTO.getCagIds()) {
			cagIds.add(new CagId(cg));
		}*/
		admin = new Admin(
		adminTO.getAdminId(),
	    adminTO.getAdminName(),
	    adminTO.getPassword(),
	    address,
	    adminTO.getCagId(),
	    adminTO.getAdminType(),
	    adminTO.getAdminAccessLevel(),
	    adminTO.isTerms()
				);
	    
		 System.out.println("The Admin  is "+admin);
	    return admin;
	    	
	};

	 public AdminTO mapBeanToTO(Admin admin)
	 {
		/* List<String> cagIds = new ArrayList<String>();
		 for(CagId cg : admin.getCagIds())
		 {
			 cagIds.add(cg.getCagId());
		 }*/
		 
		 
		 AdminTO adminTO = new AdminTO();
		 adminTO.setAdminId(admin.getAdminId());
		 adminTO.setAdminName(admin.getAdminName());
		 adminTO.setAdminAccessLevel(admin.getAdminAccessLevel());
		 adminTO.setAdminType(admin.getAdminType());
		 adminTO.setPassword(admin.getPassword());
		 adminTO.setTerms(admin.isTerms());
		 adminTO.setCity(admin.getAddress().getCity());
		 adminTO.setState(admin.getAddress().getState());
		 adminTO.setPostalCode(admin.getAddress().getPostalCode());
		 adminTO.setCagId(admin.getCagId());
		 return adminTO;
		 
	 }
	}

