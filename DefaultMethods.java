import java.util.Iterator;

public class DefaultMethods implements DefaultMethod {
    public void sayMore(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        DefaultMethods dm = new DefaultMethods();
        dm.say();
        dm.sayMore("Work is worship");
        }

    }

