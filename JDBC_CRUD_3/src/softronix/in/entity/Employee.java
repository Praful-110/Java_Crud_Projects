package softronix.in.entity;

public class Employee {
	
	private int eid;
	private String ename;
	private String eaddr;
	private float esal;
	private String eposition;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getEposition() {
		return eposition;
	}
	public void setEposition(String eposition) {
		this.eposition = eposition;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddr=" + eaddr + ", esal=" + esal + ", eposition="
				+ eposition + "]";
	}
	
	

}
