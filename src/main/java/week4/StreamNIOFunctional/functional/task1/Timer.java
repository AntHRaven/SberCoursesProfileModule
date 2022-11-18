package week4.StreamNIOFunctional.functional.task1;

//Заведем свой таймер:
public class Timer {
    public long timeNanoseconds = 0;
    
    public void measureTime(Runnable runnable) {
        long startTime = System.nanoTime();
        runnable.run();
        timeNanoseconds += System.nanoTime() - startTime;
    }
}
