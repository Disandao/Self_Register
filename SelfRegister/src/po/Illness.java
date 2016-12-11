package po;

/**
 * Illness entity. @author MyEclipse Persistence Tools
 */
public class Illness extends AbstractIllness implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Illness() {
	}

	/** minimal constructor */
	public Illness(String illnessName) {
		super(illnessName);
	}

	/** full constructor */
	public Illness(String illnessName, Department department) {
		super(illnessName, department);
	}
	
}
