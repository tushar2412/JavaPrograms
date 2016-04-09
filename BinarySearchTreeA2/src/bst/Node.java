package bst;

public abstract class Node {
	protected String value;
	protected Node parent=null;
	protected Node leftNode=null;
	protected Node rightNode=null;
	protected boolean setLeftNode = false;
    protected boolean setRightNode = false;
    
    public abstract void add(String value, BSTOrderStrategy bs);
    public abstract boolean isNil();
	
}
