package Hero;

import junit.framework.TestCase;


/**
 * The BinarySearchTreeTest program will test so of the functions of the BinarySearchTree class.
 * The class inherits the base class TestCase and the functions defined in the class
 * get called TestRunner.run() method in the main method.
 * @author Santosh Yadav
 *
 */

public class BinarySearchTreeTest extends TestCase{
	
	public BinarySearchTreeTest(String name) 
	{
	super(name);
	}

/**
 * This method will test the working of the BinarySearchTree function add(String).
 * If the data gets added the test will pass else it will fail.
 */
	public void testStraightInput() 
	{
	BinarySearchTree testStraightInput = new BinarySearchTree(new OperationStraight());
	assertTrue("Checks if String is added to Tree & takes care of Order", testStraightInput.add("ball"));
	assertTrue("Checks if String is added to Tree & takes care of Order", testStraightInput.add("dog"));
	assertTrue("Checks if String is added to Tree & takes care of Order", testStraightInput.add("apple"));
	}   

	public void testReverseInput() 
	{
	BinarySearchTree testReverseInput = new BinarySearchTree(new OperationReverse());
	assertTrue("Checks if String is added to Tree & takes care of Order", testReverseInput.add("ball"));
	assertTrue("Checks if String is added to Tree & takes care of Order", testReverseInput.add("apple"));
	assertTrue("Checks if String is added to Tree & takes care of Order", testReverseInput.add("cat"));

	} 
	
	/**
	 * This method will test the working of the BinarySearchTree function toArray.
	 * If tests the returned data which will a String array with the input given.
	 */
	
	public void testToArray() 
	{
	  BinarySearchTree testToArray=new BinarySearchTree(new OperationStraight());
	  testToArray.add("ball");
	  testToArray.add("dog");
	  testToArray.add("apple");
	  String buffer[]=testToArray.toArray();
	  assertEquals("ball",buffer[0]);
	  assertEquals("apple",buffer[2]);
	  assertEquals("dog",buffer[1]);
	  
	}
	
	/**
	 * This method will test the working of the BinarySearchTree function Decorators.
	 * This will in particular test the Capitalization Decorator.
	 */
	public void testDecoratorCapital() 
	{
		BinarySearchTree sampleTree= new BinarySearchTree(new OperationReverse());
		sampleTree.add("apple");
		sampleTree.add("ball");
		sampleTree.add("dog");
		DecoratorCapital capital=new DecoratorCapital(sampleTree.iterator());
		assertEquals("APPLE",capital.next());
	}
	
	/**
	 * This method will test the working of the BinarySearchTree function Decorators.
	 * This will in particular test the Vowel Decorator.
	 */
	public void testDecoratorVowel() 
	{
		BinarySearchTree sampleTree= new BinarySearchTree(new OperationStraight());
		sampleTree.add("apple");
		sampleTree.add("ball");
		sampleTree.add("egg");
		DecoratorVowel vowel=new DecoratorVowel(sampleTree.iterator());
		assertEquals("apple",vowel.next());
		assertEquals("egg",vowel.next());
	}
   
}

/**
 * Testing class defines the main method which runs all the test functions defined in the 
 * BinarySearchTreeTest class.
 */
class Testing {
 public static void main (String args[]) 
  {
	junit.textui.TestRunner.run(BinarySearchTreeTest.class);
  }
}