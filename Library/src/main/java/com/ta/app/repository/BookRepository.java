package com.ta.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ta.app.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
