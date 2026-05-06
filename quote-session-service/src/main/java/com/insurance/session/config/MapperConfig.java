package com.insurance.session.config;

import com.insurance.session.mapper.DriverMapper;
import com.insurance.session.mapper.DriverMapperImpl;
import com.insurance.session.mapper.QuoteSessionMapper;
import com.insurance.session.mapper.QuoteSessionMapperImpl;
import com.insurance.session.mapper.VehicleMapper;
import com.insurance.session.mapper.VehicleMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public QuoteSessionMapper quoteSessionMapper() {
        return new QuoteSessionMapperImpl();
    }

    @Bean
    public VehicleMapper vehicleMapper() {
        return new VehicleMapperImpl();
    }

    @Bean
    public DriverMapper driverMapper() {
        return new DriverMapperImpl();
    }
}