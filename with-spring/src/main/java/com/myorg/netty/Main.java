package com.myorg.netty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appCtx =new ClassPathXmlApplicationContext("SampleApplicationContext.xml");
        HttpServer server = appCtx.getBean(HttpServer.class);
        server.start();
    }
}
