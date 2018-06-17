package bookpkg;

public class Book {
	private int bid;
	private String bnm;
	private LAddress libadd;
	@Override
	public String toString() {
		return "\n Book [bid=" + bid + ", bnm=" + bnm + ", libadd=" + libadd + "]";
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBnm() {
		return bnm;
	}
	public void setBnm(String bnm) {
		this.bnm = bnm;
	}
	public LAddress getLibadd() {
		return libadd;
	}
	public void setLibadd(LAddress libadd) {
		this.libadd = libadd;
	}
	public Book(int bid, String bnm, LAddress libadd) {
		super();
		this.bid = bid;
		this.bnm = bnm;
		this.libadd = libadd;
	}
	

}
