import java.util.Arrays;

public class RotateAnArray2 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = 3;

        for (int i = 0; i < n; i++) {
            int temp = arr[0];
            for (int j = 0; j <= arr.length - 2; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
