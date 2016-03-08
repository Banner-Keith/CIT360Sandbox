package parallelprocessing;

import java.util.ArrayList;

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

    static ArrayList<String> rankings = new ArrayList();
    static int numberFinished = 0;
    static int numberOfThreads;
    int numberOfRounds = 100;

    @Override
    public void run() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfRounds; i++) {
            sb.setLength(0);
            for (int j = 0; j < numberOfRounds; j++) {
                if (j == i) {
                    sb.append(Thread.currentThread().getName().charAt(Thread.currentThread().getName().length() - 1));
                } else {
                    sb.append('-');
                }
            }
            System.out.println(sb.toString());
            int sleepTime = 4 * (1 + (int) (Math.random() * 50));
            try {
                Thread.currentThread().sleep(sleepTime);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            if (i == numberOfRounds - 1) {
                if (rankings.isEmpty()) {
                    rankings.add(Thread.currentThread().getName());
                }
                else if (rankings.get(rankings.size() - 1).length() > 0) {
                    rankings.add(Thread.currentThread().getName());
                }
                numberFinished++;
            }
        }
        if (numberFinished == numberOfThreads) {
            System.out.println("\nRank\tRacer"
                    + "\n----------------");
            for (int k = 0; k < rankings.size(); k++) {
                System.out.println((k + 1) + ".\t" + rankings.get(k));
            }
            System.out.println("\n" + rankings.get(0) + " wins!");
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
