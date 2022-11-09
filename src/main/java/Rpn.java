import java.util.ArrayList;
import java.util.List;

public class Rpn {
    List<Integer> stack;
    public Rpn() {
        stack = new ArrayList<>();
    }

    public void push(int number) {
        stack.add(number);
    }

    public void parse(String input) {
        var tokens = input.split(" ");
        for (var token : tokens) {
            if (token.equals("+")) {
                var a = stack.remove(stack.size() - 1);
                var b = stack.remove(stack.size() - 1);
                stack.add(a + b);
            }
            else if (token.equals("-")) {
                var a = stack.remove(stack.size() - 1);
                var b = stack.remove(stack.size() - 1);
                stack.add(b - a);
            }
            else if (token.equals("*")) {
                var a = stack.remove(stack.size() - 1);
                var b = stack.remove(stack.size() - 1);
                stack.add(a * b);
            }
            else {
                push(Integer.parseInt(token));
            }
        }
    }

}
