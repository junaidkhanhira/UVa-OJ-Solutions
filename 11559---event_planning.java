import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;

        while ((s = br.readLine()) != null) {
            String[] sa = s.split(" ");
            int p = Integer.parseInt(sa[0]);
            int b = Integer.parseInt(sa[1]);
            int h = Integer.parseInt(sa[2]);
            int w = Integer.parseInt(sa[3]);
            ArrayList<Integer> resls = new ArrayList<>();
            for (int x = 0; x < h; x++) {
                String prs = br.readLine();
                int pr = Integer.parseInt(prs);
                String bds = br.readLine();
                String[] bda = bds.split(" ");
                ArrayList<Integer> bdls = new ArrayList<>();
                for (String bd : bda) {
                    bdls.add(Integer.parseInt(bd));
                }
                int bdmx = Collections.max(bdls);
                if (bdmx >= p) {
                    for (Integer bd : bdls) {
                        if ((p * pr) <= b && bd >= p) {
                            resls.add(p*pr);
                        }
                    }
                }
            }
            if (resls.size() > 0) {
                System.out.println(Collections.min(resls));
            } else {
                System.out.println("stay home");
            }
        }
    }
}
