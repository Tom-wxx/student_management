package com.student.pojo;

import java.util.ArrayList;
import java.util.List;

public class Student {

	// 参数名
	private Integer sid;
	private String sname;
	private String spwd;
	private String ssex;
	private Integer sage;
	private Integer state;
	private Integer classId;
	private Integer authorId;

	private List<Score> scorelist = new ArrayList<>();
	private String className;
	private String authority;

	// 无参方法
	public Student() {
		super();
	}

	public Student(Integer sid, String sname, String spwd, String ssex, Integer sage, Integer state, Integer classId,
			Integer authorId, List<Score> scorelist, String className, String authority) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.spwd = spwd;
		this.ssex = ssex;
		this.sage = sage;
		this.state = state;
		this.classId = classId;
		this.authorId = authorId;
		this.scorelist = scorelist;
		this.className = className;
		this.authority = authority;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSpwd() {
		return spwd;
	}

	public void setSpwd(String spwd) {
		this.spwd = spwd;
	}

	public String getSsex() {
		return ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public Integer getSage() {
		return sage;
	}

	public void setSage(Integer sage) {
		this.sage = sage;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public List<Score> getScorelist() {
		return scorelist;
	}

	public void setScorelist(List<Score> scorelist) {
		this.scorelist = scorelist;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", spwd=" + spwd + ", ssex=" + ssex + ", sage=" + sage
				+ ", state=" + state + ", classId=" + classId + ", authorId=" + authorId + ", scorelist=" + scorelist
				+ ", className=" + className + ", authority=" + authority + "]";
	}

}
