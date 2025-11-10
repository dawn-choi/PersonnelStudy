package com.hello.hello_spring;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hello.hello_spring.repository.JdbcTemplateMemberRepositiry;
import com.hello.hello_spring.repository.MemberRepository;
import com.hello.hello_spring.repository.MemoryMemberRepository;
import com.hello.hello_spring.service.MemberService;

@Configuration
public class SpringConfig {
	
	private DataSource dataSource;  
	
    public SpringConfig(DataSource dataSource) { // Boot가 자동 주입
        this.dataSource = dataSource;
    }
	
	@Bean
	public MemberService memberSerivce() {
		return new MemberService(memberRepository());
	}
	
	
	@Bean
	public MemberRepository memberRepository() {
		return new JdbcTemplateMemberRepositiry(dataSource);
	}
}
