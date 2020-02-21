import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ts = br.readLine();
        int t = Integer.parseInt(ts);

        for (int x = 0; x < t; x++) {
            String ns = br.readLine();
            int n = Integer.parseInt(ns);
            ArrayList<String> al = new ArrayList<>();
            int res = 0;
            for (int i = 0; i < n; i++) {
                String s = br.readLine();
                if (s.equals("LEFT")) {
                    al.add(s);
                    res--;
                } else if (s.equals("RIGHT")) {
                    al.add(s);
                    res++;
                } else {
                    String[] sa = s.split(" ");
                    int idx = Integer.parseInt(sa[2]) - 1;
                    String idxCmd = al.get(idx);
                    al.add(idxCmd);
                    if (idxCmd.equals("LEFT")) res--;
                    else res++;
                }
            }
            System.out.println(res);
        }
    }
}
