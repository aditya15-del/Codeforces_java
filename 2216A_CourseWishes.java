import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        
        int t = Integer.parseInt(line.trim());
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            int[] a = new int[k + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= k; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            
            int[] b = new int[n];
            int[] count = new int[k + 2];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                b[i] = Integer.parseInt(st.nextToken());
                count[b[i]]++;
            }
            
            List<Integer> ops = new ArrayList<>();
            boolean possible = true;
            
            while (true) {
                boolean moved = false;
                boolean done = true;
                
                for (int i = 0; i < n; i++) {
                    if (b[i] <= k) {
                        done = false;
                        if (b[i] + 1 == k + 1 || count[b[i] + 1] < a[b[i] + 1]) {
                            ops.add(i + 1);
                            count[b[i]]--;
                            b[i]++;
                            count[b[i]]++;
                            moved = true;
                            break;
                        }
                    }
                }
                
                if (done) break;
                if (!moved) {
                    possible = false;
                    break;
                }
            }
            
            if (!possible) {
                out.append("-1\n");
            } else {
                out.append(ops.size()).append("\n");
                for (int i = 0; i < ops.size(); i++) {
                    out.append(ops.get(i)).append(i == ops.size() - 1 ? "" : " ");
                }
                out.append("\n");
            }
        }
        System.out.print(out);
    }
}
