import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        ThreadRace threadRace=new ThreadRace();
        ExecutorService pool= Executors.newFixedThreadPool(4);
        pool.execute(threadRace);




    }
}
