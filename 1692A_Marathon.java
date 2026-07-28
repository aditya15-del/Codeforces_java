import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            while (t-- > 0) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                int d = scanner.nextInt();
                
                int participantsInFront = 0;
                
                if (b > a) {
                    participantsInFront++;
                }
                if (c > a) {
                    participantsInFront++;
                }
                if (d > a) {
                    participantsInFront++;
                }
                
                System.out.println(participantsInFront);
            }
        }
        
        scanner.close();
    }
}