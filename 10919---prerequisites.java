import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;

        while ((s = br.readLine()) != null) {
            if (s.equals("0")) break;
            String[] kma = s.split(" ");
            int k = Integer.parseInt(kma[0]);
            int m = Integer.parseInt(kma[1]);
            String cs = br.readLine();
            String[] ca = cs.split(" ");
            List<String> list = Arrays.asList(ca);
            boolean ok = true;
            for (int i = 0; i < m; i++) {
                String crs = br.readLine();
                if (ok) {
                    String[] cra = crs.split(" ");
                    int c = Integer.parseInt(cra[0]);
                    int r = Integer.parseInt(cra[1]);
                    int f = 0;
                    boolean okk = false;
                    for (int j = 2; j < c + 2; j++) {
                        if (list.contains(cra[j])) f++;
                        if (f >= r) {
                            okk = true;
                            break;
                        }
                    }
                    if (!okk) ok = false;
                }
            }
            if (ok) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
