package po;

/**
 * Message entity. @author MyEclipse Persistence Tools
 */
public class Message extends AbstractMessage implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Message() {
	}

	/** minimal constructor */
	public Message(Integer messageId) {
		super(messageId);
	}

	/** full constructor */
	public Message(Integer messageId, User user, String words, String time,
			Integer agree, Integer pid,String pidName) {
		super(messageId, user, words, time, agree, pid,pidName);
	}

}
