import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ns = br.readLine();
        int n = Integer.parseInt(ns);

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            if (s.length() > 0) {
                Stack<Character> stack = new Stack<>();
                boolean fl = true;
                for (int j = 0; j < s.length(); j++) {
                    char b = s.charAt(j);
                    if (b == '(' || b == '[') {
                        stack.push(b);
                    } else {
                        if (b == ')')
                            b = '(';
                        if (b == ']')
                            b = '[';

                        if (stack.isEmpty()){
                            fl = false;
                            break;
                        }

                        if (b == stack.peek()) {
                            stack.pop();
                        } else {
                            fl = false;
                            break;
                        }
                    }
                }

                if (stack.isEmpty()) {
                    if (fl) System.out.println("Yes");
                    else System.out.println("No");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("Yes");
            }
        }

    }
}
