import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            al.add(i*i);
        }

        String  ns;

        while ((ns = br.readLine()) != null) {
            if (ns.equals("0")) break;
            int n = Integer.parseInt(ns);
            int r = 0;
            for (int i = 0; i <= n; i++) {
                r += al.get(i);
            }
            System.out.println(r);
        }

    }
}
