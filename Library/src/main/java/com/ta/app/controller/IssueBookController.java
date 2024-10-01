package com.ta.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ta.app.model.IssueBook;
import com.ta.app.service.IssueBookService;

@RestController
@RequestMapping("/api/issuebooks")
public class IssueBookController {
	 	@Autowired
	    private IssueBookService issueBookService;

	    @PostMapping
	    public ResponseEntity<IssueBook> issueBook(@RequestBody IssueBook issueBook) {
	        IssueBook issuedBook = issueBookService.issueBook(issueBook);
	        return ResponseEntity.ok(issuedBook);
	    }

	    @PutMapping("/{id}/return")
	    public ResponseEntity<Void> returnBook(@PathVariable Long id) {
	        issueBookService.returnBook(id);
	        return ResponseEntity.noContent().build();
	    }

	    @GetMapping
	    public ResponseEntity<List<IssueBook>> getAllIssuedBooks() {
	        List<IssueBook> issuedBooks = issueBookService.getAllIssuedBooks();
	        return ResponseEntity.ok(issuedBooks);
	    }
}
