package bst;

public  class ReverseBSTOrder implements BSTOrderStrategy{

	@Override
	public String orderBy(String value) {
	    	     
	     int i, len = value.length();
	     StringBuilder dest = new StringBuilder(len);

	     for (i = (len - 1); i >= 0; i--){
	         dest.append(value.charAt(i));
	     }

	     return dest.toString();
	}
} 