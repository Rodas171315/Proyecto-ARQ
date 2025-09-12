package com.servidor.servidor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HolaController.class)
public class HolaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHomeEndpoint() throws Exception {
        mockMvc.perform(get("/hola"))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello World"));
    }
}
