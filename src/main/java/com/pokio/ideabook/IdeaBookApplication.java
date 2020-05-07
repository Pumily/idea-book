package com.pokio.ideabook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.pokio.ideabook.mapper","com.pokio.ideabook.config"})
public class IdeaBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdeaBookApplication.class, args);
    }

}
