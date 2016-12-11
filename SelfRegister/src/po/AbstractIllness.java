package po;

/**
 * AbstractIllness entity provides the base persistence definition of the
 * Illness entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIllness implements java.io.Serializable {

	// Fields

	private String illnessName;
	private Department department;

	// Constructors

	/** default constructor */
	public AbstractIllness() {
	}

	/** minimal constructor */
	public AbstractIllness(String illnessName) {
		this.illnessName = illnessName;
	}

	/** full constructor */
	public AbstractIllness(String illnessName, Department department) {
		this.illnessName = illnessName;
		this.department = department;
	}

	// Property accessors

	public String getIllnessName() {
		return this.illnessName;
	}

	public void setIllnessName(String illnessName) {
		this.illnessName = illnessName;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}