import java.util.ArrayList;
import java.util.List;

public class Rpn {
    List<Integer> stack;
    public Rpn() {
        stack = new ArrayList();
    }

    public void push(int number) {
        stack.add(number);
    }

}
