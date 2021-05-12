package com.nowcoder.community;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jl
 * @date 2021/5/12 -9:45
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class LoggerTests {

    private static final Logger logger = LoggerFactory.getLogger(LoggerTests.class);  //类名就是logger名字

    @Test
    public void testLogger(){
        System.out.println(logger.getName());
        logger.debug("debug log");  //一般最低级别
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");  //打印完日志之后需要在配置文件中声明应该启动什么级别的日志,logback（Spring Boot内置的记录日志的工具）才知道打印什么信息
    }
}
