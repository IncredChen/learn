import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created  with Intellij IDEA.
 * User: EleChen
 * Date: 17/4/25
 * Time: 16:50
 * Description: 描述.
 */
public class CallableTest {

    public static void main(String[] args) throws Exception {

        //创建任务
        MyCallable task = new MyCallable();

        //创建线程池
        ExecutorService poor = Executors.newFixedThreadPool(2);

        Future<Integer> f = poor.submit(task);
        System.out.println(f.get());
    }

}

class MyCallable implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("call");
        }

        return 1;
    }
}
