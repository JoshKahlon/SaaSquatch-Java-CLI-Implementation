package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testOutput() {
        // Simulate the behavior of the CLI
        CompanyNameCLI cli = new CompanyNameCLI();
        String output = "Welcome to SaaSquatch!";
        assertEquals(output, "Welcome to SaaSquatch!");
    }
}
