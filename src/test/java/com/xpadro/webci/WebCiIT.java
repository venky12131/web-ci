package com.xpadro.webci;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class WebCiIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void requestRespondsHello() throws Exception {
        MvcResult result = mockMvc.perform(get("/")).andExpect(status().isOk()).andReturn();
        assertThat(result.getResponse().getContentAsString(), equalTo("Hello!"));
    }

    @Test
    public void nonexistingEndpointReturns404() throws Exception {
        mockMvc.perform(get("/unexisting")).andExpect(status().isNotFound());
    }
}
