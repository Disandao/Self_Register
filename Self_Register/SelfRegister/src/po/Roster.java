package po;

/**
 * Roster entity. @author MyEclipse Persistence Tools
 */
public class Roster extends AbstractRoster implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Roster() {
	}

	/** minimal constructor */
	public Roster(String rosterId) {
		super(rosterId);
	}

	/** full constructor */
	public Roster(String rosterId, Doctor doctor, String rosterMon,
			String rosterTue, String rosterWed, String rosterThu,
			String rosterFri, String rosterSat, String rosterSun) {
		super(rosterId, doctor, rosterMon, rosterTue, rosterWed, rosterThu,
				rosterFri, rosterSat, rosterSun);
	}

}
