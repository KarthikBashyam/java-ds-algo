package com.practice.trees;

public class BinarySearchTree {

	private BSTNode root;

	public void add(int element) {

		root = addElement(root, element);
	}

	private BSTNode addElement(BSTNode root, int element) {

		if (root == null) {
			root = new BSTNode(element, null, null);
			return root;
		}

		if (element < root.getData()) {
			root.left = addElement(root.left, element);
		} else if (element > root.getData()) {
			root.right = addElement(root.right, element);
		}

		return root;

	}
	
	public void inOrderTraversal(BSTNode node) { 
		if(node == null) {
			return;
		}
				
		inOrderTraversal(node.left);
		System.out.println(node.data);
		inOrderTraversal(node.right);
		
	}
	
	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(30);
		bst.add(50);
		bst.add(15);
		bst.add(20);
		bst.add(10);
		bst.add(40);
		bst.add(60);
		
		bst.inOrderTraversal(bst.root);
	}

}

class BSTNode {

	BSTNode left;
	BSTNode right;
	int data;

	public BSTNode getLeft() {
		return left;
	}

	public BSTNode(int data, BSTNode left, BSTNode right) {
		super();
		this.left = left;
		this.right = right;
		this.data = data;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}