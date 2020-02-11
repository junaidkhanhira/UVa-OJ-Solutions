import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ts = br.readLine();
        int t = Integer.parseInt(ts);

        for (int x = 0; x < t; x++) {
            String nms = br.readLine();
            String[] nma = nms.split(" ");
            int n = Integer.parseInt(nma[0]);
            int m = Integer.parseInt(nma[1]);
            System.out.println((n/3) * (m/3));
        }

    }
}
