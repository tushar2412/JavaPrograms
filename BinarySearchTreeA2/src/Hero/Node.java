package Hero;


public abstract class Node {
	/**
	 * This class gives the structure of the node that the BinarySearchTree is going to
	 * contain. In order to avoid null checks and to store parent node information some
	 * extra fields have been added to the Class.
	 */
	protected String value;
	protected Node leftChild=null;
	protected Node rightChild=null;
	protected boolean setLeftChild = false;
    protected boolean setRightChild = false;
	protected Node parent=null;
	public abstract void add(String value, BinaryStrategy bs);
	public abstract boolean isNil();

}
/**Some names of the functions and variables are taken from Tutorials Point.
 * So there will be some common names of functions and variables.
 */
