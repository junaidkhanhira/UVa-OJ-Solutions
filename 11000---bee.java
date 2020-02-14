import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns;

        while ((ns = br.readLine()) != null) {
            if (ns.equals("-1")) break;
            int n = Integer.parseInt(ns);

            if (n == 0) {
                System.out.println(0 + " " + 1);
            }
            else {
                long[] b = {1, 1};

                for (int i = 2; i <= n; i++) {
                    long temp = b[0];
                    b[0] = b[0] + b[1];
                    b[1] = temp + 1;
                }

                System.out.println(b[0] + " " + (b[0]+b[1]));
            }
        }
    }
}
