public class MaximumProductSubArray {

    public static int maxProSubArr(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int maxPro = 1;
            for (int j = i; j < arr.length; j++) {
                maxPro = maxPro * arr[j];
                if (maxPro > max) {
                    max = maxPro;
                }
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int arr[] = { -2, 6, -3, -10, 0, 2 };
        System.out.println(maxProSubArr(arr));
    }
}
