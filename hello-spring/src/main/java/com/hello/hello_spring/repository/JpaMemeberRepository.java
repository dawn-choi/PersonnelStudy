package com.hello.hello_spring.repository;

import java.util.List;
import java.util.Optional;

import com.hello.hello_spring.domain.Member;

import jakarta.persistence.EntityManager;

public class JpaMemeberRepository implements MemberRepository{
		
	private final  EntityManager em;
	
	public JpaMemeberRepository(EntityManager em ) {
		this.em = em;
	}
	
	
	@Override
	public Member save(Member member) {
		// TODO Auto-generated method stub
		em.persist(member);
		return member;
	}

	@Override
	public Optional<Member> findById(Long id) {
		// TODO Auto-generated method stub
		Member member = em.find(Member.class, id);
		return Optional.ofNullable(member);
	}

	@Override
	public Optional<Member> findByName(String name) {
		// TODO Auto-generated method stub
		List<Member> result = em.createQuery("Select m from Member where m.name = :name", Member.class)
									.setParameter("name",name)
									.getResultList();
		return result.stream().findAny();
	}

	@Override
	public List<Member> findAll() {
		List<Member> result = em.createQuery("Select m from Member m" , Member.class)
								.getResultList();
		return result;
	}

}
