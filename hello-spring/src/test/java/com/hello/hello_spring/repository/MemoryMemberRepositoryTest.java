package com.hello.hello_spring.repository;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.hello.hello_spring.domain.Member;

public class MemoryMemberRepositoryTest {
	MemoryMemberRepository repository = new MemoryMemberRepository();
	
	
	  @AfterEach
	    public void afterEach() {
	        repository.clearStore(); // store를 비워주는 메서드 (직접 구현해야 함)
	    }

	@Test
	public void save() {
		 Member member = new Member();
		 member.setName("Srping");
		 repository.save(member);
		 Member result = repository.findById(member.getId()).get();
		 System.out.println("result = "+ result.getId() );
		 Assertions.assertThat(member).isEqualTo(result);
	}
	
	@Test
	public void findbyname() {
		Member member1 = new Member();
		member1.setName("spring1");
		
		repository.save(member1);
		
		Member member2 = new Member();
		member2.setName("spring2");
		
		repository.save(member2);
		
		Member result = repository.findByName("spring1").get();
		
		assertThat(result).isEqualTo(member1);
	}
	
	@Test
	public void findall() {
		Member member1 = new Member();
		member1.setName("spring1");
		
		repository.save(member1);
		
		Member member2 = new Member();
		member2.setName("spring2");
		
		repository.save(member2);
		
		List<Member> result = repository.findAll();
		
		assertThat(result.size()).isEqualTo(2);
	}
}
