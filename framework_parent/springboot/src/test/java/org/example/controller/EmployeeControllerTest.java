package org.example.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 16339
 */
@SpringBootTest
class EmployeeControllerTest {

    @Test
    public void m1() {
        String s1 = "11";
        String s2 = new String("11");
        String s3 = "11";
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
    }
}
