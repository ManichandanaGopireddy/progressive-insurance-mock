package com.insurance.session;

import com.insurance.dynamo.config.DynamoDbProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(scanBasePackages = "com.insurance")
@EnableConfigurationProperties(DynamoDbProperties.class)
public class QuoteSessionApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuoteSessionApplication.class, args);
    }
}