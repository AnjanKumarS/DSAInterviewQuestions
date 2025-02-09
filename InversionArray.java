package DSAInterviewQuestions;

public class InversionArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    c++;
                }
            }
            sum += c;
        }
        System.out.println(sum);
    }
}