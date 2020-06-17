import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'minimalOperations' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY words as parameter.
     */

    public static List<Integer> minimalOperations(List<String> words) {
    // Write your code here
    ArrayList<Integer> arl = new ArrayList<Integer>();
        //int wordsSize = Integer.parseInt(words.get(0));
        for(int j=0; j<words.size();j++){
            String s1 = words.get(j);
            int count = 0;

            for (int i = 1; i < s1.length(); i++) {
                if (s1.charAt(i) == s1.charAt(i - 1)) {
                    count++;
                    i++;
                }
            }
            arl.add(count);
        }    
        
        return arl;

    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int wordsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> words = new ArrayList<>();

        for (int i = 0; i < wordsCount; i++) {
            String wordsItem = bufferedReader.readLine();
            words.add(wordsItem);
        }

        List<Integer> result = Result.minimalOperations(words);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
