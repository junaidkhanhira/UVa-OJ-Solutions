import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ts = br.readLine(), ns;
        int tc = 1;

        while ((ns = br.readLine()) != null) {
            int n = Integer.parseInt(ns);
            ArrayList<String> subList = new ArrayList<>();
            ArrayList<Integer> dayList = new ArrayList<>();

            while (n > 0) {
                n--;
                String sub = br.readLine();
                String[] subArr = sub.split(" ");
                subList.add(subArr[0]);
                dayList.add(Integer.parseInt(subArr[1]));
            }

            String ds = br.readLine();
            String dueStr = br.readLine();
            int d = Integer.parseInt(ds);


            System.out.print("Case " + tc++ + ": ");
            if (subList.contains(dueStr)) {
                int dueDay = dayList.get(subList.indexOf(dueStr));
                if (dueDay > d+5) {
                    System.out.println("Do your own homework!");
                } else if (dueDay > d && dueDay <= d+5) {
                    System.out.println("Late");
                } else {
                    System.out.println("Yesss");
                }
            } else {
                System.out.println("Do your own homework!");
            }
        }
    }
}
