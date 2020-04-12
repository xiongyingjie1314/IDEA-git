package com.zstar.springbootfastdfsstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class SpringbootFastdfsStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFastdfsStudyApplication.class, args);
    }

}
