public class AppTraza207 {
    private int j = 0;
    public static int k = 0;
    static {
        k = 3;
    }
    public AppTraza207() {
        j = 2;
    }

    public void m1() {
        System.out.format("m1 j:%d;k:%d#", j, k);
    }

    public void run() {
        System.out.format("run j:%d;k:%d#", j, k);
        j = 4;
        m1();
    }

    public static void main(String[] args) {
        int j = 1;
        System.out.format("main j:%d;k:%d#", j, k);
        new AppTraza207().run();
        System.out.format("bye");
    }
}