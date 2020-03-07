import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;

        while ((s = br.readLine()) != null) {
            if (s.equals("0 0")) break;
            String[] nma = s.split(" ");
            int n = Integer.parseInt(nma[0]);
            int m = Integer.parseInt(nma[1]);
            Set<String> nl = new HashSet<>();
            int res = 0;

            for (int i = 0; i < n; i++) {
                String tStr = br.readLine();
                nl.add(tStr);
            }

            for (int i = 0; i < m; i++) {
                String tStr = br.readLine();
                if (nl.contains(tStr)) res++;
            }

            System.out.println(res);
        }
    }
}
