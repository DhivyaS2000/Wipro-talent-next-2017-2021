import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

   

    public static List<Integer> itemsSort(List<Integer> items) {
    // Write your code here
    List<Integer> d= new ArrayList<>();
int a[]=new int[6];
    for(int i: items)
    {
        if (a[i]!=a[i+1])
        {
          d= Math.min(a[i],a[i+1]);
        }
        return d;
    }
    
    }

}


public class Solution {