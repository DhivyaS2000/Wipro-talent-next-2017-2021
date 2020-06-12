import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'minArea' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY x
     *  2. INTEGER_ARRAY y
     *  3. INTEGER k
     */

    public static long minArea(List<Integer> x, List<Integer> y, int k) {
    // Write your code here
        int maxVal = Integer.MIN_VALUE;
    for(int i : y){
        if(i > maxVal){
            maxVal = i;
        }
    }
    //Find min y
    int minVal = Integer.MAX_VALUE;
    for(int i : x){
        if(i <minVal){
            minVal = i;
        }
    }

    int yLength = (maxVal-minVal)+2;

    //Find max x
    maxVal = Integer.MIN_VALUE;
    for(int i : x){
        if(i > maxVal){
            maxVal = i;
        }
    }
    //Find min x
    minVal = Integer.MAX_VALUE;
    for(int i : x){
        if(i < minVal){
            minVal = i;
        }
    }

    int xLength = (maxVal-minVal)+2;
    int sqSide = (yLength > xLength)?yLength:xLength;
    return sqSide*sqSide;

    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int xCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> x = new ArrayList<>();

        for (int i = 0; i < xCount; i++) {
            int xItem = Integer.parseInt(bufferedReader.readLine().trim());
            x.add(xItem);
        }

        int yCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> y = new ArrayList<>();

        for (int i = 0; i < yCount; i++) {
            int yItem = Integer.parseInt(bufferedReader.readLine().trim());
            y.add(yItem);
        }

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        long result = Result.minArea(x, y, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
