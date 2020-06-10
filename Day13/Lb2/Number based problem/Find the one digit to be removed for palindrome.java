import java.io.*;
import java.util.*;

// Read only region start
class FindTheOneDigitToBeRemovedToFormPalindrome {

	public int digitRemove_Palin(int input1){
StringBuilder n = new StringBuilder(String.valueOf(input1));
		
		for (int i = 0; i < n.length(); i++) {
			if (palindromeCheck(n.toString()))
			 return -1;
			
			char r = n.charAt(i);
			String Num = n.deleteCharAt(i).toString();
			
			if (palindromeCheck(Num)) {
			    System.out.println(i + ":: " + Num + " :: " + r);
				return Integer.parseInt(String.valueOf(r));
			} else {
				n.insert(i, r);
			}				
		}
		
		return -1;
	}
	public static boolean palindromeCheck(String input1) {
		input1 = input1.toLowerCase();
		int digitCount = input1.length();
		boolean isPalindrome = true;

		int range = digitCount / 2;
		if (digitCount % 2 == 0) 
		range--;

		for (int i = 0; i <= range; i++) {
			if (input1.charAt(i) != input1.charAt(digitCount - i - 1)) isPalindrome = false;
		}

		return isPalindrome;

	}	
	
	}
