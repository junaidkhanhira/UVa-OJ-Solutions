import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns;
        while ((ns = br.readLine()) != null) {
            if (ns.equals("0")) break;
            ns = ns.trim();
            BigInteger n = new BigInteger(ns);
            BigInteger eleven = new BigInteger("11");
            BigInteger rem = n.mod(eleven);
            if (rem.equals(BigInteger.ZERO)) System.out.println(ns + " is a multiple of 11.");
            else System.out.println(ns + " is not a multiple of 11.");
        }

    }

    public static BigInteger factorial(int n) {
        BigInteger f = new BigInteger("1");

        for (int i = 2; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }

        return f;
    }
}

