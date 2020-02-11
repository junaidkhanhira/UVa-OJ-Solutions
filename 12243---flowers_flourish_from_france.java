import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String  s;

        while ((s = br.readLine()) != null) {
            if (s.equals("*")) break;
            s = s.toLowerCase();
            String[] a = s.split(" ");
            char fc = s.charAt(0);
            boolean fl = true;
            for (String x : a) {
                if (x.charAt(0) != fc) {
                    fl = false;
                    break;
                }
            }
            if (fl) System.out.println("Y");
            else System.out.println("N");
        }

    }
}
