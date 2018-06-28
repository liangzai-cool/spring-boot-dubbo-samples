package org.xueliang.spring.boot.dubbo.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @author XueLiang
 */
@SpringBootApplication
public class Bootstrap {

    private static final Logger LOGGER = LoggerFactory.getLogger(Bootstrap.class);

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Bootstrap.class, args);
        LOGGER.info("provider started.");
    }
}
