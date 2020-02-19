import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        boolean fl = true;

        while ((s = br.readLine()) != null) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '"') {
                    if (fl) {
                        System.out.print("``");
                        fl = false;
                    } else {
                        System.out.print("''");
                        fl = true;
                    }
                } else {
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
