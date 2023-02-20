package sda.threads;

import static sda.threads.ThreadColor.ANSI_RED;

public class RunnableSample implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "RunnableSample class working");
    }
}
