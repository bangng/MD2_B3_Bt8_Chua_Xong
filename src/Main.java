import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "Song Da Tower";
        System.out.println("Enter a character: ");
        char b = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b){
                count++;
            }

        }
        System.out.printf(count == 1 ? "There is %d character '%c' %s" : "There are %d characters '%c' %s", count, b, "in the string");
    }
}
