import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution{


    public static int maxHeight(int[] Positions,int[] Heights) {
        int n=Positions.length;
        int m=Heights.length;
        int max=0;
        for(int i=0;i<n-1;i++)
        {
            if(Positions[i]<Positions[i+1]-1)
            {
                int heightDiff = Math.abs(Heights[i+1]-Heights[i]);
                int gapLen = Positions[i+1]-Positions[i]-1;
                int localMax=0;
                if(gapLen>heightDiff)
                {
                    int low=Math.max(Heights[i+1],Heights[i])+1;
                    int remainingGap=gapLen-heightDiff-1;
                    localMax=low+remainingGap/2;
                }
                 else {
                    localMax = Math.min(Heights[i+1], Heights[i]) + gapLen;
                }
