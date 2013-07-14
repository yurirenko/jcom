package im.yuri.jcom;


import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.*;

public class App
{
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
//        Float faultProbability = Float.parseFloat(args[0]);
        //todo:
        // remove this!
        Float faultProbability = .2f;
        Channel[][] channels = new Channel[5][5];
        Process[] processes = new Process[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                channels[i][j] = new Channel();
            }
        }
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 3; i++) {
            executor.submit(new Process(i, channels, faultProbability));
        }

    }
}
