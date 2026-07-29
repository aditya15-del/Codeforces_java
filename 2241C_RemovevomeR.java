import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int transitions = 0;
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) != s.charAt(i + 1)) {
                    transitions++;
                }
            }

            if (transitions == 1) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
        }
        
        scanner.close();
    }
}