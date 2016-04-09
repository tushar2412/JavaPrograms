package Hero;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTreeIterator implements Iterator<String> {
    /**
     * This class implements the Iterator<String> interface so that our BinarySearchTree
     * can have an Iterator of its own.
     */
	
	/**The Stack class is used to build a stack of the node we have traversed.
	 * This helps hasNext and next functions in returning appropriate values.
	 */
	private Stack<Node> nodeOnStack = new Stack<Node>();
	private Node nextNode;

	public BinarySearchTreeIterator(Node root) {

		while (!(root.isNil())) {
			nodeOnStack.push(root);
			root = root.leftChild;
		}
	}
    
	@Override
	public String next() {
		/**
		 * We throw a NoSuchElementException if the Stack is found to be empty.
		 */
		if (nodeOnStack.isEmpty()) {
			throw new java.util.NoSuchElementException();
		}
		String matchPattern = nextNode.value;
		nextNode = (Node) nodeOnStack.pop();
		
		if (!(nextNode.rightChild.isNil())) {
			nextNode = nextNode.rightChild; 
			while(!(nextNode.isNil())){
				nodeOnStack.push(nextNode);
				nextNode = nextNode.leftChild;
			}
		}
		return matchPattern;
	}
	
	@Override
	public boolean hasNext() {
		return (!nodeOnStack.isEmpty());
	}

}
