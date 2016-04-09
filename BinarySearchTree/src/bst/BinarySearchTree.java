package bst;

import bst.BSTUtil;

/* 
 * @author - Tushar Sharma  * 
 * BinarySearchTree Class created to implement Binary Search Tree and perform
 * 1. Insert operations.
 * 2. Display elements in the tree in alphabetic order.
 * 3. Display elements in the tree that start with a vowel in reverse alphabetic order.
 */

public class BinarySearchTree {
	public BSTNode rootNode;

	public BinarySearchTree() {
		this.rootNode = null;
	}

	/* insertNewNode - implements below logic for inserting in a Binary Search Tree 
	 * If new data < root element, it is compared with root's left child. 
	 * If new data > root element, it is compared with root's right child.
	 * If tress is empty new element is added as root node
	 * This is repeated until program reaches to a leaf node.
	 * If new data < leaf element -> data is inserted as the leaf's left child, 
	 * If new data > leaf element -> data is inserted as the leaf's right child,.
	*/
	public boolean insertNewNode(String newData) {
		
		//Null or Empty string cannot be inserted.
		if(newData==null||newData.equals("")){
				return false;
		}
		BSTNode newNode = new BSTNode(newData);
		if (rootNode== null) {
			rootNode = newNode;
			return true;
		}
		BSTNode currentNode = rootNode;
		BSTNode parentNode = null;

		while (true) {
			parentNode = currentNode;
			
			//compare new node's data to current node's data
			//if its lexically smaller than traverse to left sub-tree to implement BST logic
			if (BSTUtil.isStringLesserThan(newData, currentNode.getData())) {
				currentNode = currentNode.getLeftNode();
				if (currentNode == null) {				//reached leaf node
					parentNode.setLeftNode(newNode);
					return true;
				}
			} 
			//if its lexically smaller traverse to right subtree to implement BST logic
			else {
				currentNode = currentNode.getRightNode();
				if (currentNode == null) {				//reached leaf node
					parentNode.setRightNode(newNode);
					return true;
				}
			}
		}
	}

	/*
	 * displayBST - Prints BST in alphabetical order 
	 * recursive calls to reach left leafs -> roots-> right leafs
	*/
	public void displayBST(BSTNode rootNode) {
		if (rootNode != null) {
			displayBST(rootNode.getLeftNode());			
			System.out.print(" " + rootNode.getData());
			displayBST(rootNode.getRightNode());
		}
	}

	/*
	 * displayBST - Prints BST nodes starting with vowels in reverse alphabetical order 
	 * recursive calls to reach right leafs -> roots-> left leafs
	*/
	public void displayReverseBST(BSTNode rootNode) {
		if (rootNode != null) {
			displayReverseBST(rootNode.getRightNode());
			if (BSTUtil.startsWithVowel(rootNode.getData())) {
				System.out.print(" " + rootNode.getData());
			}
			displayReverseBST(rootNode.getLeftNode());
		}
	}

	

	public static void main(String arg[]) {

		BinarySearchTree bst = new BinarySearchTree();
		boolean successfullInsert;
		
		successfullInsert=bst.insertNewNode("Apple");
		System.out.println(BSTUtil.checkInsertStatus(successfullInsert));
		successfullInsert=bst.insertNewNode("Microsoft");
		System.out.println(BSTUtil.checkInsertStatus(successfullInsert));
		successfullInsert=bst.insertNewNode("amazon");
		System.out.println(BSTUtil.checkInsertStatus(successfullInsert));
		successfullInsert=bst.insertNewNode("facebook");
		System.out.println(BSTUtil.checkInsertStatus(successfullInsert));

		System.out.println("Elements in the tree in alphabetic order :- ");
		bst.displayBST(bst.rootNode);
		System.out.println();
		System.out.println("Elements in the tree that start with a vowel in reverse alphabetic order:- ");
		bst.displayReverseBST(bst.rootNode);
		
		System.out.println();
		successfullInsert=bst.insertNewNode("");  //Trying to insert empty string.
		System.out.println(BSTUtil.checkInsertStatus(successfullInsert));
		
		successfullInsert=bst.insertNewNode("Google");
		System.out.println(BSTUtil.checkInsertStatus(successfullInsert));
		successfullInsert=bst.insertNewNode("Intel");
		System.out.println(BSTUtil.checkInsertStatus(successfullInsert));
		
		System.out.println("Elements in the tree in alphabetic order :- ");
		bst.displayBST(bst.rootNode);
		System.out.println();
		System.out.println("Elements in the tree that start with a vowel in reverse alphabetic order:- ");
		bst.displayReverseBST(bst.rootNode);
	}
}
