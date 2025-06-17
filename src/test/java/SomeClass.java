import org.junit.jupiter.api.Test;

public class SomeClass {

    @Test
    public void test1() {
        int value = 2;
        int value2 = 3;
        assert value2 + value == 5;
    }

    @Test
    public void test2() {
        int x = 2;
        int y = 3;
        x=x/0;
        assert x != y;
    }   
}
