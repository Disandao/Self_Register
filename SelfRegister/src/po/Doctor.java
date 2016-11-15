package po;

import java.util.Set;

public class Doctor extends AbstractDoctor implements java.io.Serializable {
	public Doctor() {
	}
	public Doctor(String docId) {
		super(docId);
	}
	public Doctor(String docId, String docName,
			String docTel, String docInfor, String docPos) {
		super(docId,docName,
				docTel, docInfor, docPos);
	}
	public Doctor(String docId, Department department, String docName,
			String docTel, String docInfor, String docPos, Set rosters) {
		super(docId,department,docName,
				docTel, docInfor, docPos, rosters);
	}
}
