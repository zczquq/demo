package org.example.test;

import org.junit.Test;

public class SubStringTest {
    @Test
    public void test() {
        String str = "Hello,World,asdf";
        String[] split = str.split(",");
        System.out.println(split.toString());
        System.out.println(split[1]);
    }
}
