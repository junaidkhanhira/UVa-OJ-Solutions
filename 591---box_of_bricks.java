import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns;
        int tc = 1;

        while ((ns = br.readLine()) != null) {
            if (ns.equals("0")) break;
            int n = Integer.parseInt(ns);
            String hs = br.readLine();
            String[] ha = hs.split(" ");
            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;
            for (String h : ha) {
                int elem = Integer.parseInt(h);
                sum += elem;
                list.add(elem);
            }

            int avg = sum / n;
            int res = 0;

            for (Integer e : list) {
                if (e > avg) res += (e - avg);
            }

            System.out.println("Set #" + tc++);
            System.out.println("The minimum number of moves is " + res + ".");
            System.out.println();
        }
    }
}
