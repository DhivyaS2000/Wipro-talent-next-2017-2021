import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result
{
    public static List<Integer> counts(List<Integer> teamA, List<Integer> teamB) {
        List<Integer> ans = new ArrayList<>(); 
        for(int i = 0; i < teamB.size(); ++i) { 
            int temp = 0;
            for(int j = 0; j < teamA.size(); ++j) {
                if(teamA.get(j) <= teamB.get(i)) { 
                    ++temp; 
                }
            }
            ans.add(temp); 
        }
        return ans;
     }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int teamACount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> teamA = new ArrayList<>();

        for (int i = 0; i < teamACount; i++) {
            int teamAItem = Integer.parseInt(bufferedReader.readLine().trim());
            teamA.add(teamAItem);
        }

        int teamBCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> teamB = new ArrayList<>();

        for (int i = 0; i < teamBCount; i++) {
            int teamBItem = Integer.parseInt(bufferedReader.readLine().trim());
            teamB.add(teamBItem);
        }

        List<Integer> result = Result.counts(teamA, teamB);

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

    

