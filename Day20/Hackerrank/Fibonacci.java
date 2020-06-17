import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Solution{

   public static void main(String[] args)
   {
       int n,first=0,next=1;
       Scanner scanner=new Scanner(System.in);
       n=scanner.nextInt();
       System.out.println(first+"\n"+""+next);
       for(int i=1;i<n-1;i++)
       {
           int sum=first+next;
            first=next;
            next=sum;
            System.out.println(sum);
        }

    }
}


 