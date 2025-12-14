package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleAppTest {

    @Test
    void testAdd() {
        SimpleApp app = new SimpleApp();
        assertEquals(5, app.add(2, 3));
    }
}
