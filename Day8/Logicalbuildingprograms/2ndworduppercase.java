import java.util.*;
import.java.io.*;
class UserMainCode
{
public int String getSecondWordInUppercase(String input1) {
		if (input1.equals("")) 
    return "LESS";
		
		StringBuffer sb = new StringBuffer(input1.trim());
		
		try {
			int si = sb.indexOf(" ");
			if (si== -1)
      return "LESS";
			
			try {
				int ei = sb.indexOf(" ", si+1) + 1;
				return sb.substring(si+1, endIndex).toUpperCase().trim();
			} catch (StringIndexOutOfBoundsException e) {
				
				return sb.substring(si+1).toUpperCase().trim();
			}
		} catch (StringIndexOutOfBoundsException e) {
			
			return "LESS";
		}
	}