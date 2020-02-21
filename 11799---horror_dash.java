import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ts = br.readLine();
        int t = Integer.parseInt(ts), tc = 1;

        for (int x = 0; x < t; x++) {
            String rs = br.readLine();
            String[] ra = rs.split(" ");
            ArrayList<Integer> al = new ArrayList<>();
            for (String r : ra) {
                al.add(Integer.parseInt(r));
            }
            System.out.println("Case " + tc++ + ": " + Collections.max(al));
        }
    }
}
