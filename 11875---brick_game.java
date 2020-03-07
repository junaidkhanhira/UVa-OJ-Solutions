import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ts = br.readLine(), s;
        int tc = 1;

        while ((s = br.readLine()) != null) {
            String[] sa = s.split(" ");
            int n = Integer.parseInt(sa[0]);
            System.out.println("Case " + tc++ + ": " + sa[(n/2)+1]);
        }
    }
}
