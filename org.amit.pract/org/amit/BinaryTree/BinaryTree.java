package org.amit.BinaryTree;

public class BinaryTree {
	
	BinaryTree left;
	BinaryTree right;
	int data;
	public BinaryTree getLeft() {
		return left;
	}
	public void setLeft(BinaryTree left) {
		this.left = left;
	}
	public BinaryTree getRight() {
		return right;
	}
	public void setRight(BinaryTree right) {
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinaryTree(BinaryTree left, BinaryTree right, int data) {
		super();
		this.left = left;
		this.right = right;
		this.data = data;
	}

}
