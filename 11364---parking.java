import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ts = br.readLine();
        int t = Integer.parseInt(ts);

        for (int x = 0; x < t; x++) {
            String ns = br.readLine();
            int n = Integer.parseInt(ns);
            String na = br.readLine();
            String[] arr = na.split(" ");
            int min = Integer.parseInt(arr[0]);
            int max = Integer.parseInt(arr[0]);
            for (String e : arr) {
                if (Integer.parseInt(e) < min) min = Integer.parseInt(e);
                if (Integer.parseInt(e) > max) max = Integer.parseInt(e);
            }
            System.out.println((max-min) * 2);
        }

    }
}
