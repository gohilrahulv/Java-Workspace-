package com.bookapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookapi.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
