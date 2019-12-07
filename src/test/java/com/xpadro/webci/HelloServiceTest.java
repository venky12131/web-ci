package com.xpadro.webci;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HelloServiceTest {

    @Test
    void hello() {
        HelloService service = new HelloService();
        assertThat(service.hello(), equalTo("Hello!"));
    }
}