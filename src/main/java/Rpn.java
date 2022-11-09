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
            try {
                var number = Integer.parseInt(token);
                push(number);
            } catch (NumberFormatException e) {
                var a = stack.remove(stack.size() - 1);
                var b = stack.remove(stack.size() - 1);
                switch (token) {
                    case "+" -> push(a + b);
                    case "-" -> push(b - a);
                    case "*" -> push(a * b);
                }
            }
        }
    }

}
