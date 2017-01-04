package org.amit.BinaryTree;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class BinaryTreeExamples {
	
	public static void main(String args[]){
		BinaryTree root = null;
		
		maximumElementInTree(root);
		searchElementInTree(root, 10);
		insertElementInTree(root);
		sizeOfTree(root);
		levelOrderInReverse(root);
		heightofTree(root);
		deepestNodeInTree(root);
		
	}

	private static BinaryTree deepestNodeInTree(BinaryTree root) {
		Queue< BinaryTree> queue = new LinkedBlockingQueue<>();
		queue.add(root);
		BinaryTree temp = null;
		
		while(!queue.isEmpty()){
			temp =queue.poll();
			if(temp.getLeft() != null){
				queue.add(temp.getLeft());
			}
			if(temp.getRight() != null){
				queue.add(temp.getRight());
			}
		}
		return temp;
		
	}

	private static int heightofTree(BinaryTree root) {
		Queue< BinaryTree> queue = new LinkedBlockingQueue<>();
		queue.add(root);
		queue.add(null);
		int level = 1;
		while(!queue.isEmpty()){
			BinaryTree temp = queue.poll();
			if(temp == null){
				queue.add(null);
				level++;
			}else{
				if(temp.getLeft() != null){
					queue.add(temp.getLeft());
				}
				if(temp.getRight() != null){
					queue.add(temp.getRight());
				}
			}
			
		}
		return level;
		
	}

	private static void levelOrderInReverse(BinaryTree root) {
		Queue< BinaryTree> queue = new LinkedBlockingQueue<>();
		Stack<BinaryTree> stack = new Stack<>();
		queue.add(root);
		BinaryTree temp = null;
		
		while(!queue.isEmpty()){
			temp =queue.poll();
			if(temp.getRight() != null){
				queue.add(temp.getRight());
			}
			if(temp.getLeft() != null){
				queue.add(temp.getLeft());
			}
			stack.push(temp);
		}
		while(!stack.isEmpty()){
			System.out.println(temp.getData());
		}
		
		
	}

	private static int sizeOfTree(BinaryTree root) {
	
		Queue< BinaryTree> queue = new LinkedBlockingQueue<>();
		queue.add(root);
		int count = 1;
		
		while(!queue.isEmpty()){
			BinaryTree temp = queue.poll();
			count++;
			if(temp.getLeft() != null){
				queue.add(temp.getLeft());
			}
			if(temp.getRight() != null){
				queue.add(temp.getRight());
			}
		}
		return count;
	}

	private static void insertElementInTree(BinaryTree root) {
		Queue< BinaryTree> queue = new LinkedBlockingQueue<>();
		queue.add(root);
		BinaryTree newNode = new BinaryTree(null, null, 10);
		/*if( newNode == null){
			System.out.println("memory error");
		}*/
		
		while(!queue.isEmpty()){
			BinaryTree temp = queue.poll();
			if(temp.getLeft() != null){
				queue.add(temp.getLeft());
			}else{
				temp.setLeft(newNode);
			}
			if(temp.getRight() != null){
				queue.add(temp.getRight());
			}else{
				temp.setRight(newNode);
			}
		}
	}

	private static BinaryTree searchElementInTree(BinaryTree root, int data) {
		Queue< BinaryTree> queue = new LinkedBlockingQueue<>();
		queue.add(root);
		if(root.getData() == data){
			return root;
		}
		while(!queue.isEmpty()){
			BinaryTree temp = queue.poll();
			if(temp.getData() == data){
				return temp;
			}
			if(temp.getLeft() != null){
				queue.add(temp.getLeft());
			}
			if(temp.getRight() != null){
				queue.add(temp.getRight());
			}
		}
		return null;
		
	}

	private static int maximumElementInTree(BinaryTree root) {
		int max = Integer.MIN_VALUE;
		Queue< BinaryTree> queue = new LinkedBlockingQueue<>();
		queue.add(root);
		while(!queue.isEmpty()){
			BinaryTree temp = queue.poll();
			if(max < temp.getData()){
				max = temp.getData();
			}
			if(temp.getLeft() != null){
				queue.add(temp.getLeft());
			}
			if(temp.getRight() != null){
				queue.add(temp.getRight());
			}
		}
		return max;
		
	}

}
