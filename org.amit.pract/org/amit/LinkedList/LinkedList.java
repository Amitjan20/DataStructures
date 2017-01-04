package org.amit.LinkedList;

public class LinkedList {
	
	LinkedList node;
	int data;
	
	public LinkedList(LinkedList node, int data) {
		super();
		this.node = node;
		this.data = data;
	}
	public LinkedList getNode() {
		return node;
	}
	public void setNode(LinkedList node) {
		this.node = node;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

}
