package bst;



public class BSTMain {
	public static void main(String args[]) {

		System.out.println("Binary Search in normal order");
		NormalBSTOrder no = new NormalBSTOrder();
		BinarySearchTree bstDemo1 = new BinarySearchTree(no);
		
		bstDemo1.add("Zebra");
		bstDemo1.add("Orange");
		bstDemo1.add("Apple");		
		bstDemo1.add("Ball");		
		bstDemo1.add("Microsoft");
		bstDemo1.add("Zebra");

		System.out.println("Binary Search Tree : " + bstDemo1.toString());
		System.out.println();

		System.out.println("Binary Search inserted in reverse order");
		ReverseBSTOrder ro = new ReverseBSTOrder();
		BinarySearchTree bstDemo2 = new BinarySearchTree(ro);

		bstDemo2.add("Microsoft");
		bstDemo2.add("Apple");
		bstDemo2.add("Ball");
		bstDemo2.add("Orange");
		bstDemo2.add("Zebra");

		System.out.println("Binary Search Tree : " + bstDemo2.toString());
		System.out.println();
		BSTIterator iterator = new BSTIterator(bstDemo1.getRoot());
		CapitalBSTDecorator instance = new CapitalBSTDecorator(iterator);
		System.out.println("Elements in upper case are (Captial Decorator)");
		while (instance.hasNext()) {
			System.out.print(instance.next() + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println("Elements starting with Vowels are (Vowel Decorator)");
		BSTIterator iterator1 = new BSTIterator(bstDemo1.getRoot());
		VowelBSTDecorator instance1 = new VowelBSTDecorator(iterator1);

		while (instance1.hasNext()) {
			System.out.print(instance1.next() + " ");
		}
	}
}
