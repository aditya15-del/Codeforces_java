import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // Fast I/O for optimized reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        // Simulate the process k times
        while (k-- > 0) {
            if (n % 10 == 0) {
                n /= 10;
            } else {
                n--;
            }
        }
        
        // Print the final result
        System.out.println(n);
    }
}