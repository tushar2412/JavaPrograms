package Hero;


/**
 * This class decides the strategy that will used to insert data into the BinarySearchTree.
 * @author Santosh Yadav
 *
 */
public interface BinaryStrategy {
	/**
	 * This class defines an interface for the strategies that will used to insert data
	 * into the BinarySearchTree.
	 * @param data1 This represents the new Node String element to be inserted into the tree. 
	 * @param data2 This represents the existing Node String element to which the new element is compared.
	 * @return
	 */
       public boolean doOperation(String data1, String data2);
}

class OperationStraight implements BinaryStrategy{
	/**
	 * This function does comparison of the Strings based on ASCII values.
	 * Here, the ASCII values are compared by converting the strings to a common LowerCase.
	 * The String is not altered in any way.
	 */
	@Override
	   public boolean doOperation(String data1, String data2) {  
	     if(data1.toLowerCase().compareTo(data2.toLowerCase())<=0)
	        return true;
	     else
	    	return false;
	  }
}

class OperationReverse implements BinaryStrategy{
	/**
	 * This function also does comparison of the Strings based on ASCII values.
	 * Here, the ASCII values are compared by converting the strings to a common LowerCase.
	 * The String is not altered in this case. Here instead of the original String, it's riverse
	 * is used to make entries into the BinarySearchTree.
	 */
	@Override
	   public boolean doOperation(String data1, String data2) {
		StringBuffer buffer1 = new StringBuffer(data1);
		StringBuffer buffer2 = new StringBuffer(data2);
		buffer1.reverse();
		buffer2.reverse();
	      if((buffer1+"").toLowerCase().compareTo((buffer2+"").toLowerCase())<=0)
	    	 return true;
	      else
	    	 return false;
	  }
}