public class FirstRepetingElement {

    public static int firstRepEle(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 3, 4, 3, 5, 6 };
        int n = arr.length;
        int index = firstRepEle(arr, n);
        System.out.println(index==-1?"Repeting Element Not Present":"Repeting element is : "+index);
    }
}
