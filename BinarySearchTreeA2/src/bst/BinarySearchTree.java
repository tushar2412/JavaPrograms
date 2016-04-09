package bst;

import java.util.Collection;
import java.util.Iterator;

public class BinarySearchTree extends AbstractBST {

	private Node root;
	private int treeSize = 0;

	private BSTOrderStrategy orderStrategy;

	public BinarySearchTree(BSTOrderStrategy strategy) {
		this.orderStrategy = strategy;
	}

	@Override
	public boolean isEmpty() {
		 if(root == null)
				return true;
		 return false;
	}

	@Override
	public boolean addStringArray(String[] elements) {
		for (String item: elements) {
			add(item);
		}
		return true;
	}

	@Override
	public boolean add(String data) {
		
		if (treeSize == 0) {
			root = new BSTNode(data);
		} else {
			root.add(data, orderStrategy);
		}
		treeSize++;
		return true;
	}

	@Override
	public Iterator<String> iterator() {
		return new BSTIterator(root);
	}
	
	@Override
	public String toString() {
	
		StringBuffer traversalString = new StringBuffer();
		Iterator<String> stringIterator = iterator();
		while (stringIterator.hasNext()) {
			traversalString.append(stringIterator.next() + " ");
		}
		return traversalString.toString().trim();		
	}

	@Override
	public String[] toArray() {
		
		String[] bstArrayData = new String[treeSize];
		Iterator<String> bstIterator = iterator();
		for (int i = 0; bstIterator.hasNext(); i++) {
			bstArrayData[i] = bstIterator.next();
		}
		return bstArrayData;
	}
	
	@Override
	public int size() {
		return treeSize;
	}


	@Override
	public boolean remove(Object o) {
	
		throw new UnsupportedOperationException(
				"this method is not supported yet");

	}

	@Override
	public boolean contains(Object o) {
		throw new UnsupportedOperationException(
				"this method is not supported yet");
	}

	@Override
	public boolean containsAll(Collection<?> c) {
	
		throw new UnsupportedOperationException(
				"this method is not supported yet");
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException(
				"this method is not supported yet");
	}

	@Override
	public boolean retainAll(Collection<?> c) {
	
		throw new UnsupportedOperationException(
				"this method is not supported yet");
	}

	@Override
	public void clear() {
		
		throw new UnsupportedOperationException(
				"this method is not supported yet");
	}

	@Override
	public boolean addAll(Collection<? extends String> c) {
		
		return false;
	}


	@Override
	public String get(int index) {
		
		return null;
	}
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		
		return null;
	}
	
}
