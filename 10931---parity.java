import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns;
        
        while ((ns = br.readLine()) != null) {
            if (ns.equals("0")) break;;
            String n = Integer.toBinaryString(Integer.parseInt(ns));
            int o = 0;
			
            for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) == '1') o++;
            }
			
            System.out.println("The parity of " + n + " is " + o + " (mod 2).");
        }
    }
}

