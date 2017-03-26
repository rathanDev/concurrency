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

    private static void test() {
        Runnable task = () -> System.out.println(Thread.currentThread().getName() + " is running");

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(task);
    }

    private static void rawThreadTest() {
        Runnable task = () -> System.out.println(Thread.currentThread().getName() + " is running");

        Thread thread = new Thread(task);
        thread.start();
    }

    private static void runnableTest() {
        Runnable task = () -> System.out.println(Thread.currentThread().getName() + " is running");
        task.run();
    }
}
