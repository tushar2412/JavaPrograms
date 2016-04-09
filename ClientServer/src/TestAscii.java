
public class TestAscii {
	public static void main (String args[]){
		char[] charArray = "Hello World".toCharArray();
        
        for(int i=0; i<charArray.length; i++){
        	System.out.println(charArray[i]);
        	charArray[i]=(char) (charArray[i]+1);
        	System.out.println(charArray[i]);
        }
        System.out.println( new String(charArray));
	}
}
