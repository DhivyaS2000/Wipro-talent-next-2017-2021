import java.io.*;
import  java.util.*;
class UserMainCode
{
  public int getMostFrequestDigit(int input1, int input2, int input3, int input4) {
		String str = String.valueOf(input1) + String.valueOf(input2) + String.valueOf(input3) + String.valueOf(input4);
		int[] digits = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; 
		
		for (int i = 0; i < str.length(); i++) {
			digits[Integer.parseInt(String.valueOf(str.charAt(i)))]++;
		}
		
		int mostFD = 0;
		
		for (int i = 0; i <= 9; i++) {
			mostFD 	= digits[i] >= digits[mostFD] ? i : mostFD;
		}
		
		return mostFD;
	}