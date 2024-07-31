package org.example;

import org.junit.Test;

public class StringTest {

    @Test
    public void test() {
        String str = "12321_wo_rd";
        System.out.println(str.substring(str.lastIndexOf("_")));
        System.out.println(str.substring(0,str.indexOf("_")));
    }
}
