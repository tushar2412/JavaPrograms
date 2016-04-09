package Hero;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
/**
 * The class below implements Iterator of type String to define the Decorators.
 * @author Santosh Yadav
 *
 */
public abstract class DecoratorIterator implements Iterator<String> {
	   protected Iterator<String> stringIterator; 
	
		public DecoratorIterator(Iterator<String> stringIterator) {
			this.stringIterator=stringIterator;
		}
}

/**
 * The class DecoratorIterator has been given additional functionality to convert letters into
 * capitals.
 * @author Santosh Yadav
 *
 */
class DecoratorCapital extends DecoratorIterator {

	LinkedList<String> list = new LinkedList<String>();

	public DecoratorCapital(Iterator<String> stringIterator) {
		super(stringIterator);
		while (stringIterator.hasNext()) {
			String capitals = stringIterator.next();
			capitals = capitals.toUpperCase();
			list.add(capitals);
		}
	}

	@Override
	public boolean hasNext() {
		return (!list.isEmpty());
	}

	@Override
	public String next() {
		return list.poll().toString();
	}
}

/**
 * The class DecoratorIterator has been given extra functionality  to display strings which contains.
 * @author Santosh Yadav
 *
 */

class DecoratorVowel extends DecoratorIterator {

	Stack<String> newstack=new Stack<String>();
	public DecoratorVowel(Iterator<String> stringIterator) {
		super(stringIterator);
		HashSet<Character> vowel= new HashSet<Character>();
		vowel.add('i');vowel.add('o');vowel.add('u');
		vowel.add('a');vowel.add('e');
		while(stringIterator.hasNext()){
			String withVowel=stringIterator.next();
			if(!vowel.add(withVowel.toLowerCase().charAt(0))){
				newstack.push(withVowel);
			}
		}
	}
	
	@Override
	public String next() {
		return newstack.pop();
	}
	
	@Override
	public boolean hasNext() {
		return (!newstack.isEmpty());
	}

}

