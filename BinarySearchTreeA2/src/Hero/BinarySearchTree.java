package Hero;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/**
 * The BinarySearchTree program will construct a Binary Search Tree  with
 * strings as the data in the nodes. The comparison of the data is done
 * based on the ASCII values of direct and reverse Strings.
 * 
 * @author Santosh Yadav
 *
 */
public class BinarySearchTree extends AbstractList<String> {

	private BinaryStrategy strategy;
	private Node root;
	private int treeSize = 0;
	
	public BinarySearchTree(BinaryStrategy strategy) {
		/**
		 * The BinarySearchTree constructor accepts the strategy that will be used to build the tree.
		 * This is passed a parameter while creating the object of the tree.
		 */
		this.strategy = strategy;
	}
	
    /**
     * The add function will accept String data and will add it to the BinarySearchTree.
     * The function returns true or false depending on whether the insertion was successful or not.
     */ 		
	@Override
	public boolean add(String value) {
		if(value=="")
		  return false;
		if (treeSize == 0) {
			root = new RealNode(value);
		} 
		else {
			root.add(value, strategy);
		}
		treeSize++;
		return true;
	}

	/**
	 * The iterator function is used to get the Iterator on the constructed BinarySearchTree.
	 */
	@Override
	public Iterator<String> iterator() {
		return new BinarySearchTreeIterator(root);
	}
  
	/**
	 * The toArray function returns the array of type of element in the BinarySearchTree.
	 */ 
	@Override
	public String[] toArray() {
	/** In this case we have String as the data element. So the return type is array of String.
	 * The main definition of toArray should actually return Object types but in this case it has not been 
	 * implemented in that manner.
	 */
		String[] binarySearchData = new String[treeSize];
		Iterator<String> binarySearchIterator = iterator();
		for (int i = 0; binarySearchIterator.hasNext(); i++) {
			binarySearchData[i] = binarySearchIterator.next();
		}
		return binarySearchData;
	}

	/**The size function returns number of elements in the BinarySearchTree.
	 */
	@Override
	public int size() {
		return treeSize;
	}

	/**The get function returns element in the BinarySearchTree.
	 * However, it has not been implemented.
	 */
	@Override
	public String get(int index) {
		return null;
	}

	/**The toString function returns the String representation of the BuinarySearchTree Object.
	 * It displays all data in the tree in String appended fashion.
	 */
	@Override
	public String toString() {
		Iterator<String> stringIterator = iterator();
		StringBuffer traverse= new StringBuffer();
		while (stringIterator.hasNext()) {
			traverse.append(stringIterator.next() + " ");
		}
		return traverse.toString();
		
	}
}
