package jsbank;

public class EmpDTO {

//	EMPNO     NOT NULL NUMBER        
//	ENAME     NOT NULL VARCHAR2(100) 
//	DEPT      NOT NULL VARCHAR2(100) 
//	RANK      NOT NULL VARCHAR2(100) 
//	EPHONENUM NOT NULL VARCHAR2(100) 
//	EMPEMAIL  NOT NULL VARCHAR2(100)

	private int empno;
	private String ename;
	private String dept;
	private String rank;
	private String ephonenum;
	private String empemail;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getEphonenum() {
		return ephonenum;
	}

	public void setEphonenum(String ephonenum) {
		this.ephonenum = ephonenum;
	}

	public String getEmpemail() {
		return empemail;
	}

	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}

	
}
