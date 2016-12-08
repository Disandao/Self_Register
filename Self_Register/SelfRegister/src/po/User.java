package po;

import java.util.Set;

/**
 * Patientinf entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public User() {
	}
	public  User(long idcard) {
		super(idcard);
	}
	public User(long idcard, Integer id, String name, String password) {
		super(idcard, id, name, password);
	}

	/** full constructor */
	public User(long idcard, Integer id, String name, String password,Set messages) {
		super(idcard, id, name, password, messages);
	}

}