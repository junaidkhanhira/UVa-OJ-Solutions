import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream(new File("input.txt")));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns = br.readLine(), s;

        while ((s = br.readLine()) != null) {
            int nDec = Integer.parseInt(s, 10);
            String nDecB = Integer.toBinaryString(nDec);
            int nHex = Integer.parseInt(s, 16);
            String nHexB = Integer.toBinaryString(nHex);
            int b1 = nDecB.length() - nDecB.replace("1", "").length();
            int b2 = nHexB.length() - nHexB.replace("1", "").length();
            System.out.println(b1 + " " + b2);
        }
    }
}
