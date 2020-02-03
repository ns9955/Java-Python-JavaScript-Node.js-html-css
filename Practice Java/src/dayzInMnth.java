import java.util.Scanner;

public class dayzInMnth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Month (an integer between 1 and 12): ");
        int month = input.nextInt();
        daysInMonth(month);
    }
    public static int daysInMonth(int month){
        int days = 0 ;

        if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)){
            days = 31; } else if (month == 2){ days = 28;
        } else if ((month == 3) || (month == 4) || (month == 6) || (month == 9) || (month == 11)){
            days = 30;
        } else {
            System.out.println("Enter Valid Month");
        }
        System.out.println(days);
        return days;
    }
}