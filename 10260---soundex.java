import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        Map<String, Character> map = new HashMap<>();
        map.put("BFPV", '1');
        map.put("CGJKQSXZ", '2');
        map.put("DT", '3');
        map.put("L", '4');
        map.put("MN", '5');
        map.put("R", '6');
        map.put("AEIOUHWY", '0');

        while ((s = br.readLine()) != null) {
            ArrayList<Character> list = new ArrayList<>();
            StringBuilder res = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                for (Map.Entry<String, Character> entry : map.entrySet()) {
                    if (entry.getKey().indexOf(c) >= 0) {
                        list.add(entry.getValue());
                    }
                }
            }

            res.append(list.get(0));

            for (int i = 1; i < list.size(); i++) {
                char prev = res.charAt(res.length()-1);
                char curr = list.get(i);
                if (prev != curr) {
                    res.append(curr);
                }
            }

            for (int i = 0; i < res.length(); i++) {
                char c = res.charAt(i);
                if (c != '0') System.out.print(c);
            }

            System.out.println();
        }
    }
}
