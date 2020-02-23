import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        int tc = 1;

        while ((s = br.readLine()) != null) {
            if (s.equals("0 0 0")) break;
            String[] nmca = s.split(" ");
            int n = Integer.parseInt(nmca[0]);
            int m = Integer.parseInt(nmca[1]);
            int c = Integer.parseInt(nmca[2]);
            int[] d = new int[n];
            boolean[] on = new boolean[n];
            int pc = 0;
            int mpc = 0;
            boolean fuse = false;

            for (int i = 0; i < n; i++) {
                String elem = br.readLine();
                d[i] = Integer.parseInt(elem);
            }
            for (int i = 0; i < m; i++) {
                String elem = br.readLine();
                int idx = Integer.parseInt(elem) - 1;

                if (on[idx]) {
                    pc -= d[idx];
                    on[idx] = false;
                } else {
                    pc += d[idx];
                    on[idx] = true;
                    if (pc > mpc) mpc = pc;
                }

                if (pc > c) {
                    fuse = true;
                }
            }

            System.out.println("Sequence " + tc++);
            if (fuse) {
                System.out.println("Fuse was blown.");
            } else {
                System.out.println("Fuse was not blown.");
                System.out.println("Maximal power consumption was " + mpc + " amperes.");
            }
            System.out.println();
        }
    }
}
