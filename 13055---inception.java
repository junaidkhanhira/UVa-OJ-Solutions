import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns = br.readLine(), s;
        Stack<String> stack = new Stack<>();

        while ((s = br.readLine()) != null) {
            if (s.equals("Test")) {
                if (!stack.empty()) {
                    System.out.println(stack.peek());
                } else {
                    System.out.println("Not in a dream");
                }
            } else if (s.equals("Kick")) {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else {
                String[] stkStr = s.split(" ");
                stack.add(stkStr[1]);
            }
        }
    }
}
