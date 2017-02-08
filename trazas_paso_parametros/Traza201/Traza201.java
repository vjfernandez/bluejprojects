public class Traza201 {
    private int x;

    public Traza201() {
        x = 3;
    }

    public void m2(int k, String s) {
        s = s.toLowerCase();
        k = k + 1;
        x = x + 1;
    }

    public void run() {
        String q = "ROMA";
        int k = x;
        for (int i = 0; i < 3; i++) {
            m2(k + 3, q);
        }
        System.out.format("%d#%d#%s", x, k, q);
    }

    public static void main(String[] args) {
        new Traza201().run();
    }

}