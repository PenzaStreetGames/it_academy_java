package penzastreet.com.task_3.part_2.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {



        Thread thread = new Thread() {

            @Override
            public void run() {
                //showAd();
            }
        };

        thread.start();
    }
    public void showAd() {};


}
