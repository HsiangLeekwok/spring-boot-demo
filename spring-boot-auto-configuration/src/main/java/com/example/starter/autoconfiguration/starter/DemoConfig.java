package com.example.starter.autoconfiguration.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <b>Author</b>: 小果<br/>
 * <b>Date</b>: 2020/02/24 21:54<br/>
 * <b>Version</b>: v1.0<br/>
 * <b>Subject</b>: <br/>
 * <b>Description</b>:
 */
@ConfigurationProperties(prefix = "spring.example")
public class DemoConfig {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
