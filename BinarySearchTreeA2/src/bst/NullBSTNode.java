package bst;

public class NullBSTNode extends Node {

	public NullBSTNode(Node node) {
		// TODO Auto-generated constructor stub
		this.parent = node;
	}

	@Override
	public boolean isNil() {
		return true;
	}

	@Override

	public void add(String value, BSTOrderStrategy bs) {
		if (parent.setLeftNode) {
			parent.setLeftNode = false;
			Node newBstNode = new BSTNode(value);
			parent.leftNode = newBstNode;
		} else if (parent.setRightNode) {
			parent.setRightNode = false;
			Node newBstNode = new BSTNode(value);
			parent.rightNode = newBstNode;
		}
	}

}
