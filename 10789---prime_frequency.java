import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns = br.readLine(), s;
        int tc = 1;

        while ((s = br.readLine()) != null) {
            StringBuilder res = new StringBuilder();
            Map<Character, Integer> map = new TreeMap<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                Integer v = map.get(c);
                if (v != null) {
                    map.put(c, v+1);
                } else {
                    map.put(c, 1);
                }
            }

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                int val = entry.getValue();
                if (val > 1 && isPrime(val)) res.append(entry.getKey());
            }

            System.out.print("Case " + tc++ + ": ");
            if (res.length() > 0) System.out.println(res);
            else System.out.println("empty");
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n%i == 0) return false;
        }
        return true;
    }
}
