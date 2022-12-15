package com.anet.chcrud.config;

import com.clickhouse.jdbc.ClickHouseDataSource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;
import java.util.Properties;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class ClickhouseDatasourceConfig {

    @Bean
    public ClickHouseDataSource clickHouseDataSource() {
        String url = "jdbc:ch:https://gscaa6s364.eu-central-1.aws.clickhouse.cloud:8443/default";
        Properties properties = new Properties();
        properties.setProperty("user", "default");
        properties.setProperty("password", "nUDuYLOUgCCF");
        ClickHouseDataSource dataSource = null;
        try {
            dataSource = new ClickHouseDataSource(url, properties);
        } catch (SQLException throwables) {
            log.error("Couldn't connect to database!");
        }
        return dataSource;
    }

}