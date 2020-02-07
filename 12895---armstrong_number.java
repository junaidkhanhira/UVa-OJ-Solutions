import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ts = br.readLine();
        int tc = Integer.parseInt(ts);

        for (int i = 0; i < tc; i++) {
            String s = br.readLine();
            int n = Integer.parseInt(s);

            ArrayList<Integer> list = new ArrayList<>();
            for (char c : s.toCharArray()) {
                list.add(Character.getNumericValue(c));
            }

            int p = 1;
            boolean fl = false;
            while (p > 0) {
                int sum = 0;
                for (int j = 0; j < list.size(); j++) {
                    sum += (Math.pow(list.get(j), p));
                }
                if (sum == n) {
                    fl = true;
                    break;
                } else if (sum > n) {
                    break;
                }
                p++;
            }

            if (fl) System.out.println("Armstrong");
            else System.out.println("Not Armstrong");
        }
    }
}
