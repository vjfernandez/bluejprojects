public class AppTraza205 {
    public void chan(String[] a) {
        String p;
        for (int i = 0; i < a.length; i++) {
            p = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = p;
        }
    }

    public String[] chan2(String[] a) {
        String p;
        String[] b = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - i - 1];
        }
        return b;
    }

    public void run() {
        String[] bbb = {
                "volverán",
                "las",
                "oscuras",
                "golondrinas"
            };
        chan(bbb);
        System.out.print(bbb[bbb.length - 1]);
        bbb = chan2(chan2(bbb));
        System.out.print(bbb[bbb.length - 1]);
    }

    public static void main(String[] args) {
        new AppTraza205().run();
    }
}