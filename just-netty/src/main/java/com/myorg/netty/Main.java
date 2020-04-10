package com.myorg.netty;

public class Main {
    public static void main(String[] args) {
        HttpServer server = new HttpServer(5020);
        server.start();
    }
}
