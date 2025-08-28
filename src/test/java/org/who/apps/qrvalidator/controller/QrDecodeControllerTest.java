package org.who.apps.qrvalidator.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class QrDecodeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void decodeReturnsStub() throws Exception {
        mockMvc.perform(post("/qr/decode")
                        .contentType("application/json")
                        .content("{\"dummy\":\"data\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("Decoded content placeholder"));
    }
}
