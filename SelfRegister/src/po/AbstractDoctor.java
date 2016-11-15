package po;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractDoctor entity provides the base persistence definition of the Doctor
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDoctor implements java.io.Serializable {

	// Fields

	private String docId;
	private Department department;
	private String docName;
	private String docTel;
	private String docInfor;
	private String docPos;
	private Set rosters = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractDoctor() {
	}

	/** minimal constructor */
	public AbstractDoctor(String docId) {
		this.docId = docId;
	}
	public AbstractDoctor(String docId,  String docName,
			String docTel, String docInfor, String docPos) {
		this.docId = docId;
		this.docName = docName;
		this.docTel = docTel;
		this.docInfor = docInfor;
		this.docPos = docPos;
	}
	/** full constructor */
	public AbstractDoctor(String docId, Department department, String docName,
			String docTel, String docInfor, String docPos, Set rosters) {
		this.docId = docId;
		this.department = department;
		this.docName = docName;
		this.docTel = docTel;
		this.docInfor = docInfor;
		this.docPos = docPos;
		this.rosters = rosters;
	}

	// Property accessors

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getDocName() {
		return this.docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocTel() {
		return this.docTel;
	}

	public void setDocTel(String docTel) {
		this.docTel = docTel;
	}

	public String getDocInfor() {
		return this.docInfor;
	}

	public void setDocInfor(String docInfor) {
		this.docInfor = docInfor;
	}

	public String getDocPos() {
		return this.docPos;
	}

	public void setDocPos(String docPos) {
		this.docPos = docPos;
	}

	public Set getRosters() {
		return this.rosters;
	}

	public void setRosters(Set rosters) {
		this.rosters = rosters;
	}

}