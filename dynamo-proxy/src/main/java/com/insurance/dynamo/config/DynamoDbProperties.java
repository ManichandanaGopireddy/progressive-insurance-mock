package com.insurance.dynamo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "aws.dynamodb")
public class DynamoDbProperties {

    private String region;
    private Tables tables = new Tables();

    @Data
    public static class Tables {
        private String quoteSessions = "quote_sessions";
        private String sessionVehicles = "session_vehicles";
        private String sessionDrivers = "session_drivers";
    }
}