package com.sidharth.application;

public class DummyEntity {

	private String id;
	private String desc;
	
	public DummyEntity(String id, String desc) {
		super();
		this.id = id;
		this.desc = desc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
