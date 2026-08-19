import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            String[] parts = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            int k = Integer.parseInt(parts[1]);

            if (k == n - 1) {
                out.append("-1\n");
                continue;
            }

            int c1 = (n + 1) / 2;
            int c0 = n / 2;
            int p = n - k;
            int b1 = (p + 1) / 2;
            int b0 = p / 2;
            char[] res = new char[n];
            int idx = 0;
            int firstBlock1Size = 1 + c1 - b1;
            for (int i = 0; i < firstBlock1Size; i++) {
                res[idx++] = '1';
            }

            int firstBlock0Size = 1 + c0 - b0;
            for (int i = 0; i < firstBlock0Size; i++) {
                res[idx++] = '0';
            }

            for (int i = 2; i < p; i++) {
                res[idx++] = (i % 2 == 0) ? '1' : '0';
            }

            out.append(res).append("\n");
        }
        
        System.out.print(out);
    }
}