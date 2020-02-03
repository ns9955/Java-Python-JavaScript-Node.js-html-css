import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = input.nextInt();
        if(num%2 == 0){
            System.out.println("even");
        } else{
            System.out.println("odd");
        }
    }
}
