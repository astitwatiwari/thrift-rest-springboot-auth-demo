package com.example.demo.handler;

import com.example.demo.TPingPongService;
import com.example.demo.TPongResponse;
import com.example.demo.builder.PingPongBuilder;
import com.example.demo.service.PingPongService;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PingPongHandler implements TPingPongService.Iface {

    @Autowired
    PingPongService pingPongService;
    @Autowired
    PingPongBuilder pingPongBuilder;

    @Override
    public TPongResponse ping() throws TException {
        return PingPongBuilder.buildTPongResponse(pingPongService.randomGen());
    }
}
