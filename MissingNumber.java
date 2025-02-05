public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        int n = 5;

        int expectedsum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedsum - actualSum;
        System.out.println("Missing Number is : "+missingNumber);
    }
}
