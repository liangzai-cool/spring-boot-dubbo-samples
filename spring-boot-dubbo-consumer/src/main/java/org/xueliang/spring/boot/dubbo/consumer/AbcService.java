package org.xueliang.spring.boot.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.xueliang.spring.boot.dubbo.api.HelloService;

/**
 * @author XueLiang
 */
@Component
public class AbcService {

    @Reference(version = "1.0.0")
    public HelloService helloService;
}
