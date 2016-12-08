package po;

/**
 * AbstractMessage entity provides the base persistence definition of the
 * Message entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMessage implements java.io.Serializable {

	// Fields

	private Integer messageId;
	private User user;
	private String words;
	private String time;
	private Integer agree;
	private Integer pid;
	private String pidName;

	// Constructors

	/** default constructor */
	public AbstractMessage() {
	}

	/** minimal constructor */
	public AbstractMessage(Integer messageId) {
		this.messageId = messageId;
	}

	/** full constructor */
	public AbstractMessage(Integer messageId, User user, String words,
			String time, Integer agree, Integer pid, String pidName) {
		this.messageId = messageId;
		this.user = user;
		this.words = words;
		this.time = time;
		this.agree = agree;
		this.pid = pid;
		this.pidName = pidName;
	}

	// Property accessors

	public Integer getMessageId() {
		return this.messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getWords() {
		return this.words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getAgree() {
		return this.agree;
	}

	public void setAgree(Integer agree) {
		this.agree = agree;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPidName() {
		return this.pidName;
	}

	public void setPidName(String pidName) {
		this.pidName = pidName;
	}

}