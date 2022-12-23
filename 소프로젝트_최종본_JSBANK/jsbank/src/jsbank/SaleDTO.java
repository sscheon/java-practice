package jsbank;

public class SaleDTO {

	private int clino;
	private String cname;
	private String grade;
	private int bpno;
	private String bpname;
	private String regcon;
	private String period;
	private String bpdate;
	private double taxrate;
	private double maxrate;
	private double rate;
	private String note;
	private int empno;
	private String ename;
	private int bptotalnum;

	
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
	public int getBpno() {
		return bpno;
	}
	public void setBpno(int bpno) {
		this.bpno = bpno;
	}
	public String getBpname() {
		return bpname;
	}
	public void setBpname(String bpname) {
		this.bpname = bpname;
	}
	public String getRegcon() {
		return regcon;
	}
	public void setRegcon(String regcon) {
		this.regcon = regcon;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public double getTaxrate() {
		return taxrate;
	}
	public void setTaxrate(double taxrate) {
		this.taxrate = taxrate;
	}
	public double getMaxrate() {
		return maxrate;
	}
	public void setMaxrate(double maxrate) {
		this.maxrate = maxrate;
	}
	public int getBptotalnum() {
		return bptotalnum;
	}
	public void setBptotalnum(int bptotalnum) {
		this.bptotalnum = bptotalnum;
	}
	
}
