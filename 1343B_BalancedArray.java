import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String firstLine = br.readLine();
        if (firstLine == null || firstLine.trim().isEmpty()) return;
        int t = Integer.parseInt(firstLine.trim());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int half = n / 2;
     
            if (half % 2 != 0) {
                sb.append("NO\n");
            } else {
                sb.append("YES\n");

                for (int i = 1; i <= half; i++) {
                    sb.append(i * 2).append(" ");
                }

                for (int i = 1; i < half; i++) {
                    sb.append(i * 2 - 1).append(" ");
                }
     
                int lastOdd = 3 * half - 1;
                sb.append(lastOdd).append("\n");
            }
        }
    
        System.out.print(sb.toString());
    }
}