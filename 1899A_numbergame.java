import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                if (n % 3 == 0) {
                    System.out.println("Second");
                } else {
                    System.out.println("First");
                }
            }
        }
        
        scanner.close();
    }
}