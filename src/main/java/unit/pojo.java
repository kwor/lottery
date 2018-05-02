package unit;

import java.util.List;

public class pojo {
	//开奖时间
	String time;
	//期数
	Long issue;
	//开奖号码
	List<String> lotterynumber;
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Long getIssue() {
		return issue;
	}
	public void setIssue(Long issue) {
		this.issue = issue;
	}
	public List<String> getLotterynumber() {
		return lotterynumber;
	}
	public void setLotterynumber(List<String> lotterynumber) {
		this.lotterynumber = lotterynumber;
	}
	
}
