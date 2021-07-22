package com.example.demo;

import com.example.demo.handler.AuthenticationHandler;
import com.example.demo.handler.PingPongHandler;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.servlet.Servlet;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    AuthenticationHandler authenticationHandler;

    @Autowired
    PingPongHandler pingPongHandler;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public Servlet authentication_handler() {
        TProcessor processor = new TAuthenticationService.Processor<>(authenticationHandler);
        TProtocolFactory protoFactory = new TJSONProtocol.Factory();
        return new TServlet(processor, protoFactory);
    }

    @Bean
    public Servlet pingpongservice_handler() {
        TProcessor processor = new TPingPongService.Processor<>(pingPongHandler);
        TProtocolFactory protoFactory = new TJSONProtocol.Factory();
        return new TServlet(processor, protoFactory);
    }

}
