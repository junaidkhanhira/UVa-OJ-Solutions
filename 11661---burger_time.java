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
            String hs = br.readLine();
            boolean fl = false;
            ArrayList<Integer> ld = new ArrayList<>();
            ArrayList<Integer> lr = new ArrayList<>();
            ArrayList<Integer> lRes = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                char c = hs.charAt(i);
                if (c == 'Z') {
                    System.out.println(0);
                    fl = true;
                    break;
                } else if (c == 'D') {
                    ld.add(i);
                } else if (c == 'R') {
                    lr.add(i);
                }
            }

            if (!fl) {
                for (Integer x : ld) {
                    for (Integer y : lr) {
                        lRes.add(Math.abs(x-y));
                    }
                }

                System.out.println(Collections.min(lRes));
            }
        }
    }
}
