package com.student.pojo;

public class Teacher {
	
	private Integer tid;
	private String tname;
	private String tpwd;
	private Integer courseId;
	private String tsex;
	private Integer authorId;
	private Integer state;

	public Teacher() {
		super();
	}

	public Teacher(Integer tid, String tname, String tpwd, Integer courseId, String tsex, Integer authorId,
			Integer state) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tpwd = tpwd;
		this.courseId = courseId;
		this.tsex = tsex;
		this.authorId = authorId;
		this.state = state;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTpwd() {
		return tpwd;
	}

	public void setTpwd(String tpwd) {
		this.tpwd = tpwd;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getTsex() {
		return tsex;
	}

	public void setTsex(String tsex) {
		this.tsex = tsex;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", tpwd=" + tpwd + ", courseId=" + courseId + ", tsex="
				+ tsex + ", authorId=" + authorId + ", state=" + state + "]";
	}

}
