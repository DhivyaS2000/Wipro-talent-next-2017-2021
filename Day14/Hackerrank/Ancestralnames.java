import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'sortRoman' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY names as parameter.
     */

    public static List<String> sortRoman(List<String> names) {
    // Write your code here
    for(int i = 0; i < names.size();i++){
            for(int j = i+1; j< names.size();j++){
                if(i != j){                    
                    String temp2 = "";
                    String name1 = getName(names.get(i));
                    int order1 = getOrder(names.get(i));
                    String name2 = getName(names.get(j));
                    int order2 = getOrder(names.get(j));
                    if(name1.compareTo(name2) > 0){
                        temp2 = names.get(i);
                        names.set(i,names.get(j));
                        names.set(j,temp2);
                    }else if(name1.compareTo(name2) == 0){
                        if(order1 > order2){
                            temp2 = names.get(i);
                            names.set(i,names.get(j));
                            names.set(j,temp2);
                        }
                     }
                }
            }
        }
        return names;
    }
    
    private static String getName(String obj){
        return obj.split(" ")[0];
    }
    
    private static int getOrder(String obj){
        return getNumeric(obj.split(" ")[1]);
    }
     private static int getNumeric(String roman) {
        Map<Character,Integer> romanList = new HashMap<>();
        romanList.put('I', 1);
        romanList.put('V', 5);
        romanList.put('X', 10);
        romanList.put('L', 50);
        romanList.put('C', 100);
        romanList.put('D', 500);
        romanList.put('M', 1000);
        
        int total = 0;
        int temp = 0;
        char[] chars = roman.toCharArray();
        
        for(int i = (chars.length-1); i >= 0 ;i--){
            if(temp <= romanList.get(chars[i])){
                total += romanList.get(chars[i]);                
            }else {
                total -= romanList.get(chars[i]);
            }
            temp = romanList.get(chars[i]);
        }
        
        return total;


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int namesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> names = new ArrayList<>();

        for (int i = 0; i < namesCount; i++) {
            String namesItem = bufferedReader.readLine();
            names.add(namesItem);
        }

        List<String> result = Result.sortRoman(names);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(result.get(i));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
