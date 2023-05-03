package com.sumit.Record;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="app")
public record ConfigProperties1(String data) {

}
