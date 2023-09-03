package org.gfg;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String resp = "I am inside the handle method with thread name" + Thread.currentThread().getName();
        exchange.sendResponseHeaders(200, resp.length());
        // business logic
        // call a method ??
        OutputStream outputStream = exchange.getResponseBody();
        outputStream.write(resp.getBytes(StandardCharsets.UTF_8));
        outputStream.flush();
        outputStream.close();

    }
}

