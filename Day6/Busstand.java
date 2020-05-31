import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

            
    public static List<Integer> kthPerson(int k, List<Integer> p, List<Integer> q) {
             {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Set<Integer> preSum = new HashSet<Integer>();
        int pre = 0;
        int min = -1;
        for (int i = 0; i < size; i++) {
            int cur = sc.nextInt();
            min = min == -1 ? cur : Math.min(min, cur);
            pre += cur;
            preSum.add(pre);            
        }
        for (int i = min; i <= pre; i++) { // i is the size of bus
            if (pre % i != 0) {
                continue;
            }
            boolean success = true;
            for (int times = 1; times <= pre/i; times++) {
                if (!preSum.contains(times*i)) {
                    success = false; //to indicate this size of bus does not work;
                    break;
                }
            }
            if (success == true) {
                System.out.print(i + " ");
            }
        }
    }
}



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int pCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> p = new ArrayList<>();

        for (int i = 0; i < pCount; i++) {
            int pItem = Integer.parseInt(bufferedReader.readLine().trim());
            p.add(pItem);
        }

        int qCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> q = new ArrayList<>();

        for (int i = 0; i < qCount; i++) {
            int qItem = Integer.parseInt(bufferedReader.readLine().trim());
            q.add(qItem);
        }
        List<Integer> result = Result.kthPerson(k, p, q);
        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        
        
        

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
    }
