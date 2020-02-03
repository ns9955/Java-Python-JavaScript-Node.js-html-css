/*
Write a recursive method repeat that accepts a string s and an integer n as parameters and that returns a String
consisting of n copies of s. Your method should throw an IllegalArgumentException if passed any negative value for n.
You are not allowed to construct any structured objects other than Strings (no array, List, Scanner, etc.) and you
may not use any loops to solve this problem; you must use recursion.
 */

import java.util.Scanner;
public class repeatRecursiveAlgorithm {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String vlu = input.nextLine();
        System.out.println("Enter and integer value for repetitions: ");
        int n = input.nextInt();
        System.out.println(repeat(vlu, n));
    }
    public static String repeat(String vlu, int n){
        if (n<0){
            throw new IllegalArgumentException();
        } else if (n==0){
            return "";
        } else {
            return vlu +" "+repeat(vlu, (n-1));
        }
    }
}
