import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns;

        while ((ns = br.readLine()) != null) {
            if (ns.equals("0")) break;
            int n = Integer.parseInt(ns);
            System.out.println(fib(n+1));
        }
    }

    static long fib(int n) {
        long[] f = new long[n+2];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }
}
