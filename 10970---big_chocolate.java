import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;

        while ((s = br.readLine()) != null) {
            String[] mna = s.split(" ");
            int m = Integer.parseInt(mna[0]);
            int n = Integer.parseInt(mna[1]);
            int res = (m-1) + ((n-1) * m);
            System.out.println(res);
        }
    }
}

