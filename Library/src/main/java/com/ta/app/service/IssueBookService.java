package com.ta.app.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta.app.model.IssueBook;
import com.ta.app.repository.IssuedBookRepository;


@Service
public class IssueBookService {
	@Autowired
    private IssuedBookRepository issueBookRepository;

    public IssueBook issueBook(IssueBook issueBook) {
        issueBook.setIssueDate(LocalDate.now());
        return issueBookRepository.save(issueBook);
    }

    public void returnBook(Long id) {
        IssueBook issueBook = issueBookRepository.findById(id).orElseThrow(() -> new RuntimeException("Issue record not found"));
        issueBook.setReturnDate(LocalDate.now());
        issueBookRepository.save(issueBook);
    }

    public List<IssueBook> getAllIssuedBooks() {
        return issueBookRepository.findAll();
    }
}
