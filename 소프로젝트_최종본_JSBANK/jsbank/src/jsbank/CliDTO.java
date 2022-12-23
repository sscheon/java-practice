package jsbank;

public class CliDTO {
//	CLINO     NOT NULL NUMBER        
//	CNAME     NOT NULL VARCHAR2(100) 
//	REGNUM    NOT NULL VARCHAR2(100) 
//	CPHONENUM NOT NULL VARCHAR2(100) 
//	ACNTNUM   NOT NULL VARCHAR2(100) 
//	ADDRESS   NOT NULL VARCHAR2(200) 
//	CLIEMAIL  NOT NULL VARCHAR2(100) 
//	BPNO      NOT NULL NUMBER        
//	GRADE     NOT NULL VARCHAR2(100) 
//	BPDATE             DATE          
//	EMPNO     NOT NULL NUMBER    
	private int clino;
	private String cname;
	private String regnum;
	private String cphonenum;
	private String acntnum;
	private String address;
	private String cliemail;
	private int bpno;
	private String grade;
	private String bpdate;
	private int empno;

	public int getClino() {
		return clino;
	}

	public void setClino(int clino) {
		this.clino = clino;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getRegnum() {
		return regnum;
	}

	public void setRegnum(String regnum) {
		this.regnum = regnum;
	}

	public String getCphonenum() {
		return cphonenum;
	}

	public void setCphonenum(String cphonenum) {
		this.cphonenum = cphonenum;
	}

	public String getAcntnum() {
		return acntnum;
	}

	public void setAcntnum(String acntnum) {
		this.acntnum = acntnum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCliemail() {
		return cliemail;
	}

	public void setCliemail(String cliemail) {
		this.cliemail = cliemail;
	}

	public int getBpno() {
		return bpno;
	}

	public void setBpno(int bpno) {
		this.bpno = bpno;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getBpdate() {
		return bpdate;
	}

	public void setBpdate(String bpdate) {
		this.bpdate = bpdate;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

}
