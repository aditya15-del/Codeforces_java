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
            int L = 1;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    L++;
                }
            }

            int maxReduction = 0;
            for (int i = 1; i < n - 1; i++) {
                char prev = s.charAt(i - 1);
                char curr = s.charAt(i);
                char next = s.charAt(i + 1);

                int before = (prev != curr ? 1 : 0) + (curr != next ? 1 : 0);
                int after = (prev != next ? 1 : 0);
                
                int reduction = before - after;

                if (reduction > maxReduction) {
                    maxReduction = reduction;
                    if (maxReduction == 2) {
                        break; 
                    }
                }
            }
            out.append(L - maxReduction).append("\n");
        }

        System.out.print(out);
    }
}