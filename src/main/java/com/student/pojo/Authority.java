package com.student.pojo;

public class Authority {

	private Integer authorId;
	private String authority;

	public Authority() {
		super();
	}

	public Authority(Integer authorId, String authority) {
		super();
		this.authorId = authorId;
		this.authority = authority;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "Authority [authorId=" + authorId + ", authority=" + authority + "]";
	}

}
