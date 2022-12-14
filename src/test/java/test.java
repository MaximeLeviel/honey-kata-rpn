import org.junit.jupiter.api.Test;

public class test {
    @Test
    public void push_number_in_stack() {
        var rpn = new Rpn();
        rpn.push(1);
        assert rpn.stack.size() == 1;
        assert rpn.stack.get(0) == 1;
    }

    @Test
    public void push_two_numbers_in_stack() {
        var rpn = new Rpn();
        rpn.push(1);
        rpn.push(2);
        assert rpn.stack.size() == 2;
        assert rpn.stack.get(0) == 1;
        assert rpn.stack.get(1) == 2;
    }

    @Test
    public void parse_add() {
        var rpn = new Rpn();
        rpn.parse("1 2 +");
        assert rpn.stack.size() == 1;
        assert rpn.stack.get(0) == 3;
    }

    @Test
    public void parse_add2() {
        var rpn = new Rpn();
        rpn.parse("1 2 + 3 +");
        assert rpn.stack.size() == 1;
        assert rpn.stack.get(0) == 6;
    }

    @Test
    public void parse_sub() {
        var rpn = new Rpn();
        rpn.parse("1 2 -");
        assert rpn.stack.size() == 1;
        assert rpn.stack.get(0) == -1;
    }

    @Test
    public void parse_sub2() {
        var rpn = new Rpn();
        rpn.parse("1 2 - 3 -");
        assert rpn.stack.size() == 1;
        assert rpn.stack.get(0) == -4;
    }

    @Test
    public void parse_mul() {
        var rpn = new Rpn();
        rpn.parse("1 2 *");
        assert rpn.stack.size() == 1;
        assert rpn.stack.get(0) == 2;
    }

    @Test
    public void parse_div() {
        var rpn = new Rpn();
        rpn.parse("1 2 /");
        assert rpn.stack.size() == 1;
        assert rpn.stack.get(0) == 0.5;
    }

    @Test
    public void parse_div2() {
        var rpn = new Rpn();
        rpn.parse("1 2 / 3 /");
        assert rpn.stack.size() == 1;
        assert rpn.stack.get(0) == 0.5 / 3;
    }
}
