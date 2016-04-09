package test;

import static org.junit.Assert.*;

import org.junit.Test;

import bst.BSTIterator;
import bst.BinarySearchTree;
import bst.CapitalBSTDecorator;
import bst.NormalBSTOrder;

/* 
 * @author - Tushar Sharma  * 
 * BinarySearchTreeTest Class created to test Binary Search Tree Implementation.
 */

public class CapitalBSTDecoratorTest
{	
	@Test
	public void testNext() {
		
		NormalBSTOrder no= new NormalBSTOrder();
		BinarySearchTree bst = new BinarySearchTree(no);
		bst.add("Tushar");
		bst.add("Sharma");
		
		BSTIterator iterator= new BSTIterator(bst.getRoot());
		CapitalBSTDecorator instance = new CapitalBSTDecorator(iterator);
		String expectedResult="SHARMA";
		String actualResult=instance.next();
		assertEquals(expectedResult,actualResult);
		String expectedResult1="TUSHAR";
		String actualResult1=instance.next();
		assertEquals(expectedResult1,actualResult1);
	}
}
