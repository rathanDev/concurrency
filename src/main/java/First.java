/**
 * Challenge urself
 */

public class First {

    public static void main(String[] args) {
        First first = new First();
        first.test();
    }

    public void test() {

        Runnable runnable = new Runnable() {
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println("name = " + name);
            }
        };
        runnable.run();

        Runnable runnable2 = () -> {
            String name = Thread.currentThread().getName();
            System.out.println("namei = " + name);
        };
        runnable2.run();

        Thread thread = new Thread(runnable2);
        thread.start();

    }

}

