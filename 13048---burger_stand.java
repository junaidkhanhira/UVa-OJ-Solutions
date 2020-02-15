import java.io.*;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns = br.readLine(), s;
        int tc = 1;

        while ((s = br.readLine()) != null) {
            Set<Integer> set = new HashSet<>();
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'B') {
                    set.add(i);
                    if (i-1 >= 0) set.add(i-1);
                    if (i-2 >= 0) set.add(i-2);
                } else if (s.charAt(i) == 'S') {
                    set.add(i);
                    if (i-1 >= 0) set.add(i-1);
                    if (i+1 < s.length()) set.add(i+1);
                } else if (s.charAt(i) == 'D') {
                    set.add(i);
                }
            }

            for (int i = 0; i < s.length(); i++) {
                if (!set.contains(i)) res++;
            }

            System.out.println("Case " + tc++ + ": " + res);
        }
    }
}
