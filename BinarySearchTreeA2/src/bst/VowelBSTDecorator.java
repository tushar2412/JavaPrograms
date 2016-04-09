package bst;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


public class VowelBSTDecorator extends IteratorBSTDecorator {

	LinkedList<String> stringList=new LinkedList<String>();
	
	public VowelBSTDecorator(BSTIterator iterator) {
		super(iterator);
		while(iterator.hasNext()){
			String vowelStr=iterator.next();
			Set<Character> vowelList = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
			if (vowelList.contains(Character.toLowerCase(vowelStr.charAt(0)))) {
				stringList.add(vowelStr);
			}
		}
	}
	
	@Override
	public String next() {
		return stringList.poll().toString();
	}
	
	@Override
	public boolean hasNext() {
		return (!stringList.isEmpty());
	}
}
