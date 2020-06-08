import.java.io.*;
import java.io.util;
class UserMainCode{
public String addNumberstrings(String input1,String input2){
	
		BigDecimal a = new BigDecimal(input1);
		BigDecimal b = new BigDecimal(input2);
		
		return String.valueOf(a.add(b));
		
		
		
	}
	
	
}