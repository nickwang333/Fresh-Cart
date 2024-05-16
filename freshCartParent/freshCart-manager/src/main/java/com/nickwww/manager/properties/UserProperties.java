package com.nickwww.manager.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.beans.ConstructorProperties;
import java.util.List;

@Data
@ConfigurationProperties(prefix = "nickwww.auth")
public class UserProperties {
    private List<String> noAuthUrls;
}
