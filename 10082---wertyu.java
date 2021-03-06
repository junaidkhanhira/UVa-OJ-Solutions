import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        String kb = "/.,MNBVCXZ';LKJHGFDSA\\][POIUYTREWQ=-0987654321`";

        while ((s = br.readLine()) != null) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c != ' ') {
                    int idx = kb.indexOf(c);
                    System.out.print(kb.charAt(idx+1));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
