import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while (line != null && line.trim().isEmpty()) {
            line = br.readLine();
        }
        if (line == null) return;
        int n = Integer.parseInt(line.trim());
        
        line = br.readLine();
        while (line != null && line.trim().isEmpty()) {
            line = br.readLine();
        }
        String s = line.trim();

        double[] dp = new double[n + 2];
        double[] nextDp = new double[n + 2];
        dp[1] = 1.0;
        
        char[] chars = s.toCharArray();
        double logScale = 0;
        
        for (int i = 2; i <= n; i++) {
            if (chars[i - 2] == '<') {
                double sum = 0;
                for (int j = 1; j <= i; j++) {
                    nextDp[j] = sum;
                    sum += dp[j];
                }
            } else {
                double sum = 0;
                for (int j = i - 1; j >= 1; j--) {
                    sum += dp[j];
                    nextDp[j] = sum;
                }
                nextDp[i] = 0;
            }
            
            double[] temp = dp;
            dp = nextDp;
            nextDp = temp;
            
            if ((i & 15) == 0) {
                double max = 0;
                for (int j = 1; j <= i; j++) {
                    if (dp[j] > max) {
                        max = dp[j];
                    }
                }
                if (max > 1e150) {
                    for (int j = 1; j <= i; j++) {
                        dp[j] *= 0x1.0p-500;
                    }
                    logScale += 500;
                }
            }
        }
        
        double totalSum = 0;
        for (int j = 1; j <= n; j++) {
            totalSum += dp[j];
        }
        
        double ans = Math.log(totalSum) / Math.log(2) + logScale;
        System.out.printf(Locale.US, "%.10f\n", ans);
    }
}