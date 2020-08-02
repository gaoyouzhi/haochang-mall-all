package com.haochang.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JwtCAProperties {

    /**
     * 证书名称
     */
    @Value("${haochang.jwt.keyPairName}")
    private String keyPairName;

    /**
     * 证书别名
     */
    @Value("${haochang.jwt.keyPairAlias}")
    private String keyPairAlias;

    /**
     * 证书私钥
     */
    @Value("${haochang.jwt.keyPairSecret}")
    private String keyPairSecret;

    /**
     * 证书存储密钥
     */
    @Value("${haochang.jwt.keyPairStoreSecret}")
    private String keyPairStoreSecret;

    public String getKeyPairName() {
        return keyPairName;
    }

    public void setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
    }

    public String getKeyPairAlias() {
        return keyPairAlias;
    }

    public void setKeyPairAlias(String keyPairAlias) {
        this.keyPairAlias = keyPairAlias;
    }

    public String getKeyPairSecret() {
        return keyPairSecret;
    }

    public void setKeyPairSecret(String keyPairSecret) {
        this.keyPairSecret = keyPairSecret;
    }

    public String getKeyPairStoreSecret() {
        return keyPairStoreSecret;
    }

    public void setKeyPairStoreSecret(String keyPairStoreSecret) {
        this.keyPairStoreSecret = keyPairStoreSecret;
    }
}
