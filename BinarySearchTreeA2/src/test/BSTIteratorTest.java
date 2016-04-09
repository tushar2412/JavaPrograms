package test;

import static org.junit.Assert.*;
import org.junit.Test;
import bst.BSTIterator;
import bst.BinarySearchTree;
import bst.NormalBSTOrder;

public class BSTIteratorTest {
	
	
	@Test
	public void testNext() {
		NormalBSTOrder no= new NormalBSTOrder();
		BinarySearchTree bst = new BinarySearchTree(no);
		bst.add("Tushar");
		bst.add("Sharma");
			
		BSTIterator instance = new BSTIterator(bst.getRoot());
		String expectedResult="Sharma";
		String actualResult=instance.next();
		assertEquals(expectedResult,actualResult);
		String expectedResult1="Tushar";
		String actualResult1=instance.next();
		assertEquals(expectedResult1,actualResult1);
	}
	
	@Test
	public void testHasNext() {
		NormalBSTOrder no= new NormalBSTOrder();
		BinarySearchTree bst = new BinarySearchTree(no);
		bst.add("Tushar");
		BSTIterator instance = new BSTIterator(bst.getRoot());
		Boolean expectedResult=true;
		Boolean actualResult=instance.hasNext();
		assertEquals(expectedResult,actualResult);
		String nextValue=instance.next();
		Boolean expectedResult1=false;
		Boolean actualResult1=instance.hasNext();
		assertEquals(expectedResult1,actualResult1);
	}
	
}
