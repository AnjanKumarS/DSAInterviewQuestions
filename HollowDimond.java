import java.util.Scanner;

public class HollowDimond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Wrong Input");
        } else {
            int size = n * 2;
            for (int r = 1; r <= size; r++) {
                for (int c = 1; c <= size; c++) {
                    if (r-c>=n || r+c>=(n*3)+1 || r+c<=n+1 || c-r>=n){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();;
    }
}
