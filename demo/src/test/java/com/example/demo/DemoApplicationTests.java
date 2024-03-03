package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	 @Test
    public void testAdd() {
        calcule math = new calcule ();
        int result = math.add(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void testMulti() {
        calcule math = new calcule ();
        int result = math.multiply(3, 4);
        assertEquals(12, result);
    }

    @Test
    public void testDiv() {
        calcule math = new calcule ();
        int result = math.divide(10, 2);
        assertEquals(5, result);
    }
}

}
