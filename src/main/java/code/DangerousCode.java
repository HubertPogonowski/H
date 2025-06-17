package code;

public class DangerousCode {

    public void brokenMethod() {
        int[] arr = new int[1];
        int fail = arr[2];
    }

    public void duplicatedCode1() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }

    public void duplicatedCode2() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }

    public void duplicatedCode3() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }

    public void untestedCode() {
        String str = null;
        System.out.println(str.length()); //
    }

    public void riskyExit() {
        System.exit(1); //
    }

    public void silentCatch() {
        try {
            int x = 1 / 0;
        } catch (Exception e) {

        }
    }
}
