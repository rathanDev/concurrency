import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Challenge urself
 */

public class ExecutorServiceTest {

    public static void main(String[] args) {
        ExecutorServiceTest.test();
        ExecutorServiceTest.rawThreadTest();
        ExecutorServiceTest.runnableTest();
    }

    public static void test() {
        Runnable task = () -> System.out.println(Thread.currentThread().getName() + " is running");

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(task);
    }

    public static void rawThreadTest() {
        Runnable task = () -> System.out.println(Thread.currentThread().getName() + " is running");

        Thread thread = new Thread(task);
        thread.start();
    }

    public static void runnableTest() {
        Runnable task = () -> System.out.println(Thread.currentThread().getName() + " is running");
        task.run();
    }
}
