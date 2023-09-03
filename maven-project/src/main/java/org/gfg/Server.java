package org.gfg;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
       while(true){
           System.out.println("Please enter your input");
           executorService.submit(new Runnable() {
               @Override
               public void run() {
                   System.out.println("hey your input is " +scanner.nextLine() +" with the threadName : " +Thread.currentThread().getName());
               }
           });
           Thread.sleep(10000);
       }
    }
}
// how exactly communication happens
