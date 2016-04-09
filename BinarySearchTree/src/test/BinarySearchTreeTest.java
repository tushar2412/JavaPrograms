package test;

import static org.junit.Assert.*;

import org.junit.Test;

import bst.BinarySearchTree;
import bst.BSTUtil;
import bst.BSTNode;

/* 
 * @author - Tushar Sharma  * 
 * BinarySearchTreeTest Class created to test Binary Search Tree Implementation.
 */

public class BinarySearchTreeTest {
	
	/* 
	 * testInsertNewNode to test successful insertion of not-null Strings.
	 * and no insert operation for null strings.
	 */
	@Test
	public void testInsertNewNode() {
		BinarySearchTree bst = new BinarySearchTree();
		assertEquals(true, bst.insertNewNode("abc"));
		assertEquals(false, bst.insertNewNode(""));
		assertEquals(true, bst.insertNewNode("def"));
	}
	
	/* 
	 * testStartsWithVowel to test strings starting with vowels.
	 * Returns true if a string starts with vowels.
	 */
	@Test
	public void testStartsWithVowel() {
		
		assertEquals(true, BSTUtil.startsWithVowel("abc"));
		assertEquals(true, BSTUtil.startsWithVowel("eBDx"));
		assertEquals(true, BSTUtil.startsWithVowel("iou"));
		assertEquals(true, BSTUtil.startsWithVowel("O123W"));
		assertEquals(true, BSTUtil.startsWithVowel("uST"));
		assertEquals(false, BSTUtil.startsWithVowel("nOPq"));
		assertEquals(false, BSTUtil.startsWithVowel("m123ST"));
		assertEquals(false, BSTUtil.startsWithVowel("Zabc"));
	}

	/* 
	 * testIsStringLesserThan to test lexical comparison of strings.
	 */
	@Test
	public void testIsStringLesserThan() {
		assertEquals(true, BSTUtil.isStringLesserThan("abc", "def"));
		assertEquals(true, BSTUtil.isStringLesserThan("abc", "abd"));
		assertEquals(false, BSTUtil.isStringLesserThan("def", "abc"));
		assertEquals(false, BSTUtil.isStringLesserThan("ABC", "abc"));
	}

	/* 
	 * testCountInsert to test side-effects of insertion in Binary Search tree.
	 * Count matched after each insertion.
	 */
	@Test
	public void testCountInsert() {
		BinarySearchTree bst = new BinarySearchTree();
		assertEquals(0, countNodesHelper(bst.rootNode));
		bst.insertNewNode("tushar");
		bst.insertNewNode("astha");
		bst.insertNewNode("utsav");
		bst.insertNewNode("Zebra");
		assertEquals(4, countNodesHelper(bst.rootNode));
		bst.insertNewNode("Orange");
		assertEquals(5, countNodesHelper(bst.rootNode));
	}

	/* 
	 * countNodesHelper to is helper function to count number of nodes in Binary Search Tree.
	 */
	public int countNodesHelper(BSTNode rootNode) {
		if (rootNode == null) {
			return 0;
		}

		int nodeCounter = 1;
		BSTNode leftNode = rootNode.getLeftNode();
		BSTNode rightNode = rootNode.getRightNode();
		if (rootNode.getLeftNode() != null)
			nodeCounter += countNodesHelper(leftNode);
		if (rootNode.getRightNode() != null)
			nodeCounter += countNodesHelper(rightNode);

		return nodeCounter;
	}
}
