import java.util.Scanner;

public class Abdudant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if (n > 0) {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            System.out.println(sum > n ? "Abundant Number" : "Not Abundant Number");
        }
        else {
            System.out.println("Invalid Integer");
        }
        sc.close();
    }
}
