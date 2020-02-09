import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        int tc = 1;

        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s);
            if (n == 0) break;

            ArrayList<Integer> res = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                ArrayList<Integer> fct = new ArrayList<>();
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) fct.add(j);
                }

                int sum = 0;
                for (int j = 0; j < fct.size(); j++) {
                    sum += fct.get(j);
                }

                if (sum == n) res.add(i);
            }

            if (res.isEmpty()) System.out.println("Case " + tc++ + ": " + -1);
            else System.out.println("Case " + tc++  + ": " + Collections.max(res));
        }
    }
}
