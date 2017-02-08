public class Foo {

    private String name;
    private int d;

    public Foo(String name, int d) {
        this.name = name;
        this.d = d;
    }

    public void setD(int y) {
        d = (y > 0 ? (y < 10 ? y : 10) : 0);
    }

    public int getD() {
        return d;
    }
}