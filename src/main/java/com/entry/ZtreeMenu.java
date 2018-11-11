package com.entry;

public class ZtreeMenu {
	
	private long id;
	private String name;
	private long pId;
	private String url;
	private boolean open;
	private boolean isParent;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getpId() {
		return pId;
	}
	public void setpId(long pId) {
		this.pId = pId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public boolean setIsOpen() {
		return open;
	}
	public void setIsOpen(boolean open) {
		this.open = open;
	}
	public boolean getIsParent() {
		return isParent;
	}
	public void setIsParent(boolean isParent) {
		this.isParent = isParent;
	}
	
}
