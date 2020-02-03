import java.util.Scanner;

public class TripPlannerModule1ProjectAssignment {
    public static void main(String[] args){
        greeting();
        budget();
        timeDifference();
        countryArea();
        //round();
    }
    public static void greeting(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Welcome " + name + ", nice to meet you, where are you travelling to? ");
        String destination = input.nextLine();
        System.out.print("Great! A trip to " + destination + " sounds awesome!!!\n***********");
        System.out.println();
        System.out.println();
    }
    public static void budget(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        double hours = days*24;
        double minutes = hours*60;
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        int moneyUs = input.nextInt();
        double moneyUsDay = moneyUs/days;
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency = input.next();
        System.out.print("How many " + currency + " are there in 1 USD? ");
        double curConRte = input.nextDouble();
        double curConAmt = curConRte*moneyUs;
        double curAmtPDay = moneyUsDay*curConRte;
        System.out.println();
        System.out.println("If you are travelling for " +days+ " days, that is the same as "+hours+" hours or " + minutes+ " minutes" );
        System.out.println("If you are going to spend $" + moneyUs+ " USD that means per day you can spend up to $" + moneyUsDay +" USD");
        System.out.println("Your total budget in " +currency+ " is " +curConAmt+ " "+currency+ ", which per day is " + curAmtPDay +" " +currency);
        System.out.println("***********\n");
    }
    public static void timeDifference(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        double timeDiff = input.nextDouble();
        //double timeAtHome = 12;
        double timeAtLocTn0 = (24 + timeDiff)%24;
        int localT0Hr = (int)timeAtLocTn0;
        int localT0Min = (int)((timeAtLocTn0 - localT0Hr)*60);
        double timeAtLocTn1 = (12 + timeDiff)%24;
        int localT1Hr = (int)timeAtLocTn1;
        System.out.println("That means that when it is mid-night at home it will be " +localT0Hr+":"+localT0Min+ " in your travel destination");
        System.out.println("and when is is noon at home it will be " +localT1Hr+":"+localT0Min);
        System.out.println("**********\n");
    }
    public static void countryArea(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the sruare area of your destination country in KM2? ");
        double area = input.nextInt();
        double areaMiles = area*0.62137*0.62137;
        System.out.println("In miles2 that is "+Math.round(areaMiles)+"\n***************\n");
    }
}
