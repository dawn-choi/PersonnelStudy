/**
 * 
 */
package com.hello.hello_spring.service;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hello.hello_spring.domain.Member;
import com.hello.hello_spring.repository.MemoryMemberRepository;
import com.hello.hello_spring.service.MemberService;
/**
 * 
 */
class MemberServiceTest {
	
	MemberService memberService; 
	MemoryMemberRepository memberReository;
	
	
	@BeforeEach
	public void beforeEach() {
		memberReository = new MemoryMemberRepository();
		memberService = new MemberService(memberReository);
	}
	
	  @AfterEach
	    public void afterEach() {
		  memberReository.clearStore(); // store를 비워주는 메서드 (직접 구현해야 함)
	    }
	
	/**회원가입 */
	@Test
	void Join() {
		//given
		Member member = new Member();
		member.setName("Hello");
		//when
		Long saveId = memberService.Join(member);
		//Then
		Member findMember = memberService.findOne(saveId).get();
		assertThat(member.getName()).isEqualTo(findMember.getName());
		
	}
	
	@Test
	void 중복회원예외() {
		//given
		Member member1 = new Member();
		member1.setName("spring");
		
		Member member2 = new Member();
		member2.setName("spring");
		
		//when
		memberService.Join(member1);
		
		IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.Join(member2));
		assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
//		try {
//			memberService.Join(member2);
//			fail();
//		} catch(IllegalStateException e) {
//			assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
//		}
		
		//then
	}
	
	@Test
	void findMemebers(){
		
	}
	@Test
	void findOne(){
		
	}
}
