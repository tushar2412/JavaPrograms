package Hero;


public class RealNode extends Node {

	public RealNode(String value) {
		this.value = value;
		leftChild = new NullNode(this);
		rightChild = new NullNode(this);
	}
    
	
	public boolean isNil() {
		/**
		 * This function returns false as it represents the Real Object.
		 */
		return false;
	}

	
	@Override
	public void add(String value, BinaryStrategy bs) {
		/**
		 * This is a recursive call to the add method to find a null node and add the newly added element
		 * to the tree.
		 */
		if (bs.doOperation(value, this.value)) {
			if (this.leftChild.isNil()) {
				setLeftChild = true;
			}
			leftChild.add(value, bs);
		} else {
			if (this.rightChild.isNil()) {
				setRightChild = true;
			}
			rightChild.add(value, bs);
		}
	}
}
