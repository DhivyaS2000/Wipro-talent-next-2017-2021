import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



    class Solution{ 
  
    
    static int subCount(int arr[], int n, int k) 
    { 
  
        
        int mod[] = new int[k]; 
        Arrays.fill(mod, 0); 
  
        
        int cumSum = 0; 
        for (int i = 0; i < n; i++) { 
            cumSum += arr[i]; 
  
            
            mod[((cumSum % k) + k) % k]++; 
        } 
  
        
        int result = 0; 
  
        
        for (int i = 0; i < k; i++) 
  
            
            if (mod[i] > 1) 
                result += (mod[i] * (mod[i] - 1)) / 2; 
  