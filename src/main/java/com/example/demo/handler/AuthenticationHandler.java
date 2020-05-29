package com.example.demo.handler;

import com.example.demo.TAuthenticationService;
import com.example.demo.service.AuthenticationService;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationHandler implements TAuthenticationService.Iface {
    @Autowired
    AuthenticationService authenticationService;


    @Override
    public boolean authenticateUser(String userName, String password) throws TException {
        return authenticationService.authenticateUser(userName, password);
    }
}
