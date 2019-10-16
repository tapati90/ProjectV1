package springBoot.Project.Version1.admin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import springBoot.Project.Version1.admin.TO.AdminTO;
import springBoot.Project.Version1.admin.bean.Admin;
import springBoot.Project.Version1.admin.bean.ProjectStatus;
import springBoot.Project.Version1.admin.dao.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepo;
	
	@Autowired
	private MapperService mapperService;
	
	// Creating new Admin
	
	
	public Admin addAdmin(AdminTO adminTO) {
		
		Admin admin = mapperService.mapTOtoBean(adminTO);
		
		adminRepo.save(admin);
		System.out.println(admin);
		return admin;
		
	}
	
	
	
	public ProjectStatus loginAdmin(AdminTO adminTO)
	{
		
		int adminID = adminTO.getAdminId();
		Admin admin =adminRepo.findOne(adminID);
		
		if(null != admin && admin.getPassword().equals(adminTO.getPassword()))
		{
			return new ProjectStatus("success");
		}
		else
		{
		 return new ProjectStatus("fail");
		}
		
		
	}
    
	public AdminTO fetchAdminDetails(int adminId)
	{
		Admin admin = adminRepo.findOne(adminId);
		return mapperService.mapBeanToTO(admin);
		
	}
	
	// view all the admins
	public List<Admin> getAllAdmins() {
		List<Admin> adminList = new ArrayList<Admin>();
		this.adminRepo.findAll()
		.forEach(adminList :: add);
		return adminList;
	}



	public AdminTO updateAdminDetails(AdminTO adminTO, int adminId) {
		
		System.out.println(adminTO.toString());
		AdminTO existingAdminTO = new AdminTO();
		existingAdminTO = this.fetchAdminDetails(adminId);
		
		adminTO.setPassword(existingAdminTO.getPassword());
		adminTO.setTerms(existingAdminTO.isTerms());
		//adminTO.setCagId(existingAdminTO.getCagId());
		Admin admin = new Admin();
		Admin updatedAdmin = new Admin();
		AdminTO updatedAdminTO = new AdminTO();
		admin = mapperService.mapTOtoBean(adminTO);
		
		
		updatedAdmin=this.adminRepo.save(admin);
		updatedAdminTO= mapperService.mapBeanToTO(updatedAdmin);
		return updatedAdminTO;
	}

}
