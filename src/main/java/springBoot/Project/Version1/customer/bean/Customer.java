package springBoot.Project.Version1.customer.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import springBoot.Project.Version1.document.bean.Document;


@Entity
 @Table(name= "customerDetails")
public class Customer {
  
	@Id 
	private int customerId;
	
	 private int adminId;
	 
	 private int cagId;
	 
	 private int gfcId;
	 
	 private String customerName;
	 
	 private List<Document> docs = new ArrayList<Document>();
	 
	  
	  
	  
	  

	
	 

	
	 
}



