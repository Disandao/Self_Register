package po;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractUser entity provides the base persistence definition of the User
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUser implements java.io.Serializable {

	// Fields

	private long idcard;
	private Integer id;
	private String name;
	private String password;
	private Set messages = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractUser() {
	}

	/** minimal constructor */
	public AbstractUser(long idcard) {
		this.idcard = idcard;
	}
	public AbstractUser(long idcard, Integer id, String name, String password) {
		this.idcard = idcard;
		this.id = id;
		this.name = name;
		this.password = password;
	}
	/** full constructor */
	public AbstractUser(long idcard, Integer id, String name, String password,
			Set messages) {
		this.idcard = idcard;
		this.id = id;
		this.name = name;
		this.password = password;
		this.messages = messages;
	}

	// Property accessors

	public long getIdcard() {
		return this.idcard;
	}

	public void setIdcard(long idcard) {
		this.idcard = idcard;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set getMessages() {
		return this.messages;
	}

	public void setMessages(Set messages) {
		this.messages = messages;
	}

}