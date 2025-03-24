package softronix.in.entity;

public class Student {
	
	private int stdId;
	private String stdName;
	private String stdAddr;
	private String stdGrade;
	private long stdNumber;
	
	
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdAddr() {
		return stdAddr;
	}
	public void setStdAddr(String stdAddr) {
		this.stdAddr = stdAddr;
	}
	public String getStdGrade() {
		return stdGrade;
	}
	public void setStdGrade(String stdGrade) {
		this.stdGrade = stdGrade;
	}
	public long getStdNumber() {
		return stdNumber;
	}
	public void setStdNumber(long stdNumber) {
		this.stdNumber = stdNumber;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdAddr=" + stdAddr + ", stdGrade=" + stdGrade
				+ ", stdNumber=" + stdNumber + "]";
	}
	
	
}

	
	
	