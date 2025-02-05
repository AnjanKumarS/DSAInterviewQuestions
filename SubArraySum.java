public class SubArraySum {
    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int t = 23;

        for (int i = 0; i < arr.length; i++) {
            int cursum = 0;
            for (int j = i; j < arr.length; j++) {
                cursum += arr[j];
                if (cursum == t && i!=j) {
                    System.out.println((i+1)+","+(j+1));
                }
            }
        }
    }
}
