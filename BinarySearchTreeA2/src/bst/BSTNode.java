package bst;

public class BSTNode extends Node {

	public BSTNode(String value) {
		this.value = value;
		leftNode = new NullBSTNode(this);
		rightNode = new NullBSTNode(this);
	}

	public boolean isNil() {
		return false;
	}

	@Override
	public void add(String newData, BSTOrderStrategy bs) {
		//Compare string to implement BST logic
		/* insertNewNode - implements below logic for inserting in a Binary Search Tree 
		 * If new data < root element, it is compared with root's left child. 
		 * If new data > root element, it is compared with root's right child.
		 * If tress is empty new element is added as root node
		 * This is repeated until program reaches to a leaf node.
		 * If new data < leaf element -> data is inserted as the leaf's left child, 
		 */
		if ((bs.orderBy(newData.toLowerCase()).compareTo(bs.orderBy(this.value.toLowerCase()))) > 0) {
			if (this.rightNode.isNil()) {
				setRightNode = true;
			}
			rightNode.add(newData, bs);
		} else {
			if (this.leftNode.isNil()) {
				setLeftNode = true;
			}
			leftNode.add(newData, bs);
		}
	}
}
