/*
Write a static method named longestName that reads names typed by the user and prints the longest name (the name that
contains the most characters) in the format shown below. Your method should accept a console Scanner and an integer n
as parameters and should then prompt for n names.

The longest name should be printed with its first letter capitalized and all subsequent letters in lowercase, regardless
of the capitalization the user used when typing in the name. If there is a tie for longest between two or more names,
use the tied name that was typed earliest. Also print a message saying that there was a tie, as in the right log below.
It's possible that some shorter names will tie in length, such as DANE and Erik in the left log below; but don't print
a message unless the tie is between the longest names. You may assume that n is at least 1, that each name is at least 1
character long, and that the user will type single-word names consisting of only letters. The following table shows two
sample calls and their output (user input in blue):
*/
import java.util.Scanner;

public class longetsName {
    public static void main(String[] args){
        int n;
        Scanner console = new Scanner(System.in);
        longestName();
    }
    public static void longestName(){
        Scanner console = new Scanner (System.in);
        System.out.println("How many names do you want to enter? ");
        int n = console.nextInt();
        int p = 0;
        String[] names = new String[n];                             // initiating an Array, to store the names
        String longName = "";

        for (p = 0; p<n; p++ ){
            System.out.print("name #" +(int)(p+1) +" : ");
            names[p] = console.next();
        }
        for (p = 0; p<n; p++){
            int nameLen = names[p].length();
            if (nameLen > longName.length()){
                longName = names[p];
            }
        }
        int x = 0;
        for (p = 0; p<n; p++){
            int nameLet = names[p].length();
            if (nameLet == longName.length()){
                x++;
            }
        }
        longName = longName.substring(0,1).toUpperCase()+longName.substring(1).toLowerCase();
        if (x>1){
            System.out.println(longName + "'s name is longest\n (There was a tie!)");
        }
        else{
            System.out.println(longName + "'s name is longest");
        }
    }
}