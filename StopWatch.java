package OOP;

import java.util.Date;

public class StopWatch {
    private double startTime, endTime;

    public double getStartTime() {
        return this.startTime;
    }

    public double getEndTime() {
        return this.endTime;
    }

    StopWatch() {
    }

    public void start() {
        this.startTime = new Date().getTime();
    }

    public void stop() {
        this.endTime = new Date().getTime();
    }

    public double getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public void CountPrimeFrom2To2000() {
        int count = 0;
        for (int i = 2; i < 2000000; i++) {
            if (i % 2 == 0 && i > 2 || i % 3 == 0 && i > 3 || i % 5 == 0 && i > 5 || i % 7 == 0 && i > 7) {
            } else {
                count++;
            }
        }
       }
        public static void main (String[]args){
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            System.out.println(stopWatch.getStartTime());
            stopWatch.CountPrimeFrom2To2000();
            stopWatch.stop();
            System.out.println(stopWatch.getEndTime());
            System.out.println(stopWatch.getElapsedTime());
        }

    }

