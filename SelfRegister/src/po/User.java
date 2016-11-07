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
	public User(long idcard,Integer id, String name, String password) {
		super(idcard,id, name, password);
	}

}