package com.hello.hello_spring.service;

import com.hello.hello_spring.repository.MemberRepository;
import com.hello.hello_spring.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.hello_spring.domain.Member;

/**
 * 
 */

public class MemberService {
	
	private final MemberRepository membeRepository;
	
	
	public MemberService(MemberRepository memberRepository) {
		this.membeRepository = memberRepository;
	}
	
	public Long Join(Member member) {
		validateDuplicateMemeber(member);//중복 회원 검증
		membeRepository.save(member);
		return member.getId();
		
	}

	private void validateDuplicateMemeber(Member member) {
		membeRepository.findByName(member.getName())
			.ifPresent(m -> {
			throw new IllegalStateException("이미 존재하는 회원입니다.");
		});
	}
	
	public List<Member> findMemebers(){
		return membeRepository.findAll();
	}
	
	public Optional<Member> findOne(Long memeberId){
		return membeRepository.findById(memeberId);
		
	}
}
