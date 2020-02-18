import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ts = br.readLine();
        int t = Integer.parseInt(ts);
        int d = 0;

        for (int x = 0; x < t; x++) {
            String s = br.readLine();
            if (s.charAt(0) == 'r') {
                System.out.println(d);
            } else {
                String[] sa = s.split(" ");
                d += Integer.parseInt(sa[1]);
            }
        }
    }
}
