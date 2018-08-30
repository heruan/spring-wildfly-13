package com.example.demo;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface MessageRepository
        extends PagingAndSortingRepository<Message, Long> {

}
