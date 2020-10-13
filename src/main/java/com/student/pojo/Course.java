package com.student.pojo;

public class Course {

	private Integer courseId;
	private String courseName;
	private Integer classId;

	public Course() {
		super();
	}

	public Course(Integer courseId, String courseName, Integer classId) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.classId = classId;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", classId=" + classId + "]";
	}

}
