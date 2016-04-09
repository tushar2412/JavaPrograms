package bst;

/* 
 * @author - Tushar Sharma  * 
 * BSTNode Class created to create model for every BST node
 */

public class BSTNode{
	 private String data;
	 private BSTNode leftNode;
	 private BSTNode rightNode;
	
	public BSTNode(String data){
		this.setData(data);
		setLeftNode(null);
		setRightNode(null);
	}

	public BSTNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(BSTNode leftNode) {
		this.leftNode = leftNode;
	}

	public BSTNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(BSTNode rightNode) {
		this.rightNode = rightNode;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}