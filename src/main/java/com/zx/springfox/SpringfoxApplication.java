package com.zx.springfox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringfoxApplication {

    public static void main(String[] args) {
        try{
            SpringApplication.run(SpringfoxApplication.class, args);

            int i = 0;
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
