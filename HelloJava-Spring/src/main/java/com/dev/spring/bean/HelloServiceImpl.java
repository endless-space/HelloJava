package com.dev.spring.bean;

import java.util.Optional;

public class HelloServiceImpl implements HelloService {
    private static final String DEFAULT_NAME = "guest";

    @Override
    public String sayHello(String userName) {
        StringBuilder helloBuilder = new StringBuilder();
        helloBuilder.append("hello, ");
        helloBuilder.append(Optional.ofNullable(userName).orElse(DEFAULT_NAME));
        return helloBuilder.toString();
    }

    @Override
    public String sayHello(User user) {
        return sayHello(Optional.ofNullable(user).map(User::getName).orElse(DEFAULT_NAME));
    }
}
