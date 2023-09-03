package org.gfg;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class HttpServerDemo {
    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress("localhost" , 8080) , 0);
        httpServer.createContext("/hello" , new HelloHandler());
//        httpServer.createContext("/setData" , new DataHandler());
        httpServer.setExecutor(Executors.newFixedThreadPool(4));
        httpServer.start();
    }
}
