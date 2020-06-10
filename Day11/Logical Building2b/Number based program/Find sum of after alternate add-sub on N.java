import java.io.*;
import java.util.*;

// Read only region start
class FindResultAfterAlternateAdd_subOnN {
	public int AddSub(int input1,int input2){
		// Read only region end
    //Write your code here
int N = input1;
		int ans = N;
		int var = 0;
		
		if (input2 == 1)
		 var = 1;
		else
		 var = 0;
		
		for (int i = N - 1, j = 0; i >= 1; i--, j++) {
			if (j % 2 == var) 
			ans += i;
			else 
			ans-= i;
			System.out.println(ans + " ");
		}
		
		return ans;
	}
}
	