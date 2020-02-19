import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;

        while ((s = br.readLine()) != null) {
            if (s.equals("0")) break;
            while (s.length() != 1) {
                int sum = 0;
                for (int i = 0; i < s.length(); i++) {
                    sum += Integer.parseInt(String.valueOf(s.charAt(i)));
                }
                s = Integer.toString(sum);
            }
            System.out.println(s);
        }
    }
}
