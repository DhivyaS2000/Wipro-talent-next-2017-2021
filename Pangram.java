import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'isPangram' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY pangram as parameter.
     */

    public static String isPangram(List<String> pangram) {
	 // Write your code here
    String str="abcdefghijklmnopqrstuvwxyz";
    String res="";
    int f;
    for(String i:pangram)
    {
        f=0;
        for(int j=0;j<26;j++)
        {
            if(i.indexOf(str.charAt(j))==-1)
            {
                f=1;
                break;
            }
        }
        if(f==0)
        {
            res+=1;
        }
        else    
            res+=0;
    }
    return res;
    }
}public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int pangramCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> pangram = new ArrayList<>();

        for (int i = 0; i < pangramCount; i++) {
            String pangramItem = bufferedReader.readLine();
            pangram.add(pangramItem);
        }

        String result = Result.isPangram(pangram);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
