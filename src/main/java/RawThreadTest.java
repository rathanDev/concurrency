import java.util.concurrent.TimeUnit;

/**
 * Challenge urself
 */

public class RawThreadTest {

    public static void main(String[] args) {
        RawThreadTest rawThreadTest = new RawThreadTest();
        rawThreadTest.test();
    }

    public void test() {

//        Runnable runnable = new Runnable() {
//            public void run() {
//                String name = Thread.currentThread().getName();
//                System.out.println("name = " + name);
//            }
//        };
//        runnable.run();
//
//        Runnable runnable2 = () -> {
//            String name = Thread.currentThread().getName();
//            System.out.println("namei = " + name);
//        };
//        runnable2.run();
//
//        Thread thread = new Thread(runnable2);
//        thread.start();

        Runnable taski = () -> {
            String name = Thread.currentThread().getName();
            System.out.println("name = " + name);
            try {
                System.out.println("going to sleep");
                TimeUnit.SECONDS.sleep(5);
                System.out.println("got up");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        };

        System.out.println("sleepy " + Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("simple sleep");
            Thread.sleep(2000);
            System.out.println("ok");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread = new Thread(taski);
        thread.start();

    }

}

