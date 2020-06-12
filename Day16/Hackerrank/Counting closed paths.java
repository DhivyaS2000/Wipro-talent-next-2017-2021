import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result{
    public static int closedPaths(int number) {
    // Write your code here
    int s=0;
    while(number>0)
    {
        int r =  number%10;
        if(r==0 || r==4 || r==6 || r==9)
        {
            s=s+1;
        }
        else if(r==8)
        {
            s=s+2;
        }
          
        
        else
        {
            s=s+0;
        }
        number/=10;
    }
    return s;

    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int number = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.closedPaths(number);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
            

   
