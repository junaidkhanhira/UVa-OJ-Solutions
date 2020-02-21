import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;

        while ((s = br.readLine()) != null) {
            String[] sa = s.split(" ");
            if (sa[0].equals("-1")) break;
            int c1 = Math.min(Integer.parseInt(sa[0]), Integer.parseInt(sa[1]));
            int c2 = Math.max(Integer.parseInt(sa[0]), Integer.parseInt(sa[1]));
            int d1 = c2 - c1;
            int d2 = c1 + (99-c2) + 1;
            System.out.println(Math.min(d1, d2));
        }
    }
}
