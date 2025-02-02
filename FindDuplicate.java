public class FindDuplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 1, 2 };
        
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[j] != -1) {
                    c++;
                    arr[j] = -1;
                }
            }
            if (c > 0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
