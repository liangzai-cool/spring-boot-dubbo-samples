package org.xueliang.spring.boot.dubbo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author XueLiang
 */
@SpringBootApplication
public class Bootstrap {

    private static final Logger LOGGER = LoggerFactory.getLogger(Bootstrap.class);

    private static String applicationName;

    @Value("${spring.dubbo.application.name}")
    public void setApplicationName(String applicationName) {
        Bootstrap.applicationName = applicationName;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Bootstrap.class, args);
        LOGGER.info("consumer started.");
        AbcService abcService = configurableApplicationContext.getBean(AbcService.class);
        LOGGER.info("sayHi Method: {}", abcService.helloService.sayHi(applicationName));
        LOGGER.info("sayBye Method: {}", abcService.helloService.sayBye(applicationName));
    }
}
