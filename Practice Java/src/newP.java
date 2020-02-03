public class newP {
    public static void main(String[] args) {
        System.out.println(funcCall(50));
        }
    public static int funcCall(int n){
        if (n==1){
            return 1;
        }else{
            return n+funcCall(n-1);
        }
        //for (int i = 1; i < 5; i++) {
            //System.out.print("* ");
        }
    }
