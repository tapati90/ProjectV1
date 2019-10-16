package springBoot.Project.Version1.admin.bean;

import javax.persistence.Embeddable;

@Embeddable
public class CagId {

	private String cagId;

	
	
	public CagId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CagId(String cagId) {
		super();
		this.cagId = cagId;
	}

	@Override
	public String toString() {
		return "CagId [cagId=" + cagId + "]";
	}

	public String getCagId() {
		return cagId;
	}

	public void setCagId(String cagId) {
		this.cagId = cagId;
	}

	
	
}
