package po;

/**
 * Patientinf entity. @author MyEclipse Persistence Tools
 */
public class Patientinf extends AbstractPatientinf implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Patientinf() {
	}

	/** full constructor */
	public Patientinf(String office, String sex, long idcard, String conditions) {
		super(office, sex, idcard, conditions);
	}

}
