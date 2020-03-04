import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns = br.readLine(), s;
        int tc = 1;

        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s);
            int temp = n;
            int nsq = 0;
            if (temp > 9) {
                while (temp > 0) {
                    nsq += (temp%10) * (temp%10);
                    temp /= 10;
                }
            } else {
                nsq = temp*temp;
            }

            while (nsq > 9) {
                int temp1 = nsq;
                int temp2 = 0;
                while (temp1 > 0) {
                    temp2 += (temp1%10) * (temp1%10);
                    temp1 /= 10;
                }
                nsq = temp2;
            }

            if (nsq == 1) System.out.println("Case #" + tc++ + ": " + n + " is a Happy number.");
            else System.out.println("Case #" + tc++ + ": " + n + " is an Unhappy number.");
        }
    }
}
