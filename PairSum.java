class PairSum {
    public static void main(String[] args) {
        int arr[] = {1,-2,1,0,5};
        int t = 0;
        boolean flag = false;
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i + 1; j <= arr.length-1; j++) {
                if (arr[i]+arr[j] == t) {
                    flag = true;
                    break;
                }
            }
        }
        System.out.println(flag?"True":"False");
    }
}