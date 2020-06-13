import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    // Complete the braces function below.
    static String[] braces(String[] values) {
        Scanner in = new Scanner(System.in);
  Stack<Integer> stack = new Stack<Integer>();



   
    
    String newExp = in.next();
    String[] exp = new String[newExp];
    for (int i = 0; i < size; i++)
    { 


      char ch = exp.charAt(i);
      if (ch == '(' || ch == '[' || ch == '{')
        stack.push(i);