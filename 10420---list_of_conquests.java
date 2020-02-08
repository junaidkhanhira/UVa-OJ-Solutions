import java.io.*;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<String, Integer> map = new TreeMap<>();

        String ts = br.readLine();
        int tc = Integer.parseInt(ts);

        for (int i = 0; i < tc; i++) {
            String s = br.readLine().trim();

            String[] tkn = s.split(" ");

            if (map.containsKey(tkn[0])) {
                int cnt = map.get(tkn[0]);
                map.put(tkn[0], ++cnt);
            } else {
                map.put(tkn[0], 1);
            }
        }

        map.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }
}
