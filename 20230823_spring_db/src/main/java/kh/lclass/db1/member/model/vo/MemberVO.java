package kh.lclass.db1.member.model.vo;

import org.springframework.stereotype.Component;

@Component
public class MemberVO {
//	MID	VARCHAR2(20 BYTE)
//	MPWD	VARCHAR2(20 BYTE)
//	MNAME	VARCHAR2(50 BYTE)
//	MEMAIL	VARCHAR2(150 BYTE)
	private String mid;
	private String mpwd;
	private String mname;
	private String memail;

	@Override
	public String toString() {
		return "MemberVO [mid=" + mid + ", mpwd=" + mpwd + ", mname=" + mname + ", memail=" + memail + "]";
	}
	
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpwd() {
		return mpwd;
	}
	public void setMpwd(String mpwd) {
		this.mpwd = mpwd;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	
}
