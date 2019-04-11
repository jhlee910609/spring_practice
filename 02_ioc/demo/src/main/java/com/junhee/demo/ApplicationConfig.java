package com.junhee.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// 아래 선언한 클래스부터 어노테이션을 찾아 bean을 등록해라
@ComponentScan(basePackageClasses = DemoApplication.class)
public class ApplicationConfig {

    @Bean
    public BookRepository bookRepository(){
        return new BookRepository();
    }

    @Bean
    public BookService bookService(){
        // 만약 BookService 생성 시, 생성자를 활용해 BookRepository 객체를 주입해야할 경우
        // BookService 객체에 @Autowired 사용이 어려워 의존성 주입을 편리하게 하기가 어렵다.
        return new BookService();
    }

}
