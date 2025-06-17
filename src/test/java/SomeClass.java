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

    @Test
    public void testWithEmptyCatch() {
        try {
            int a = 1 / 0;
        } catch (Exception e) {
            // Violation: empty catch block
        }
    }

    @Test
    public void testWithPrint() {
        System.out.println("This should be logged properly"); // Violation: use logger instead
    }

    @Test
    public void duplicatedLogic1() {
        int a = 10;
        int b = 20;
        int sum = a + b;
    }

    @Test
    public void duplicatedLogic2() {
        int a = 10;
        int b = 20;
        int sum = a + b; // Violation: duplicated code
    }
}
