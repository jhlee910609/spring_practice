package com.junhee.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// ApplicaitonContext 설정도 알아서 해줌
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // been 설정을 [ ApplicationConfig.class ]함
        // [ @SpringBootApplication ] 가 아래 작업 대신 해줌. 따라서 [ ApplicationConfig.class ] 필요 없음
//        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);


    }
}
