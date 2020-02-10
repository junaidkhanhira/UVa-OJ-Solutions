import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns = br.readLine();
        int n = Integer.parseInt(ns);

        for (int i = 0; i < n; i++) {
            String ps = br.readLine();
            int p = Integer.parseInt(ps);

            String qs = br.readLine();
            String[] q = qs.split(" ");
            ArrayList<Integer> al = new ArrayList<>();
            for (int j = 0; j < q.length; j++) {
                al.add(Integer.parseInt(q[j]));
            }

            boolean zero = false;
            for (int x = 0; x < 1000; x++) {
                boolean zFl = true;
                for (int j = 0; j < p; j++) {
                    if (al.get(j) > 0) {
                        zFl = false;
                        break;
                    }
                }

                if (!zFl) {
                    int lVal = Math.abs(al.get(al.size()-1) - al.get(0));
                    for (int j = 0; j < al.size()-1; j++) {
                        al.set(j, Math.abs(al.get(j) - al.get(j+1)));
                    }
                    al.set(al.size()-1, lVal);
                } else {
                    zero = true;
                    break;
                }
            }

            if (zero) System.out.println("ZERO");
            else System.out.println("LOOP");
        }
    }
}
