package bst;

import java.util.Iterator;

public abstract class IteratorBSTDecorator implements Iterator<String> {
	   protected Iterator<String> stringIterator; 
	
		public IteratorBSTDecorator(Iterator<String> stringIterator) {
			this.stringIterator=stringIterator;
		}
}
