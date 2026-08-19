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
            String a = br.readLine().trim();
            String b = br.readLine().trim();
            int aEven1 = 0, aOdd1 = 0;
            int bEven1 = 0, bOdd1 = 0;
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == '1') {
                    if (i % 2 == 0) aEven1++;
                    else aOdd1++;
                }
                if (b.charAt(i) == '1') {
                    if (i % 2 == 0) bEven1++;
                    else bOdd1++;
                }
            }

            if (aEven1 == bEven1 && aOdd1 == bOdd1) {
                out.append("YES\n");
            } else {
                out.append("NO\n");
            }
        }

        System.out.print(out);
    }
}