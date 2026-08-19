import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        String line = br.readLine();
        if (line == null) return;
        
        int t = Integer.parseInt(line.trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            long waysEven = countAlternatingWays(s, 0, n);
            long waysOdd = countAlternatingWays(s, 1, n);
            long ans = (waysEven * waysOdd) % 998244353L;
            out.append(ans).append("\n");
        }
 
        System.out.print(out);
    }


    private static int countAlternatingWays(String s, int startIndex, int n) {
        if (startIndex >= n) {
            return 1; 
        }
        
        int validCount = 0;

        for (int startVal = 0; startVal <= 1; startVal++) {
            boolean isValid = true;
            int currentExpected = startVal;
            
            for (int i = startIndex; i < n; i += 2) {
                char c = s.charAt(i);
                if (c != '?') {
                    int num = c - '0';
                    if (num != currentExpected) {
                        isValid = false;
                        break;
                    }
                }
                currentExpected = 1 - currentExpected;
            }
            
            if (isValid) {
                validCount++;
            }
        }
        return validCount;
    }
}