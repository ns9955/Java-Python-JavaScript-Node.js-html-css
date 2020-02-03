import java.util.Scanner;
public class IdentityMatrix {
    public static void main(String[] args){
        System.out.println("printing 5 time 0, and then replacing each zero digonally iwth 1 from left to right");
        for (int i = 0; i <= 5; i++){
            for (int j = 0; j <= 5; j++){
                if ( i == j){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------\n");

        for (int i = 1; i <= 7; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);                     // print i as the number needs to repeat, not the corresponding value of j
            }
            System.out.println();
        }
        System.out.println("------");

        for (int i = 1; i <= 3; i++){
            for (int j = 0; j <= 9 ; j++){
                for (int k = 1; k <= 3; k++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
