package springBoot.Project.Version1.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springBoot.Project.Version1.admin.TO.AdminTO;
import springBoot.Project.Version1.admin.bean.Admin;
import springBoot.Project.Version1.admin.bean.ProjectStatus;
import springBoot.Project.Version1.admin.service.AdminService;

@RestController
@RequestMapping("/admin")
public class LoginController {
	
	@Autowired
	private AdminService adminService;
    
	//Testing
	@RequestMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public String testing()
	{
		return "Login Controller Working";
	}
	
	//Adding new Admin
	@RequestMapping(method=RequestMethod.POST,value="/addAdmin")
	@CrossOrigin(origins = "http://localhost:4200")
	public Admin addAdmin(@RequestBody AdminTO adminTO)
	{
		
		return this.adminService.addAdmin(adminTO);
	}
	
	//Logging check
	/*@RequestMapping(method=RequestMethod.POST,value="/loginAdmin", produces="application/json")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<String> loginAdmin(@RequestBody AdminTO adminTO)
	{
		System.out.println("Logged in ");
		System.out.println(this.adminService.loginAdmin(adminTO));
		return new ResponseEntity<String>(adminService.loginAdmin(adminTO), HttpStatus.OK);
		
	} */
	
	@RequestMapping(method=RequestMethod.POST,value="/loginAdmin", produces="application/json")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<ProjectStatus> loginAdmin(@RequestBody AdminTO adminTO)
	{
		System.out.println("Logged in ");
		//System.out.println(this.adminService.loginAdmin(adminTO));
		return new ResponseEntity<ProjectStatus>(adminService.loginAdmin(adminTO), HttpStatus.OK);
		
		
	} 
	
	// Viewing Logged admin Details
	@RequestMapping(method=RequestMethod.POST , path = { "adminDetails/{adminId}" })
	@CrossOrigin(origins = "http://localhost:4200")
	public AdminTO fetchAdminDetails(@PathVariable("adminId") int adminId) {
		System.out.println("Logged in admin Id "+ adminId);
		return this.adminService.fetchAdminDetails(adminId);
	}
	
	
	// Update Logged admin Details
	@RequestMapping(method=RequestMethod.PUT , path = { "updateAdminDetails/{adminId}" })
	@CrossOrigin(origins = "http://localhost:4200")
	public AdminTO updateAdminDetails(@RequestBody AdminTO adminTO ,@PathVariable("adminId") int adminId) {
		System.out.println("Logged in admin details "+ adminTO.toString());
		return this.adminService.updateAdminDetails(adminTO , adminId);
	}

	
	
	//Viewing all the admin details
	@RequestMapping("/admins")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Admin> getAllAdmins()
	{
		return this.adminService.getAllAdmins();
	}
	
	
}
