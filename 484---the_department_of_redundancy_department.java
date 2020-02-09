import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        String[] t;
        ArrayList<String> al = new ArrayList<>();

        while ((s = br.readLine()) != null) {
            t = s.split(" ");
            al.addAll(Arrays.asList(t));
        }

        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> oal = new ArrayList<>();
        for (int i = 0; i < al.size(); i++) {
            if (map.containsKey(al.get(i))) {
                int cnt = map.get(al.get(i)) + 1;
                map.put(al.get(i), cnt);
            } else {
                map.put(al.get(i), 0);
                oal.add(al.get(i));
            }
        }

        for (int i = 0; i < oal.size(); i++) {
            System.out.println(oal.get(i) + " " + (map.get(oal.get(i))+1));
        }
    }
}
