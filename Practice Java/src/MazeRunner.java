import java.util.Random;
import java.util.Scanner;

public class MazeRunner {
    public static void main(String[] args){
        Maze myMap = new Maze();
        intro();
        myMap.printMap();
        String move;
        int count = 0;
        while(myMap.didIWin()!=true) {
            move = userMove();
            //System.out.println(move);
            if (myMap.isThereAPit(move)){
                if (navigatePit().equals("y")){
                    myMap.jumpOverPit(move);
                    myMap.printMap();
                    continue;
                } else{
                    continue;
                }
            }
            if (move.equals("R") && myMap.canIMoveRight()) {
                myMap.moveRight();
                myMap.printMap();
                count++;
            } else if (move.equals("L") && myMap.canIMoveLeft()) {
                myMap.moveLeft();
                myMap.printMap();
                count++;
            } else if (move.equals("U") && myMap.canIMoveUp()) {
                myMap.moveUp();
                myMap.printMap();
                count++;
            } else if (move.equals("D") && myMap.canIMoveDown()) {
                myMap.moveDown();
                myMap.printMap();
                count++;
            } else {
                System.out.println("Eureka!! you’ve hit a wall.");
                count++;
            }
            movesMessage(count);
            if (count > 100){
                System.out.println("Sorry, but you didn't escape in time- you lose!");
                break;
            }
        }if (myMap.didIWin() && count < 100){
            System.out.println("Congratulations, you win!! You've made it alive in " + count+ " moves.");
        }
    }
    public static void intro(){
        System.out.println("Welcome to Maze Runner!\nHere is your current position:");
    }
    public static String userMove(){
        Scanner input = new Scanner(System.in);
        String move;
        do{
            System.out.println("Where would you like to move? (R, L, U, D)");
            move = input.next();
        }while(!move.equals("R") && !move.equals("L") && !move.equals("U") && !move.equals("D"));
        return move;
    }
    public static void movesMessage(int count){
        if (count == 50){
            System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
        } else if (count == 75){
            System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
        } else if (count == 90){
            System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
        } else if (count == 100){
            System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
        }
    }
    public static String navigatePit(){
        Scanner input = new Scanner(System.in);
        System.out.println("Watch out! There's a pit ahead, jump it?");
        String choice = input.next().substring(0,1);
        return choice;
    }

}
