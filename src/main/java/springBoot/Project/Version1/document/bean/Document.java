package springBoot.Project.Version1.document.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "documentDetails")

public class Document {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int docId;
	
	private String docName;
	
	private List<String> country = new ArrayList<>();

	private String serverLocation ;
	
	
	
	private int cagId;
	
	private int gfcId;
	
	
	
	
	
	private Admin admin
	
	private Customer customer;
	
	
}
