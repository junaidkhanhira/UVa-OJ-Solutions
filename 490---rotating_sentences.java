import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        int ro = 0;
        int cl = 0;
        ArrayList<char[]> al = new ArrayList<>();

        while ((s = br.readLine()) != null) {
            ro++;
            char[] a = s.toCharArray();
            al.add(a);
            if (a.length > cl) cl = a.length;
        }

        for (int i = 0; i < cl; i++) {
            for (int j = ro-1; j >= 0; j--) {
                try {
                    System.out.print(al.get(j)[i]);
                } catch(ArrayIndexOutOfBoundsException e) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
