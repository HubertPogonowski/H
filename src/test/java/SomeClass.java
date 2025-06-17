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
        assert x != y;
    }  
//koment
public class DuplicateTest {
    public void logic1() {
        int x = 10;
        int y = 20;
        int z = x + y;
    }

    public void logic2() {
        int x = 10;
        int y = 20;
        int z = x + y; // duplikacja
    }
}
  
}
