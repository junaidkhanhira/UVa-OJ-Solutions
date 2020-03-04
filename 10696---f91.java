import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns;

        while ((ns = br.readLine()) != null) {
            if (ns.equals("0")) break;
            int n = Integer.parseInt(ns);
            System.out.println("f91(" + n + ") = " + f91(n));
        }
    }

    public static int f91(int n) {
        if (n <= 100) return f91(f91(n+11));
        else return n-10;
    }
}
