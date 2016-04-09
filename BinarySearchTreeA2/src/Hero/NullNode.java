package Hero;


public class NullNode extends Node {

	/**
	 * This class gives definition for Null node. This is part of Null object Pattern.
	 * The idea has been taken from Tutorials Point and was modified as per needs.
	 * @param node
	 */
	public NullNode(Node node) {
		this.parent = node;
	}

	/**
	 * This function returns true as it represents the Null Object.
	 */
	@Override
	public boolean isNil() {
		return true;
	}
    
	@Override
	public void add(String value, BinaryStrategy bs) {
		/**
	     * The code below searches for Null nodes. This is part of a recursive call to the add
	     * function. If a null node is encountered, the new Node that the user has entered will be added
	     * to the structure.
	     */
			if (parent.setLeftChild) {
			    parent.setLeftChild = false;
			    Node newNode = new RealNode(value);
			    parent.leftChild = newNode;
		    } 
			else 
				if (parent.setRightChild) {
			        parent.setRightChild = false;
			        Node newNode = new RealNode(value);
			        parent.rightChild = newNode;
		        }
	    }
}
