import java.util.Scanner;

public class TitleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        StringBuilder output = new StringBuilder();
        String str[] = s.split(" ");

        for (String word : str) {
            if (word.length() > 0) {
                output.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    output.append(word.substring(1));
                }
                output.append(" ");
            }
        }

        System.out.println(output.toString().trim());
        sc.close();
    }
}
