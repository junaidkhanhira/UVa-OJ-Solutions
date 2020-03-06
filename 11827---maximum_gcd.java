import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns = br.readLine(), s;

        while ((s = br.readLine()) != null) {
            String[] sa = s.split(" ");
            ArrayList<Integer> list = new ArrayList<>();
            int res = 1;
            for (int i = 0; i < sa.length; i++) {
                list.add(Integer.parseInt(sa[i]));
            }

            for (int i = 0; i < list.size(); i++) {
                for (int j = i+1; j < list.size(); j++) {
                    res = Math.max(res, gcd(list.get(i), list.get(j)));
                }
            }
            System.out.println(res);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a%b);
    }
}
