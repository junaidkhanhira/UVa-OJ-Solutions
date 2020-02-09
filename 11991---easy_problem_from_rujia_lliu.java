import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nms;

        while ((nms = br.readLine()) != null) {

            String[] nma = nms.split(" ");
            int n = Integer.parseInt(nma[0]);
            int m = Integer.parseInt(nma[1]);

            String as = br.readLine();
            String[] a = as.split(" ");

            HashMap<String, ArrayList<Integer>> map = new HashMap<>();

            for (int i = 0; i < a.length; i++) {
                if (map.containsKey(a[i])) {
                    map.get(a[i]).add(i);
                } else {
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(i);
                    map.put(a[i], al);
                }
            }

            for (int i = 0; i < m; i++) {
                String kvs = br.readLine();
                String[] kva = kvs.split(" ");
                int k = Integer.parseInt(kva[0]);
                String v = kva[1];


                if (map.get(v).size() < k) {
                    System.out.println(0);
                } else {
                    System.out.println(map.get(v).get(k - 1) + 1);
                }
            }
        }
    }
}
