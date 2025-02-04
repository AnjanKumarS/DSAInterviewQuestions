public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int lar = Integer.MIN_VALUE;
        int secLar = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i > lar) {
                secLar = lar;
                lar = i;
            }
        }
        System.out.println(secLar);
    }
}
