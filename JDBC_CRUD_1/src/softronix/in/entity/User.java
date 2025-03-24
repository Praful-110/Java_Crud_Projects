package softronix.in.entity;

public class User {
	private int uid;
	private String uname;
	private float usal;
	private String uaddr;
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public float getUsal() {
		return usal;
	}
	public void setUsal(float usal) {
		this.usal = usal;
	}
	public String getUaddr() {
		return uaddr;
	}
	public void setUaddr(String uaddr) {
		this.uaddr = uaddr;
	}
	
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", usal=" + usal + ", uaddr=" + uaddr + "]";
	}
	
	
	
	

}
