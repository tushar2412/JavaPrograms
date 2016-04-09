package bst;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
 * @author - Tushar Sharma 
 * 
 * Utility Class created to perform operations-
 * 1. String Comparison.
 * 2. Check status of new node Inserted.
 * 3. Check if a String Starts with a vowel.
 */

public class BSTUtil {
	
	/*isStringLesserThan function compares two string lexically.
	 * If newData precedes current data, true is returned else false
	 * Logic used while inserting to decide new node goes to left sub-tree or right sub-tree
	*/
	public static boolean isStringLesserThan(String newData, String currentData) {
		if (newData.toLowerCase().compareTo(currentData.toLowerCase()) < 0) {
			return true;
		}
		return false;
	}
	
	/*checkInsertStatus function return statements to be printed to console
	 * This function in called after insert statements to acknowledge insertion success/failure
	*/
	public static String checkInsertStatus(boolean successfullInsert) {
		if (successfullInsert)
			return "Insert Successfull";
		else
			return "Insert Unsuccessfull : Null/Empty String not allowed";
	}
	
	/*startsWithVowel function returns true if data starts with a vowel.
	 * This function is used to display nodes starting with vowel in reverse order.
	*/
	public static boolean startsWithVowel(String data) {
		Set<Character> vowelList = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		if (vowelList.contains(Character.toLowerCase(data.charAt(0)))) {
			return true;
		}
		return false;
	}
}
