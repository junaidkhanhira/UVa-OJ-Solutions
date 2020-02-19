import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ts = br.readLine();
        int t = Integer.parseInt(ts);
        int tc = 1;

        for (int x = 0; x < t; x++) {
            String ns = br.readLine();
            int n = Integer.parseInt(ns);
            String hs = br.readLine();
            String[] ha = hs.split(" ");
            int hj = 0;
            int lj = 0;
            int prev = Integer.parseInt(ha[0]);
            for (int i = 1; i < n; i++) {
                int curr = Integer.parseInt(ha[i]);
                if (curr > prev) hj++;
                else if (curr < prev) lj++;
                prev = curr;
            }
            System.out.println("Case " + tc++ + ": " + hj + " " + lj);
        }
    }
}
