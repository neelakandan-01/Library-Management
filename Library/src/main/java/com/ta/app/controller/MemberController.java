package com.ta.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ta.app.model.Member;
import com.ta.app.service.MemberService;

@RestController
@RequestMapping("/api/members")
public class MemberController {
	 	@Autowired
	    private MemberService memberService;

	    @GetMapping
	    public List<Member> getAllMembers() {
	        return memberService.getAllMembers();
	    }

	    @PostMapping
	    public Member addMember(@RequestBody Member member) {
	        return memberService.addMember(member);
	    }

	    @PutMapping("/{id}")
	    public Member updateMember(@PathVariable Long id, @RequestBody Member member) {
	        return memberService.updateMember(id, member);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteMember(@PathVariable Long id) {
	        memberService.deleteMember(id);
	        return ResponseEntity.noContent().build();
	    }
}
