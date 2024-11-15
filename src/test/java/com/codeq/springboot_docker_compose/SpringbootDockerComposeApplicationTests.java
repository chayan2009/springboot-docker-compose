package com.codeq.springboot_docker_compose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDockerComposeApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(SpringbootDockerComposeApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test cases");
        assertEquals(false, false);
    }

}
