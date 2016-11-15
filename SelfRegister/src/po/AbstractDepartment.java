package po;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractDepartment entity provides the base persistence definition of the
 * Department entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDepartment implements java.io.Serializable {

	// Fields

	private String departName;
	private String departInfor;
	private Set doctors = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractDepartment() {
	}

	/** minimal constructor */
	public AbstractDepartment(String departName) {
		this.departName = departName;
	}

	/** full constructor */
	public AbstractDepartment(String departName, String departInfor) {
		this.departName = departName;
		this.departInfor = departInfor;
		
	}
	public AbstractDepartment(String departName, String departInfor, Set doctors) {
		this.departName = departName;
		this.departInfor = departInfor;
		this.doctors = doctors;
	}

	// Property accessors

	public String getDepartName() {
		return this.departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getDepartInfor() {
		return this.departInfor;
	}

	public void setDepartInfor(String departInfor) {
		this.departInfor = departInfor;
	}

	public Set getDoctors() {
		return this.doctors;
	}

	public void setDoctors(Set doctors) {
		this.doctors = doctors;
	}

}