import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String lns = br.readLine();
        String[] lna = lns.split(" ");
        int l = Integer.parseInt(lna[0]);
        int n = Integer.parseInt(lna[1]);
        Map<String, String> map = new HashMap<>();


        for (int i = 0; i < l; i++) {
            String sp = br.readLine();
            String[] spa = sp.split(" ");
            map.put(spa[0], spa[1]);
        }

        for (int i = 0; i < n; i++) {
            StringBuilder res = new StringBuilder();
            String s = br.readLine();

            if (map.get(s) != null) {
                res.append(map.get(s));
            } else {
                char lc = s.charAt(s.length()-1);
                char blc = s.charAt(s.length()-2);
                String l2c = s.substring(s.length()-2);
                if (lc == 'y') {
                    if (!isVowel(blc)) {
                        String sub = s.substring(0, s.length()-1);
                        res.append(sub);
                        res.append("ies");
                    } else {
                        res.append(s);
                        res.append("s");
                    }
                } else if (lc == 'o' || lc == 's' || lc == 'x' || l2c.equals("ch") || l2c.equals("sh")) {
                    res.append(s);
                    res.append("es");
                } else {
                    res.append(s);
                    res.append("s");
                }
            }
            System.out.println(res);
        }
    }

    public static boolean isVowel(char c) {
        return ("AEIOUaeiou".indexOf(c) >= 0);
    }
}

