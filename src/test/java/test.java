import org.junit.jupiter.api.Test;

public class test {
    @Test
    public void push_number_in_stack() {
        var rpn = new Rpn();
        rpn.push(1);
        assert rpn.stack.size() == 1;
        assert rpn.stack.get(0) == 1;
    }
}
