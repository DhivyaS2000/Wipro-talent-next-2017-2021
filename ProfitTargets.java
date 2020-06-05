import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'stockPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY stocksProfit
     *  2. LONG_INTEGER target
     */

    public static int stockPairs(List<Integer> stocksProfit, long target) {
    // Write your code here
        int n=stocksProfit.size();
    int[] a=new int[n];
    int i,j,count=0;
    ArrayList<Integer> b=new ArrayList<Integer>(n);
    for(i=0;i<n;i++)
    {
        a[i]=stocksProfit.get(i);
    }
    for(i=0;i<n-1;i++)
    {
        if(b.contains(a[i]))
        {
            continue;
        }
        for(j=i+1;j<n;j++)
        {
            if(a[i]+a[j]==target)
            {
                if(b.contains(a[j]))
                {
                    continue;
                }
                b.add(a[i]);
                b.add(a[j]);
                count++;
            }
        }
    }
    return count;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stocksProfitCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> stocksProfit = new ArrayList<>();

        for (int i = 0; i < stocksProfitCount; i++) {
            int stocksProfitItem = Integer.parseInt(bufferedReader.readLine().trim());
            stocksProfit.add(stocksProfitItem);
        }

        long target = Long.parseLong(bufferedReader.readLine().trim());

        int result = Result.stockPairs(stocksProfit, target);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
