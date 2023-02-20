package sda.threads;

import static sda.threads.ThreadColor.ANSI_BLUE;
import static sda.threads.ThreadColor.ANSI_PURPLE;

public class SeparateThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Separate class thread launched");
        System.out.println(ANSI_BLUE + "Thread name : " + currentThread().getName());

        try {
            sleep(4000);
            System.out.println(ANSI_BLUE + "Sleep is over");
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Somebody broke the sleep");
        }
    }
}
