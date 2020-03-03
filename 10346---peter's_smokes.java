import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;

        while ((s = br.readLine()) != null) {
            String[] nka = s.split(" ");
            int n = Integer.parseInt(nka[0]);
            int k = Integer.parseInt(nka[1]);
            int res = n;
            while (n >= k) {
                int temp = n/k;
                res += temp;
                n = n/k + n%k;
            }
            System.out.println(res);
        }
    }
}
