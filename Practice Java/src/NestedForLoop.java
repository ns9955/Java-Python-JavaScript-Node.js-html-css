import java.sql.SQLOutput;
import java.util.Scanner;
public class NestedForLoop {
    public static void main(String[] args){
        System.out.println("A Nested loop is when we place one loop inside other.");
        for (int row = 0; row < 5; row++){
            System.out.print("row " + row + ": ");
            for (int col = 0; col < 10; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();               // khub important, honin bollo..
        }
    }
}
