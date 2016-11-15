package po;

import java.util.Set;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */
public class Department extends AbstractDepartment implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Department() {
		
	}

	/** full constructor */
	public Department(String departName, String departInfor) {
		super(departName, departInfor);
	}
	public Department(String departName, String departInfor, Set doctors) {
		super(departName, departInfor, doctors);
	}

}
