import java.util.Scanner;
public class Birthdate {
    public static void main(String[] args){
        inputBirthday();
    }
    public static void inputBirthday (){
        Scanner input = new Scanner(System.in);
        System.out.print("On what day of the month were you born? ");
        int day = input.nextInt();
        System.out.println("What is the name of the month in which you were born? ");
        String month = input.next();
        System.out.println("During what year were you born? ");
        int year = input.nextInt();
        System.out.println("You were born on " + month +" "+ day +", " +year+ " You're mighty old!");
    }
}
