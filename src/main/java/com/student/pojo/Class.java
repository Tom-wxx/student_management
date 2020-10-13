package com.student.pojo;

public class Class {

	private Integer classId;
	private String className;

	public Class() {
		super();
	}

	public Class(Integer classId, String className) {
		super();
		this.classId = classId;
		this.className = className;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "Class [classId=" + classId + ", className=" + className + "]";
	}

}
