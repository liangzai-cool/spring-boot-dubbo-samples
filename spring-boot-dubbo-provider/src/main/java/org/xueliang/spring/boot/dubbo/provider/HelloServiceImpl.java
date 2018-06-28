package org.xueliang.spring.boot.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import org.xueliang.spring.boot.dubbo.api.HelloService;

/**
 * @author XueLiang
 */
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

    public String sayHi(String name) {
        return "Hello " + name;
    }

    public String sayBye(String name) {
        return "Bye " + name;
    }
}
