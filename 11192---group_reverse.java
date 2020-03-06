import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;

        while ((s = br.readLine()) != null) {
            if (s.equals("0")) break;
            String[] nsa = s.split(" ");
            String str = nsa[1];
            int n = str.length() / Integer.parseInt(nsa[0]);
            StringBuilder res = new StringBuilder();
            int i = 0, j = n-1;

            if (n != 1){
                while (j <= str.length()) {
                    for (int x = j; x >= i; x--) {
                        res.append(str.charAt(x));
                    }
                    i = j + 1;
                    j += n;
                }
                System.out.println(res);
            } else {
                System.out.println(str);
            }
        }
    }
}

