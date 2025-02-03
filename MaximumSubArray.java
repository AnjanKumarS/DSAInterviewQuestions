public class MaximumSubArray {
    public static int maxSubArray(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum = currSum + arr[j];
                if (currSum > max) {
                    max = currSum;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubArray(arr));
    }
}
