package com.practice.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	BinaryTreeNode root;

	public void addElement(int element) {

		if (root == null) {
			root = new BinaryTreeNode(element, null, null);
			return;
		}
		Queue<BinaryTreeNode> queue = new LinkedList<>();
		while (!queue.isEmpty()) {
			BinaryTreeNode node = queue.poll();

			if (node.left == null) {
				node.left = new BinaryTreeNode(element, null, null);
				break;
			} else {
				queue.add(node.left);
			}

			if (node.right == null) {
				node.right = new BinaryTreeNode(element, null, null);
				break;
			} else {
				queue.add(node.right);
			}
		}

	}

	public void levelOrderTraversal() {

		Queue<BinaryTreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {

			int levelSize = queue.size();

			for (int i = 1; i <= levelSize; i++) {
				BinaryTreeNode node = queue.poll();
				System.out.println(node.data);
				if (node.left != null) {
					queue.add(node.left);
				}

				if (node.right != null) {
					queue.add(node.right);
				}
			}

		}

	}

	public static void main(String[] args) {

		BinaryTree binaryTree = new BinaryTree();
		binaryTree.addElement(10);
		binaryTree.addElement(20);
		binaryTree.addElement(30);
		binaryTree.levelOrderTraversal();

	}

}

class BinaryTreeNode {
	public BinaryTreeNode left;
	public int data;
	public BinaryTreeNode right;

	public BinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}

	public BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "BinaryTreeNode [left=" + left + ", data=" + data + ", right=" + right + "]";
	}

}
