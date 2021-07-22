package com.example.demo.builder;

import com.example.demo.TPongResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PingPongBuilder {
    public static TPongResponse buildTPongResponse(List<Integer> list){
        return new TPongResponse(list);
    }
}
