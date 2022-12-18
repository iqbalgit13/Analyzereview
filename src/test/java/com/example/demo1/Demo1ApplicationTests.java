package com.example.demo1;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo1ApplicationTests {

    private Demo1Application analyser = new Demo1Application();
    @Test
    public void testWordCount() {
   	 assertEquals(7,analyser.getWordCount("Train to win in the digital economy"));
    }
}

