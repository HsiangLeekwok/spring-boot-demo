package com.example.starter.autoconfiguration.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <b>Author</b>: 小果<br/>
 * <b>Date</b>: 2020/02/24 21:52<br/>
 * <b>Version</b>: v1.0<br/>
 * <b>Subject</b>: <br/>
 * <b>Description</b>:
 */
@Configuration
// 条件：有当前指定类存在时
@ConditionalOnClass(DemoTemplate.class)
// 指定配置类
@EnableConfigurationProperties(DemoConfig.class)
public class CustomStarterRun {

    @Autowired
    private DemoConfig demoConfig;

    @Bean
    public DemoTemplate demoTemplate() {
        return new DemoTemplate(demoConfig);
    }
}
