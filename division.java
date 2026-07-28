import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt(); 
            
            while (t-- > 0) {
                int rating = scanner.nextInt();
                
                if (rating >= 1900) {
                    System.out.println("Division 1");
                } else if (rating >= 1600) {
                    System.out.println("Division 2");
                } else if (rating >= 1400) {
                    System.out.println("Division 3");
                } else {
                    System.out.println("Division 4");
                }
            }
        }
        
        scanner.close();
    }
}