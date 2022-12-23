package jsbank;

public class BPDTO {

	private int bpno;
	private String bpname;
	private String regcon;
	private String period;
	private double taxrate;
	private double maxrate;
	private double wave;
	private String note;
	
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
	public double getWave() {
		return wave;
	}
	public void setWave(double wave) {
		this.wave = wave;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
