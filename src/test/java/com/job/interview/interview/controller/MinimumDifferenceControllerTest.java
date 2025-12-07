package com.job.interview.interview.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.boot.test.autoconfigure.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class MinimumDifferenceControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @Test
    public void minimumDifference() throws Exception {
        mockMvc.perform(get("/hello")).andExpect(status().isOk());
    }

}
