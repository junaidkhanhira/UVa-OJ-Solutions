import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;

        while ((s = br.readLine()) != null) {
            String[] xya = s.split(" ");
            String xb = String.format("%32s", Integer.toBinaryString(Integer.parseInt(xya[0])));
            String yb = String.format("%32s", Integer.toBinaryString(Integer.parseInt(xya[1])));
            xb = xb.replace(' ', '0');
            yb = yb.replace(' ', '0');
            StringBuilder res = new StringBuilder();
			
            for (int i = 0; i < 32; i++) {
                char x = xb.charAt(i);
                char y = yb.charAt(i);
                if ((x == '0' && y == '1') || (x == '1' && y == '0')) {
                    res.append('1');
                } else {
                    res.append('0');
                }
            }
			
            System.out.println(Integer.parseInt(String.valueOf(res), 2));
        }
    }
}
