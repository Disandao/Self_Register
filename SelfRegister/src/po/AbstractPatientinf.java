package po;

/**
 * AbstractPatientinf entity provides the base persistence definition of the
 * Patientinf entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPatientinf implements java.io.Serializable {

	// Fields

	private Integer serial;
	private String office;
	private String sex;
	private long idcard;
	private String conditions;

	// Constructors

	/** default constructor */
	public AbstractPatientinf() {
	}

	/** full constructor */
	public AbstractPatientinf(Integer serial,String office, String sex, long idcard,
			String conditions) {
		this.serial = serial;
		this.office = office;
		this.sex = sex;
		this.idcard = idcard;
		this.conditions = conditions;
	}

	// Property accessors

	public Integer getSerial() {
		return this.serial;
	}

	public void setSerial(Integer serial) {
		this.serial = serial;
	}

	public String getOffice() {
		return this.office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public long getIdcard() {
		return this.idcard;
	}

	public void setIdcard(long idcard) {
		this.idcard = idcard;
	}

	public String getConditions() {
		return this.conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

}