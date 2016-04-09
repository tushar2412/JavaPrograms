package test;

import static org.junit.Assert.*;
import org.junit.Test;
import bst.BinarySearchTree;
import bst.NormalBSTOrder;
import bst.ReverseBSTOrder;

/* 
 * @author - Tushar Sharma  * 
 * BinarySearchTreeTest Class created to test Binary Search Tree Implementation.
 */

public class BinarySearchTreeTest {
	@Test
	public void testToString() {
		NormalBSTOrder no= new NormalBSTOrder();
		BinarySearchTree bstNormalOrder = new BinarySearchTree(no);
		bstNormalOrder.add("Tushar");
		bstNormalOrder.add("Sharma");
		bstNormalOrder.add("SDSU");
		bstNormalOrder.add("AZTEC");
		
		String expectedResult="AZTEC SDSU Sharma Tushar";
		String actualResult=bstNormalOrder.toString();
		assertEquals(expectedResult,actualResult);
		
		ReverseBSTOrder  ro= new ReverseBSTOrder();
		BinarySearchTree bstReverseOrder = new BinarySearchTree(ro);
		bstReverseOrder.add("Tushar");
		bstReverseOrder.add("Sharma");
		bstReverseOrder.add("SDSU");
		bstReverseOrder.add("AZTEC");

		String expectedResult2="Sharma AZTEC Tushar SDSU";
		String actualResult2=bstReverseOrder.toString();
		assertEquals(expectedResult2,actualResult2);
		
	}
	
	@Test
	public void testToArray() {
		NormalBSTOrder no= new NormalBSTOrder();
		BinarySearchTree bstNormalOrder = new BinarySearchTree(no);
		bstNormalOrder.add("Tushar");
		bstNormalOrder.add("Sharma");
		bstNormalOrder.add("SDSU");
		bstNormalOrder.add("AZTEC");
		
		String expectedResult[]={"AZTEC","SDSU","Sharma","Tushar"};
		String actualResult[]=bstNormalOrder.toArray();
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	public void testInsert() {
		NormalBSTOrder no= new NormalBSTOrder();
		BinarySearchTree bstNormalOrder = new BinarySearchTree(no);
		bstNormalOrder.add("Tushar");
		bstNormalOrder.add("Sharma");
		bstNormalOrder.add("SDSU");
		bstNormalOrder.add("AZTEC");
			
		int expectedResult=4;
		int actualResult=bstNormalOrder.size();
		assertEquals(expectedResult,actualResult);
	}
}
