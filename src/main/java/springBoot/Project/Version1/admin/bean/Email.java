package springBoot.Project.Version1.admin.bean;

import javax.persistence.Embeddable;

@Embeddable
public class Email {

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
