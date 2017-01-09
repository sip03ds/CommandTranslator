package com.linknet.data;

public interface Control {
	public void setProtocol(Protocol p);
	public Protocol getProtocol();
	public void setControlName(ControlName cn);
	public ControlName getControlName();
}