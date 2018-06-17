package bookpkg;

public class LAddress {
	private String lnm;
	private String lstreet;
	private String lcity;
	@Override
	public String toString() {
		return "LAddress [lnm=" + lnm + ", lstreet=" + lstreet + ", lcity=" + lcity + "]";
	}
	public LAddress(String lnm, String lstreet, String lcity) {
		super();
		this.lnm = lnm;
		this.lstreet = lstreet;
		this.lcity = lcity;
	}
	public String getLnm() {
		return lnm;
	}
	public void setLnm(String lnm) {
		this.lnm = lnm;
	}
	public String getLstreet() {
		return lstreet;
	}
	public void setLstreet(String lstreet) {
		this.lstreet = lstreet;
	}
	public String getLcity() {
		return lcity;
	}
	public void setLcity(String lcity) {
		this.lcity = lcity;
	}
	
	

}
