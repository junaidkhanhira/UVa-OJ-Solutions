import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns;

        while ((ns = br.readLine()) != null) {
            int b = Integer.parseInt(ns);
            int d = 0;
            int r = b;
            if (b == 0) break;

            while (b >= 3) {
                d += 1;
                b -= 2;
            }

            if (b == 2) d++;
            System.out.println(d);
        }
    }
}
