public class BinarySearch {
    public static void main(String[] args){
        int [] lst = {1, 3, 4,7,9,10,15,17,21,25,29,43,81};
        boolean presentOrNot = binarySearch(21, lst, 0, 12);
    }
    static boolean binarySearch(int v, int[] lst, int low, int high) {
        // in the above line low and high are the index numbers
        if (low > high) {
            System.out.println("not found");
            return false;
        }

        int middle = (low+high)/2;

        if (v == lst[middle]) {
            System.out.println("found! It is at " + middle);
            return true;
        }
        else if (v > lst[middle]) {
            return binarySearch(v, lst, middle+1, high);
        }
        else {
            return binarySearch(v, lst, low, middle-1);
        }
    }
}
