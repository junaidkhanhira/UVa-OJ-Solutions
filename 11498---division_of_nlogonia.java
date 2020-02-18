import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String ns = br.readLine();
            if (ns.equals("0")) break;
            int n = Integer.parseInt(ns);
            String dps = br.readLine();
            String[] dpa = dps.split(" ");
            int dx = Integer.parseInt(dpa[0]);
            int dy = Integer.parseInt(dpa[1]);
			
            for (int x = 0; x < n; x++) {
                String cs = br.readLine();
                String[] ca = cs.split(" ");
                int cx = Integer.parseInt(ca[0]);
                int cy = Integer.parseInt(ca[1]);

                int diffX = (cx) - (dx);
                int diffY = (cy) - (dy);

                if (diffX == 0 || diffY == 0) {
                    System.out.println("divisa");
                } else if (diffX < 0) {
                    if (diffY < 0) {
                        System.out.println("SO");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    if (diffY < 0) {
                        System.out.println("SE");
                    } else {
                        System.out.println("NE");
                    }
                }
            }
        }
    }
}
