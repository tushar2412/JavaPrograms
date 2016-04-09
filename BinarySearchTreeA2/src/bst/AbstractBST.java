package bst;

import java.util.Collection;
import java.util.Iterator;

/* 
 * @author - Tushar Sharma  * 
 * AbstractBST created to create abstract class for Binary Search Tree 
 */

public abstract class AbstractBST implements Collection<String> {

	public abstract boolean isEmpty();

	public abstract boolean addStringArray(String[] elements);

	public abstract boolean add(String data);

	public abstract Iterator<String> iterator();

	public abstract String toString();

	public abstract String[] toArray();

	public abstract int size();

	public abstract boolean remove(Object o);

	public abstract boolean contains(Object o);

	public abstract boolean containsAll(Collection<?> c);

	public abstract boolean removeAll(Collection<?> c);

	public abstract boolean retainAll(Collection<?> c);

	public abstract void clear();

	public abstract String get(int index);

	public abstract <T> T[] toArray(T[] a);

}
