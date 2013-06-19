/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collatz;

/**
 *
 * @author Administrator
 */

import java.io.PrintWriter;
import java.io.File; 

public class Collatz {
    int length = 0;
    public static void collatz(long n) {
        System.out.print(n + " ");
        if (n == 1) return;
        else if (n % 2 == 0) collatz(n / 2);
        else collatz(3*n + 1);
    }
    

    public static void binary(long n, int length) {
        if (n == 1) {
            if (0==0){
            System.out.print("1 " + length);
            }
            return;
        }
        else if (n % 2 == 0){
            System.out.print("1");

            binary(n / 2, length + 1);
        }
        else {
            System.out.print("0");
            binary(3*n + 1, length + 1);
        }
    }


    public static void main(String[] args) {
        long n = Integer.parseInt(args[0]);
        
        long N = n;
        
        int length = 1;
        
/*        while(N > 1)  {
            collatz(N);
            N = N - 1;
            System.out.println();            
            }
        
        N = n; */
        
        while(N > 1)  {
            System.out.print(N + " ");
            binary(N,1);
            N = N - 1;
            System.out.println();            
            }

        System.out.println();
        System.out.println();
        
        
    }

}
