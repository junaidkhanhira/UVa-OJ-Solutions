import java.io.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while ((s = br.readLine()) != null) {
            LinkedList<Character> list = new LinkedList<>();
            int loc = 0;
            for (char c : s.toCharArray()) {
                if (c == '[') loc = 0;
                else if (c == ']') loc = list.size();
                else list.add(loc, c);
                loc++;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (char c: list) stringBuilder.append(c);
            System.out.println(stringBuilder.toString());
        }
    }
}
