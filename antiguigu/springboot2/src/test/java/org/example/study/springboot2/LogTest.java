package org.example.study.springboot2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LogTest {

    /**
     * 日志记录器
     */
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {

        // 日志的级别，由低到高
        // 可以调整需要输出的日志级别
        // 可以调高日志级别，日志就只会在这个级别以后的高级别生效
        logger.trace("trace日志");
        logger.debug("debug信息");
        logger.info("这是info日志");
        logger.warn("这是warn日志");
        logger.error("这是error日志");
    }
}
