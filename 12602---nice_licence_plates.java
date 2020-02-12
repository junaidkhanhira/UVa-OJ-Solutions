import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns = br.readLine(), s;
        int n = Integer.parseInt(ns);

        while ((s = br.readLine()) != null) {
            String[] sa = s.split("-");
            char[] lta = sa[0].toCharArray();
            int ltVal = ((int)lta[0]-65)*26*26 + ((int)lta[1]-65)*26 + ((int)lta[2]-65);
            int rtVal = Integer.parseInt(sa[1]);

            if (Math.abs(ltVal - rtVal) > 100) System.out.println("not nice");
            else System.out.println("nice");
        }

    }
}
