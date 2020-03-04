import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns;

        while ((ns = br.readLine()) != null) {
            int n = Integer.parseInt(ns);
            BigInteger a = BigInteger.valueOf(0);
            BigInteger b = BigInteger.valueOf(1);
            BigInteger c = BigInteger.valueOf(1);
			
            for (int i = 1; i < n; i++) {
                c = b.add(a);
                a = b;
                b = c;
            }

            System.out.println(c);
        }
    }
}
