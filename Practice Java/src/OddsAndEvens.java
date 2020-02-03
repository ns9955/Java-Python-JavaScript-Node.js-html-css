import java.util.Random;
import java.util.Scanner;
//import java.util.*;
public class OddsAndEvens {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Let’s play a game called “Odds and Evens”");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Hi " + name +" , which do you choose? (O)dds or (E)vens?");
        String odOrEv = input.next();
        if (odOrEv.equals("O") || odOrEv.equals("o")){
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else {
            System.out.println(name +" has picked evens! The computer will be odds.");
        }
        System.out.println("-------------------------------------------------------\n");
        System.out.println("How many “fingers” do you put out?");
        int usrCount = input.nextInt();
        Random  rand = new Random();                                        // Random number initiator
        int compCount = rand.nextInt(10);
        System.out.println("The computer plays "+ rand +" \"fingers\".");
        System.out.println("-------------------------------------------------------\n");
        int sum = usrCount + compCount;
        boolean oddOrEven = sum%2 == 0;
        if (oddOrEven != true){
            System.out.println(usrCount +" + " + compCount + " = " + sum+"\n" + sum + " is Odd!");
            if (odOrEv.equals("O") || odOrEv.equals("o")){
                System.out.println(name + " wins!!!");
            } else{
                System.out.println("Computer wins!!");
            }
        }else{
            System.out.println(usrCount +" + " + compCount + " = " + sum+"\n" + sum + " is Even!");
            if (odOrEv.equals("E") || odOrEv.equals("e")){
                System.out.println(name + " wins!!!");
            } else{
                System.out.println("Computer wins!!");
            }
        }
    }
}
