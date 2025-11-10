package com.hello.hello_spring.repository;

import com.hello.hello_spring.domain.Member;
import java.util.Optional;
import java.util.List;

public interface MemberRepository {
	Member save(Member member);

	
	//ID 로 이름찾기
	Optional<Member> findById(Long id);
	
	//이름으로 ID찾기
	Optional<Member> findByName(String name);
	
	
	List<Member> findAll();
}
