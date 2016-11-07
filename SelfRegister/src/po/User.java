package po;

/**
 * Patientinf entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(Integer id, String name, String password) {
		super(id, name, password);
	}

}