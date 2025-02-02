public class BestBuyAndSell {
    public static void main(String[] args) {
        int arr[] = { 7, 10, 1, 3, 6, 9, 2 };
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                int sub = arr[j] - arr[i];
                if (sub > p) {
                    p = sub;
                }
            }
        }
        System.out.println(p);
    }
}
