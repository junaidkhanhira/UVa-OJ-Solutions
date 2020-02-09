import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st;

        while ((st = br.readLine()) != null) {
            String[] sta = st.split(" ");
            String s = sta[0];
            String t = sta[1];

            boolean fl = false;
            int i = 0;
            for (int j = 0; j < t.length(); j++) {
                if (t.charAt(j) == s.charAt(i)) {
                    i++;
                }

                if (i >= s.length()) {
                    fl = true;
                    break;
                }
            }

            if (fl) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
