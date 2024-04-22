package com.mycompany.app;

class App {
    public static void main(String[] args){
        System.out.println("The 10th term of the Fibonacci sequence is: " + fibn(10));

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
}