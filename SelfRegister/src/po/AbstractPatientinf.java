package po;

/**
 * AbstractPatientinf entity provides the base persistence definition of the
 * Patientinf entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPatientinf implements java.io.Serializable {

	// Fields

	private Integer serial=0;
	private String office;
	private String sex;
	private long idcard;
	private String conditions;
	private String username;
	private String tel;
	private String name;

	// Constructors

	/** default constructor */
	public AbstractPatientinf() {
	}

	/** full constructor */
	public AbstractPatientinf(String office, String sex, long idcard,
			String conditions, String username, String tel, String name) {
		this.office = office;
		this.sex = sex;
		this.idcard = idcard;
		this.conditions = conditions;
		this.username = username;
		this.tel = tel;
		this.name = name;
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

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}