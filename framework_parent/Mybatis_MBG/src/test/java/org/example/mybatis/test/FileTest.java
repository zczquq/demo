package org.example.mybatis.test;

import org.junit.Test;

import java.io.File;

public class FileTest {

    private static final String FILENAME = "D:\\desktop\\台账问题汇总.xlsx";

    @Test
    public void testFile() {
        File file = new File(FILENAME);
        if (!file.exists()) {
            throw new RuntimeException("文件不存在！");
        }
        String name = file.getName();
        System.out.println("文件名：" + name);

    }

}
