package com.student.pojo;

public class Score {

	private String courseName;
	private String tname;
	private Integer score;

	public Score() {
		super();
	}

	public Score(String courseName, String tname, Integer score) {
		super();
		this.courseName = courseName;
		this.tname = tname;
		this.score = score;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Score [courseName=" + courseName + ", tname=" + tname + ", score=" + score + "]";
	}

}
