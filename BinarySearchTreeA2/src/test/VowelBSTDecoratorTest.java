package test;

import static org.junit.Assert.*;
import org.junit.Test;
import bst.BSTIterator;
import bst.BinarySearchTree;
import bst.NormalBSTOrder;
import bst.VowelBSTDecorator;

/* 
 * @author - Tushar Sharma  * 
 * VowelBSTDecoratorTest to test VowelDecorator Implementation.
 */

public class VowelBSTDecoratorTest {
	
	@Test
	public void testNext() {
		NormalBSTOrder no= new NormalBSTOrder();
		BinarySearchTree bst = new BinarySearchTree(no);
		bst.add("Tushar");
		bst.add("Sharma");
		bst.add("SDSU");
		bst.add("AZTEC");
		
		BSTIterator iterator= new BSTIterator(bst.getRoot());
		VowelBSTDecorator instance = new VowelBSTDecorator(iterator);
		String expectedResult="AZTEC";
		String actualResult=instance.next();
		assertEquals(expectedResult,actualResult);
		
	}
}
