import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;

        while ((s = br.readLine()) != null) {
            if (s.equals("0 0")) break;
            String[] xya = s.split(" ");
            char[] xa = xya[0].toCharArray();
            char[] ya = xya[1].toCharArray();
            ArrayList<Integer> xl = new ArrayList<>();
            ArrayList<Integer> yl = new ArrayList<>();

            for (char c : xa) {
                xl.add(Integer.parseInt(String.valueOf(c)));
            }
            for (char c : ya) {
                yl.add(Integer.parseInt(String.valueOf(c)));
            }

            int mx = Math.max(xl.size(), yl.size());
            int carry = 0;
            int res = 0;

            for (int i = xl.size()-1, j = yl.size()-1; mx >= 0; mx--, i--, j--) {
                int p, q;

                if (i < 0) p = 0;
                else p = xl.get(i);

                if (j < 0) q = 0;
                else q = yl.get(j);

                int sum = p + q + carry;
                if (sum >= 10) {
                    carry = sum/10;
                    res++;
                } else {
                    carry = 0;
                }
            }

            if (res == 0) {
                System.out.println("No carry operation.");
            } else if (res == 1) {
                System.out.println("1 carry operation.");
            } else {
                System.out.println(res + " carry operations.");
            }
        }
    }
}
