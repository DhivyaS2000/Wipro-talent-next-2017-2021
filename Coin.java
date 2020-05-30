import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'fewestCoins' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING coins as parameter.
     */

    public static int fewestCoins(String coins) {
    
        int i=Integer.parseInt(coins);
        return i;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String coins = bufferedReader.readLine();

        int result = Result.fewestCoins(coins);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
