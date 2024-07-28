package com.lw.common.aliyun;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 17259
 * @create 2024-07-22 21:57
 */
@Component
@ConfigurationProperties(prefix = "aliyun")
public class AliyunProperties {
    private String accessKeyId;
    private String secret;
    private String scenes;

    // Getters and Setters

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getScenes() {
        return scenes;
    }

    public void setScenes(String scenes) {
        this.scenes = scenes;
    }
}
