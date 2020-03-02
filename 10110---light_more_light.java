import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns;

        while ((ns = br.readLine()) != null) {
            if (ns.equals("0")) break;
            long n = Long.parseLong(ns);
            double sn = Math.sqrt(n);
            if (sn == (long)sn) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
