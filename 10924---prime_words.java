import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        String lt = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while ((s = br.readLine()) != null) {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += lt.indexOf(s.charAt(i)) + 1;
            }
            if (isPrime(sum)) System.out.println("It is a prime word.");
            else System.out.println("It is not a prime word.");
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n%i == 0) return false;
        }
        return true;
    }
}

