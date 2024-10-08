package com.ta.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ta.app.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
