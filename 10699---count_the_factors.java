import java.io.*;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns;

        while ((ns = br.readLine()) != null) {
            if (ns.equals("0")) break;
            int n = Integer.parseInt(ns);
            int temp = n;
            Set<Integer> set = new HashSet<>();
            while (n%2 == 0) {
                set.add(2);
                n /= 2;
            }
            for (int i = 3; i*i <= n; i+=2) {
                while (n%i == 0) {
                    set.add(i);
                    n /= i;
                }
            }
            if (n > 2) set.add(n);

            System.out.println(temp + " : " + set.size());
        }
    }
}
