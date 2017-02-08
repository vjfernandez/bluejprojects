import java.util.*;

public class AppTraza211 {

    private int x = 1;
    private String s = "MARMOL";

    public int sampleMethod(int y, int x, String s, StringBuffer t) {
        y++;
        s = "GRANITO";
        this.s = "MICA";
        x++;
        //.delete(nn, kk) elimina los carácteres entre la posición nn(incluída) y kk(excluída)
        t.delete(0, t.length() - 1);
        //.append(rr) añade la cadena rr al final del stringbuffer
        t.append("NICE");
        return y;
    }

    public void run() {
        int y = 5;
        StringBuffer v = new StringBuffer("FELDESPATO");
        x = sampleMethod(x, y, "CALIZA", v);
        System.out.format("%d %d %s %s", x, y, s, v);
    }

    public static void main(String[] args) {
        new AppTraza211().run();
    }
}