import java.io.*;
import  java.util.*;
class UserMainCode
{
  public int getIsPalindromeString(String input1) {
		input1 = input1.toLowerCase();
		int Count = input1.length();
		boolean palin = true;
		
		int r = Count / 2;
		if (Count % 2 == 0) 
    {
    r--;
    }
		
		for (int i = 0; i <= r; i++) {
			if (input1.charAt(i) != input1.charAt(Count - i - 1)) 
      {
      palin= false;
      }
		}
		
		if (palin == true) 
    return 2;
		else 
    return 1;
	}