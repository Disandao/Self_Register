package po;

/**
 * AbstractRoster entity provides the base persistence definition of the Roster
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRoster implements java.io.Serializable {

	// Fields

	private String rosterId;
	private Doctor doctor;
	private String rosterMon;
	private String rosterTue;
	private String rosterWed;
	private String rosterThu;
	private String rosterFri;
	private String rosterSat;
	private String rosterSun;

	// Constructors

	/** default constructor */
	public AbstractRoster() {
	}

	/** minimal constructor */
	public AbstractRoster(String rosterId) {
		this.rosterId = rosterId;
	}

	/** full constructor */
	public AbstractRoster(String rosterId, Doctor doctor, String rosterMon,
			String rosterTue, String rosterWed, String rosterThu,
			String rosterFri, String rosterSat, String rosterSun) {
		this.rosterId = rosterId;
		this.doctor = doctor;
		this.rosterMon = rosterMon;
		this.rosterTue = rosterTue;
		this.rosterWed = rosterWed;
		this.rosterThu = rosterThu;
		this.rosterFri = rosterFri;
		this.rosterSat = rosterSat;
		this.rosterSun = rosterSun;
	}

	// Property accessors

	public String getRosterId() {
		return this.rosterId;
	}

	public void setRosterId(String rosterId) {
		this.rosterId = rosterId;
	}

	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getRosterMon() {
		return this.rosterMon;
	}

	public void setRosterMon(String rosterMon) {
		this.rosterMon = rosterMon;
	}

	public String getRosterTue() {
		return this.rosterTue;
	}

	public void setRosterTue(String rosterTue) {
		this.rosterTue = rosterTue;
	}

	public String getRosterWed() {
		return this.rosterWed;
	}

	public void setRosterWed(String rosterWed) {
		this.rosterWed = rosterWed;
	}

	public String getRosterThu() {
		return this.rosterThu;
	}

	public void setRosterThu(String rosterThu) {
		this.rosterThu = rosterThu;
	}

	public String getRosterFri() {
		return this.rosterFri;
	}

	public void setRosterFri(String rosterFri) {
		this.rosterFri = rosterFri;
	}

	public String getRosterSat() {
		return this.rosterSat;
	}

	public void setRosterSat(String rosterSat) {
		this.rosterSat = rosterSat;
	}

	public String getRosterSun() {
		return this.rosterSun;
	}

	public void setRosterSun(String rosterSun) {
		this.rosterSun = rosterSun;
	}

}