import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ts = br.readLine();
        int t = Integer.parseInt(ts), tc = 1;

        for (int x = 0; x < t; x++) {
            String ns = br.readLine();
            int n = Integer.parseInt(ns);
            String ms = br.readLine();
            String[] ma = ms.split(" ");
            int mlc = 0, jsc = 0, res = 0;
            boolean flB = false;
            boolean flM = false;
            boolean flJ = false;

            for (int y = 0; y < n; y++) {
                int d = Integer.parseInt(ma[y]);
                int i = 0;
                while (i < d) {
                    mlc += 10;
                    if (i == 0) i+=29;
                    else i+=30;
                }

                int j = 0;
                while (j < d) {
                    jsc += 15;
                    if (j == 0) j+=59;
                    else j+=60;
                }

                if (mlc == jsc) {
                    flB = true;
                    res = mlc;
                    flM = false;
                    flJ = false;
                } else if (mlc > jsc) {
                    flJ = true;
                    res = jsc;
                    flM = false;
                    flB = false;
                } else {
                    flM = true;
                    res = mlc;
                    flB = false;
                    flJ = false;
                }
            }

            if (flB) {
                System.out.println("Case " + tc++ +": " + "Mile Juice " + res);
            } else if (flM) {
                System.out.println("Case " + tc++ +": " + "Mile " + res);
            } else if (flJ) {
                System.out.println("Case " + tc++ +": " + "Juice " + res);
            }
        }
    }
}
