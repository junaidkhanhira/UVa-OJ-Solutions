import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;

        while ((s = br.readLine()) != null) {
            String[] sa = s.split(" ");
            if (sa[0].equals("0")) break;
            double h = Integer.parseInt(sa[0]);
            double u = Integer.parseInt(sa[1]);
            double d = Integer.parseInt(sa[2]);
            double f = u * (Integer.parseInt(sa[3])/100.0);
            double cl = 0;
            int res = 0;
            boolean fl = false;

            while (true) {
                res++;
                if (u > 0) cl += u;
                u -= f;
                if (cl > h) break;
                cl -= d;
                if (cl < 0) break;
            }

            if (cl < 0) {
                System.out.println("failure on day " + res);
            } else {
                System.out.println("success on day " + res);
            }
        }
    }
}
