import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;

        while ((s = br.readLine()) != null) {
            int cnt = 0;
            String[] sa = s.split(" ");
            int a = Integer.parseInt(sa[0]);
            int b = Integer.parseInt(sa[1]);
            int c = Integer.parseInt(sa[2]);
            int d = Integer.parseInt(sa[3]);
            int l = Integer.parseInt(sa[4]);

            if (d == 0 && l == 0) break;

            for (int i = 0; i <= l; i++) {
                int res = (a*i*i) + (b*i) + c;
                if (res%d == 0) cnt++;
            }

            System.out.println(cnt);
        }

    }
}
