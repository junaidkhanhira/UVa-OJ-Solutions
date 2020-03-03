import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1, s2, lt = "abcdefghijklmnopqrstuvwxyz";

        while ((s1 = br.readLine()) != null) {
            s2 = br.readLine();

            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            int v1 = 0, v2 = 0;

            for (int i = 0; i < s1.length(); i++) {
                char c = s1.charAt(i);
                if (c >= 97 && c <= 122) {
                    v1 += lt.indexOf(c)+1;
                }
            }
            while (v1 > 9) {
                int temp1 = v1;
                int temp2 = 0;
                while (temp1 > 9) {
                    temp2 += temp1%10;
                    temp1 = temp1/10;
                }
                temp2 += temp1;
                v1 = temp2;
            }

            for (int i = 0; i < s2.length(); i++) {
                char c = s2.charAt(i);
                if (c >= 97 && c <= 122) {
                    v2 += lt.indexOf(c)+1;
                }
            }
            while (v2 > 9) {
                int temp1 = v2;
                int temp2 = 0;
                while (temp1 > 9) {
                    temp2 += temp1%10;
                    temp1 = temp1/10;
                }
                temp2 += temp1;
                v2 = temp2;
            }

            DecimalFormat df = new DecimalFormat("#.00");
            df.setRoundingMode(RoundingMode.HALF_EVEN);
            double res;
            res = (double)v2/(double)v1 * 100.00;
            if (res > 100) {
                res = (double)v1/(double)v2 * 100.00;
            }

            System.out.println(df.format(res)+ " %");
        }
    }
}
