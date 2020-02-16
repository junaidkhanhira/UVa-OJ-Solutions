import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns = br.readLine();
        int n = Integer.parseInt(ns), tc = 1;

        for (int x = 0; x < n; x++) {
            String s;
            int mx = 0;
            ArrayList<String[]> al = new ArrayList<>();

            for (int y = 0; y < 10; y++) {
                s = br.readLine();
                String[] arr = s.split(" ");
                al.add(arr);
                int val = Integer.parseInt(arr[1]);
                if (val > mx) mx = val;
            }

            System.out.println("Case " + "#" + tc ++ + ":");
            for (String[] elem : al) {
                if (Integer.parseInt(elem[1]) == mx) System.out.println(elem[0]);
            }
        }

    }
}
