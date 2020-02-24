package com.spring.demo;

import com.example.starter.autoconfiguration.starter.DemoTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        // 打印 properties 中配置的值
        System.out.println(demoTemplate.getUsername()+", "+demoTemplate.getPassword());
    }

    // 注入 starter 核心实现类中的 Bean
    @Autowired
    private DemoTemplate demoTemplate;
}
