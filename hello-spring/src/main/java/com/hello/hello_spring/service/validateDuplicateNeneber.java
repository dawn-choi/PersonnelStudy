package com.hello.hello_spring.service;

import com.hello.hello_spring.repository.MemberRepository;

public class validateDuplicateNeneber {
	public MemberRepository membeRepository;

	public validateDuplicateNeneber(MemberRepository membeRepository) {
		this.membeRepository = membeRepository;
	}
}