package dev.aniket.springrediscache3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringRedisCache3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringRedisCache3Application.class, args);
    }

}
