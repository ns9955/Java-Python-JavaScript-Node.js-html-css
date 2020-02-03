import java.util.Arrays;

public class SelectionSortInt {
    public static void  main(String[] args){
        int lst[] ={4, 9, 7, 1, 3, 6, 5};
        Arrays.sort(lst);
        System.out.println(Arrays.toString(lst));
        selectionSort(lst);
    }
    static void selectionSort(int[] lst){
        int n = lst.length;
        for (int i = 0; i < n; i++){
            int index = 0;
            int smallest = lst[i];
            for (int j = i; j < n; j++){
                if (lst[j] < smallest){
                    smallest = lst[j];
                    index = j;
                }
                int temp = lst[i];
                lst[i] = smallest;
                lst[index] = temp;
            }
        }
        System.out.println(Arrays.toString(lst));
    }
}
