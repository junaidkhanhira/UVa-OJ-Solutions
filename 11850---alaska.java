import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns;

        while ((ns = br.readLine()) != null) {
            if (ns.equals("0")) break;
            int n = Integer.parseInt(ns);
            boolean possible = true;
            ArrayList<Integer> list = new ArrayList<>();


            for (int i = 0; i < n; i++) {
                String gss = br.readLine();
                int gs = Integer.parseInt(gss);
                list.add(gs);
            }

            if (!list.contains(0)) list.add(0);

            Collections.sort(list);

            for (int i = 1; i < n; i++) {
                if (list.get(i) - list.get(i-1) > 200) {
                    possible = false;
                    break;
                }
            }

            if ((1422 - list.get(n-1)) * 2 > 200) possible = false;

            if (possible) {
                System.out.println("POSSIBLE");
            } else {
                System.out.println("IMPOSSIBLE");
            }
        }
    }
}
