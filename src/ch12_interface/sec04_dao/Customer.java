package ch12_interface.sec04_dao;

// 일종의 DTO로 만든 클래식 - DB를 액세스 할 때 사용되는 데이터 구조
public class Customer {

	private int cid;
	private String cname;
	private String email;
	
	public Customer() {}
	
	public Customer(int cid, String cname, String email) {
		this.cid = cid;
		this.cname = cname;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}