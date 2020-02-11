import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ts = br.readLine();
        int t = Integer.parseInt(ts);

        for (int x = 0; x < t; x++) {
            String m = br.readLine();
            char[] ma = m.toCharArray();
            double n = Math.sqrt(ma.length);
            if (n%1 == 0) {
                for (int i = 0; i < (int)n; i++) {
                    for (int j = 0; j < ((int)n * (int)n); j+=(int)n) {
                        System.out.print(ma[i+j]);
                    }
                }
                System.out.println();
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
