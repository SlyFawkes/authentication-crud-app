package com.slyfawkes.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class AuthenticationDataSourceConfig {

    @Autowired
    Environment env;

    @Primary
    @Bean
    public DataSource dataSource() {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/auth");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        return dataSource;
    }
}
