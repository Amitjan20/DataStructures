package org.amit.BinaryTree;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;
	/*		1
		2       3
	4      5 6     7
	
	*/
public class BinaryTreeOperations {
	
	public static void main(String args[]){
		
		BinaryTree seven = new BinaryTree(null, null, 7);
		BinaryTree six = new BinaryTree(null, null, 6);
		BinaryTree five = new BinaryTree(null, null, 5);
		BinaryTree four = new BinaryTree(null, null, 4);
		BinaryTree three = new BinaryTree(six, seven, 3);
		BinaryTree two = new BinaryTree(four, five, 2);
		BinaryTree root = new BinaryTree(two, three, 1);
		
		preOrder(root);
		inOrder(root);
		postOrder(root);
		
	}
	
	public static void preOrder(BinaryTree root){
		Stack<BinaryTree> stack = new Stack<>();
		if(root == null)
			return;
		while(true){
			while(root != null){
				System.out.print(root.getData() + " ");
				stack.push(root);
			}
			if(stack.isEmpty()){
				break;
			}
			root = stack.pop();
			root = root.getRight();
		}
	}

	public static void inOrder(BinaryTree root){
		Stack<BinaryTree> stack = new Stack<>();
		if(root == null)
			return;
		while(true){
			while(root != null){
				stack.push(root);
			}
			if(stack.isEmpty()){
				break;
			}
			root = stack.pop();
			System.out.print(root.getData() + " ");
			root = root.getRight();
		}
	}
	
	public static void levelOrder(BinaryTree root){
		Queue<BinaryTree> queue = new LinkedBlockingQueue<>();
		queue.add(root);
		while(!queue.isEmpty()){
			BinaryTree temp = queue.poll();
			System.out.println(temp.getData());
			if(temp.getLeft() != null)
				queue.add(temp);
			if(temp.getRight() != null){
				queue.add(temp);
			}
		}
		queue.removeAll(queue);
	}
	
	public static void postOrder(BinaryTree root){
		Stack<BinaryTree> stack = new Stack<>();
		while(true){
			if(root != null){
				stack.push(root);
				root = root.getLeft();
			}else{
				if(stack.isEmpty())
					break;
				else{
					if(stack.peek().getRight() == null){
						root = stack.pop();
						System.out.println(root.getData());
						if(root == stack.peek().getRight()){
							System.out.println(stack.peek().getData());
							stack.pop();
						}
					}
					if(!stack.isEmpty()){
						root = stack.peek().getRight();
					}
				}
			}
		}
	}
}
