import java.util.Arrays;

public class FindDuplicate2 {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 4, 6, 8, 9, 1, 2, 3 ,5,8,9,9,9,9};
        Arrays.sort(arr);
        int lastDup = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i + 1] && arr[i]!=lastDup) {
                System.out.print(arr[i] + " ");
                lastDup = arr[i];
            }
        }
    }
}
