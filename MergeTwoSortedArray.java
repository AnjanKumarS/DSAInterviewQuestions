public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 4, 5};
        int arr2[] = { 2, 4, 6, 8 };
        int arr3[] = new int[arr1.length + arr2.length];
        
        int i = 0, j = 0, k = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < n1) {
            arr3[k++] = arr1[i++];
        }
        while (j < n1) {
            arr3[k++] = arr2[j++];
        }
        
        for (int val : arr3) {
            System.out.print(val);
        }
    }
}
