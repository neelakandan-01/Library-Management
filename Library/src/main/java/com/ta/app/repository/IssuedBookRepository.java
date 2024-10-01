package com.ta.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ta.app.model.IssueBook;

@Repository
public interface IssuedBookRepository extends JpaRepository<IssueBook, Long>{

}
