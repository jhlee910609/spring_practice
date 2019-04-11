package com.junhee.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class BookService {
    @Autowired
    private BookRepository bookRepository;

    // setter를 사용하게 되면, 생성자를 통한 유입보다 훨씬 의존성 주입이 훨씬 유연해진다.
    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
