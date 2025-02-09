package DSAInterviewQuestions;

public class MaxOfAllSubArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        int k = 3;
        for (int i = 0; i < n-k; i++) {
            int max = 0;
            for (int j = 1 ; j < k; j++) {
                if (arr[i+j] > max) {
                    max = arr[i+j];
                }
            }
            System.out.print(max+" ");
        }
    }
}
