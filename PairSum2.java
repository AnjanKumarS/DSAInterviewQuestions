import java.util.Arrays;

public class PairSum2 {
    public static void main(String[] args) {
        int arr[] = { 1, -2, 1, 0, 5 };
        int t = 6;

        if (twoSum(arr, t)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    
    static boolean twoSum(int arr[], int t) {
        Arrays.sort(arr);
        int left=0,right=arr.length-1;
        while (left < right) {
            int sum=arr[left] + arr[right];
            if (sum == t) {
                return true;
            }
            else if (sum < t) {
                left++;
            }
            else {
                right--;
            }
        }
        return false;
    }
}
