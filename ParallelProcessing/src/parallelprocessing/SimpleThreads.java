package parallelprocessing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Keith
 */
public class SimpleThreads extends Thread {

    static String winner = "";
    static int numberFinished = 0;
    static int numberOfThreads;
    int numberOfRounds = 100;

    @Override
    public void run() {
        for (int i = 0; i < numberOfRounds; i++) {
            //System.out.println(Thread.currentThread().getName() + ", round " + (i + 1) + " has started");
            for (int j = 0; j < numberOfRounds; j++) {
                if (j == i) {
                    System.out.print(Thread.currentThread().getName().charAt(Thread.currentThread().getName().length() - 1));
                } else {
                    System.out.print("-");
                }
            }
            System.out.println("");
            int sleepTime = 1 + (int) (Math.random() * 100);
            try {
                Thread.currentThread().sleep(sleepTime);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //System.out.println(Thread.currentThread().getName() + ", round " + (i + 1) + " has finished.");
            if (i == numberOfRounds - 1 && winner.equals("")) {
                winner = Thread.currentThread().getName();
            }
            if (i == numberOfRounds - 1) {
                numberFinished++;
            }
        }
        if (numberFinished == numberOfThreads) {
            System.out.println("\n" + winner + " wins!");
        }
    }

    public static void simpleThreadsExample(int numberOfRacers) {
        numberOfThreads = numberOfRacers;
        for (int threadCnt = 0; threadCnt < numberOfThreads; threadCnt++) {
            SimpleThreads simpleThreads = new SimpleThreads();
            simpleThreads.start();
        }
    }
}
