import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken()); 
            
            int[] a = new int[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            
            st = new StringTokenizer(br.readLine());
            int p1 = Integer.parseInt(st.nextToken());

            int target = a[p1];

            int vL = 0;
            if (a[1] != target) {
                vL++;
            }
            for (int i = 2; i <= p1; i++) {
                if (a[i] != a[i - 1]) {
                    vL++;
                }
            }
            int vR = 0;
            for (int j = p1; j < n; j++) {
                if (a[j] != a[j + 1]) {
                    vR++;
                }
            }
            if (a[n] != target) {
                vR++;
            }
            sb.append(Math.max(vL, vR)).append("\n");
        }
        
        System.out.print(sb);
    }
}
