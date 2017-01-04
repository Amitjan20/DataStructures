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
