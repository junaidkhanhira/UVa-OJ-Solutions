import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns = br.readLine(), s;

        while ((s = br.readLine()) != null) {
            String[] sda = s.split(" ");
            long sum = Long.parseLong(sda[0]);
            long diff = Long.parseLong(sda[1]);
			
            if (diff > sum) {
                System.out.println("impossible");
            } else {
                long x, x2, y;
                x2 = sum + diff;
                if (x2%2 == 0) {
                    x = x2/2;
                    y = Math.abs(diff-x);
                    System.out.println(Math.max(x, y) + " " + Math.min(x, y));
                } else {
                    System.out.println("impossible");
                }
            }
        }
    }
}

