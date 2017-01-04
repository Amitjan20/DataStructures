package org.amit.BinaryTree;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BinaryTreeExamples1 {

	public static void main(String[] args) {
	
		BinaryTree seven = new BinaryTree(null, null, 7);
		BinaryTree six = new BinaryTree(null, null, 6);
		BinaryTree five = new BinaryTree(null, null, 5);
		BinaryTree four = new BinaryTree(null, null, 4);
		BinaryTree three = new BinaryTree(six, seven, 3);
		BinaryTree two = new BinaryTree(four, five, 2);
		BinaryTree root = new BinaryTree(two, three, 1);
		BinaryTree root2 =null;
		
		halfNodesInTree(root);
		fullNodesInTree(root);
		leafNodesInTree(root);
		areStructurallySame(root, root2);
		maxSumOfLevelInTree(root);

	}

	private static int maxSumOfLevelInTree(BinaryTree root) {
		Queue< BinaryTree> queue = new LinkedBlockingQueue<>();
		int currentSum = 0;
		int maxSum = 0;
		queue.add(root);
		queue.add(null);
		int level = 0;
		int maxLevel = 0;
		while(!queue.isEmpty()){
			BinaryTree temp = queue.poll();
			if(temp == null){
				if(currentSum > maxSum){
					maxSum = currentSum;
					maxLevel = level;
				}
				currentSum = 0;
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
		return maxLevel;
		
	}

	private static boolean areStructurallySame(BinaryTree root, BinaryTree root2) {
		if(root == null && root2 == null)
			return true;
		
		if(root == null || root2 == null)
			return false;
		
		return ((root.getData() == root2.getData()) && (areStructurallySame(root.getLeft(), root2.getLeft()) && (areStructurallySame(root.getRight(), root2.getRight()))));
		
	}

	private static int leafNodesInTree(BinaryTree root) {
		Queue< BinaryTree> queue = new LinkedBlockingQueue<>();
		queue.add(root);
		BinaryTree temp = null;
		int count = 0;
		
		while(!queue.isEmpty()){
			temp =queue.poll();
			if(temp.getLeft() == null && temp.getRight() == null){
				count++;
			}else{
				if(temp.getLeft() != null){
					queue.add(temp.getLeft());
				}
				if(temp.getRight() != null){
					queue.add(temp.getRight());
				}
			}
		
		}
		return count;
		
	}

	private static int fullNodesInTree(BinaryTree root) {
		Queue< BinaryTree> queue = new LinkedBlockingQueue<>();
		queue.add(root);
		BinaryTree temp = null;
		int count = 0;
		
		while(!queue.isEmpty()){
			temp =queue.poll();
			if(temp.getLeft() != null && temp.getRight() != null){
				count++;
			}
			if(temp.getLeft() != null){
					queue.add(temp.getLeft());
				}
			if(temp.getRight() != null){
					queue.add(temp.getRight());
				}
		
		}
		return count;
		
	}

	private static int halfNodesInTree(BinaryTree root) {
		Queue<BinaryTree> queue = new LinkedBlockingQueue<>();
		queue.add(root);
		BinaryTree temp = null;
		int count = 0;
		
		while(!queue.isEmpty()){
			temp =queue.poll();
			if((temp.getLeft() != null && temp.getRight() == null) || (temp.getLeft() == null && temp.getRight() != null)){
				count++;
			}
			if(temp.getLeft() != null){
					queue.add(temp.getLeft());
			}
			if(temp.getRight() != null){
					queue.add(temp.getRight());
			}
		
		}
		return count;
	}

}
