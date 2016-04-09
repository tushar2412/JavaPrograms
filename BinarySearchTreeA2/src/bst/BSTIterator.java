package bst;

import java.util.Iterator;
import java.util.Stack;

/* 
 * @author - Tushar Sharma  * 
 * BSTIterator created to implement Iterator
 */

public class BSTIterator implements Iterator<String> {

	private Node nextNode;
	private Stack<Node> stackNodes = new Stack<Node>();

	public BSTIterator(Node root) {
		while (!(root.isNil())) {
			stackNodes.push(root);
			root = root.leftNode;
		}
	}

	@Override
	public boolean hasNext() {
		return (!stackNodes.isEmpty());
	}

	@Override
	public String next() {
		if (stackNodes.isEmpty()) {
			throw new java.util.NoSuchElementException();
		}

		nextNode = (Node) stackNodes.pop();
		String currentValue = nextNode.value;
		if (!(nextNode.rightNode.isNil())) {
			nextNode = nextNode.rightNode;
			while (!(nextNode.isNil())) {
				stackNodes.push(nextNode);
				nextNode = nextNode.leftNode;
			}
		}
		return currentValue;
	}
}