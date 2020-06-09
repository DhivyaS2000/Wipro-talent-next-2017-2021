import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    
    public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
    // Write your code here
    int count = 0;
        for (String Items : productSold) {
            int p = products.indexOf(Items);
            float pp = productPrices.get(p);
            int ps = productSold.indexOf(Items);
            if (pp != soldPrice.get(ps)) {
                count++;
            }
        }
        return(count);

    }


}


public class Solution {
