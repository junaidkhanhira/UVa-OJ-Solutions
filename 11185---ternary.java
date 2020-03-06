import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns;

        while ((ns = br.readLine()) != null) {
            int n = Integer.parseInt(ns);
            if (n < 0) break;
            System.out.println(Integer.toString(n, 3));
        }
    }
}

