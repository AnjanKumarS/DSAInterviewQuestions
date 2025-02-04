public class LargestElement {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int maxval = arr[0];

        for (int i : arr) {
            if (i > maxval) {
                maxval = i;
            }
        }
        System.out.println(maxval);
    }
}
