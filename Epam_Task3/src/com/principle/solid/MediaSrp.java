package com.principle.solid;

public class MediaSrp {
	private String name;
	private int duration;
	public MediaSrp(String name, int duration) {
		super();
		this.name = name;
		this.duration = duration;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}


}
