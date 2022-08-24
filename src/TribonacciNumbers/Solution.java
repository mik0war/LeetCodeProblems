package TribonacciNumbers;

import java.util.HashMap;

public class Solution {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int step = 3,
                x = 0,
                y = 1,
                z = 1,
                t;

        while (step <=n){
            t = x + y + z;
            x = y;
            y = z;
            z = t;

            step++;
        }
        return z;
    }

    public int tribonacci_recurssion(int n){
        return n<=1? n :
                (n == 2? 1 :
                    tribonacci_recurssion(n-1) +
                        tribonacci_recurssion(n-2) +
                        tribonacci_recurssion(n-3));
    }
}
