import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String bss = "Happy birthday to you Happy birthday to you Happy birthday to Rujia Happy birthday to you";
        String[] bsa = bss.split(" ");
        int bsn = bsa.length;

        String bps = br.readLine();
        int bpn = Integer.parseInt(bps);
        ArrayList<String> bpa = new ArrayList<>();
        for (int i = 0; i < bpn; i++) {
            String nm = br.readLine();
            bpa.add(nm);
        }

        if (bsn >= bpn) {
            int j = 0;
            for (int i = 0; i < bsn; i++) {
                System.out.println(bpa.get(j) + ": " + bsa[i]);
                j++;
                if (j > bpa.size()-1) j = 0;
            }
        } else {
            int j = 0;
            int i;
            for (i = 0; i < bpn; i++) {
                System.out.println(bpa.get(i) + ": " + bsa[j]);
                j++;
                if (j > bsa.length-1) j = 0;
            }

            if (i%16 != 0) {
                int ind = 0;
                while (i%16 != 0) {
                    System.out.println(bpa.get(ind) + ": " + bsa[j]);
                    j++;
                    i++;
                    ind++;
                    if (j > bsa.length-1) j = 0;
                }
            }
        }
    }
}
