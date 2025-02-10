package DSAInterviewQuestions;

public class Kadanes {
    public static void main(String[] args) {
        int arr[] = { 2, 3, -8, 7, -1, 2, 3 };
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            int cursum = 0;
            for (int j = i; j < arr.length; j++) {
                cursum += arr[j];
                if (cursum > max) {
                    max = cursum;
                }
            }
        }
        System.out.println(max);
    }
}
