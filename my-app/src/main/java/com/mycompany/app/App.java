package com.mycompany.app;
import java.util.Random;

class App {
    public static void main(String[] args){
        
        for (int i = 0; i < 1500; i++) {
            System.out.println("The 10th term of the Fibonacci sequence is: " + fibn(rand()));
          }

    }
/**
 * returns the nth term in the fibonacci sequence
 * @param n place in sequence to find
 * @return nth term
 */
    public static int fibn(int n){
        if (n <= 1) return n;
        return fibn(n - 1) + fibn(n - 2);
    }

    /**
     * 
     * @return
     */

    public static int rand(){
        Random rand = new Random();
        int tmp = rand.nextInt(10);
        return tmp;

    }
}