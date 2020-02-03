/*Write a method starString that accepts an integer parameter n and returns a string
of stars (asterisks) 2n long (i.e., 2 to the nth power). You should throw an
IllegalArgumentException if passed a value less than 0.*/

import java.util.Scanner;

public class recursiveAlgorithmStarString {
    public static void main(String[] args){
        Scanner usrChr = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = usrChr.nextInt();
        System.out.println(starString(n));
    }
    public static String starString(int n){
        String ch = "*";
        if (n==0){
            return ch;
        }else if (n<0){
            throw new IllegalArgumentException();
        }else{
            //System.out.println("Entry No." + (n-1));
            return starString((n-1)) + starString((n-1));
        }
    }
}
