package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;


import bst.BinarySearchTree;
import bst.NormalBSTOrder;
import bst.ReverseBSTOrder;
import bst.VowelBSTDecorator;



/* 
 * @author - Tushar Sharma  * 
 * BinarySearchTreeTest Class created to test Binary Search Tree Implementation.
 */

public class ReverseBSTOrderTest {
	
	/* 
	 * testInsertNewNode to test successful insertion of not-null Strings.
	 * and no insert operation for null strings.
	 */
	/*@Test
	public void testInsertNewNode() {
		NormalOrder no= new NormalOrder();
		BinarySearchTree bst = new BinarySearchTree(no);
		assertEquals(true, bst.add("abc"));
		assertEquals(true, bst.add("def"));
		
	}
	*/
	
	@Test
	public void testOrderBy() {
		ReverseBSTOrder instance=new ReverseBSTOrder();
		
		String expectedResult="eci";
		String actualResult=instance.orderBy("ice");
		assertEquals(expectedResult,actualResult);
		
	}
	

	
}
