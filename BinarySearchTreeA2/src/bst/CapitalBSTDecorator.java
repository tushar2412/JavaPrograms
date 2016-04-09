package bst;
import java.util.LinkedList;


public class CapitalBSTDecorator extends IteratorBSTDecorator {

	LinkedList<String> listString = new LinkedList<String>();

	public CapitalBSTDecorator(BSTIterator iterator) {
		super(iterator);
		while(iterator.hasNext()) {
			String upperCaseString = iterator.next();
			upperCaseString = upperCaseString.toUpperCase();
			listString.add(upperCaseString);
		}
	}

	@Override
	public boolean hasNext() {
		return (!listString.isEmpty());
	}

	@Override
	public String next() {
		return listString.poll().toString();
	}
}
