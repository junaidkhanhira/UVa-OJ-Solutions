import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;

        while ((s = br.readLine()) != null) {
            if (s.equals("0")) break;
            BigInteger n = new BigInteger(s);
            BigInteger seventeen = new BigInteger("17");
            BigInteger rem = n.mod(seventeen);
			
            if (rem.equals(BigInteger.ZERO)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
