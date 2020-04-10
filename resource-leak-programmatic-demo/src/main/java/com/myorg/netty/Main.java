package com.myorg.netty;

import io.netty.util.ResourceLeakDetector;
import static io.netty.util.ResourceLeakDetector.Level.PARANOID;

public class Main {
    public static void main(String[] args) {
        ResourceLeakDetector.setLevel(PARANOID);
        HttpServer server = new HttpServer(5020);
        server.start();
    }
}
