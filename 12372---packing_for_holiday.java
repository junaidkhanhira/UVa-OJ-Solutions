import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ts = br.readLine();
        int t = Integer.parseInt(ts);
        int tc = 1;

        for (int x = 0; x < t; x++) {
            String ns = br.readLine();
            String[] na = ns.split(" ");
            ArrayList<Integer> al = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                al.add(Integer.parseInt(na[i]));
            }

            Collections.sort(al);

            if (al.get(2) > 20) System.out.println("Case " + tc++ + ": bad");
            else System.out.println("Case " + tc++ + ": good");
        }

    }
}
