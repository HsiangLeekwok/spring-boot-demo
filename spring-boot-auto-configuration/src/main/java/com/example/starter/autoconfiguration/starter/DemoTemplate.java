package com.example.starter.autoconfiguration.starter;

/**
 * <b>Author</b>: 小果<br/>
 * <b>Date</b>: 2020/02/24 21:55<br/>
 * <b>Version</b>: v1.0<br/>
 * <b>Subject</b>: <br/>
 * <b>Description</b>:
 */
public class DemoTemplate {

    // 没有具体的实现过程，这里只简单获取了一下配置值
    private DemoConfig config;

    public DemoTemplate(DemoConfig config) {
        this.config = config;
    }

    public String getUsername() {
        return config.getUsername();
    }

    public String getPassword() {
        return config.getPassword();
    }
}
