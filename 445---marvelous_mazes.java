import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while ((s = br.readLine()) != null) {
            if (s.length() == 0) {
                System.out.println();
            } else {
                char[] chars =  s.toCharArray();
                int len = chars.length;
                int acu = 0;
                for (int i = 0; i < len; i++) {
                    char c = chars[i];
                    if (c == '!')
                        System.out.println();
                    else if (Character.isDigit(c))
                        acu += Character.getNumericValue(c);
                    else {
                        for (int j = 0; j < acu; j++) {
                            if (c == 'b')
                                System.out.print(" ");
                            else
                                System.out.print(c);
                        }
                        acu = 0;
                    }

                }
                System.out.println();
            }
        }
    }
}
