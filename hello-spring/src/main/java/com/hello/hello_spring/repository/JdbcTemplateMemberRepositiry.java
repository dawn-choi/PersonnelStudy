package com.hello.hello_spring.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.hello.hello_spring.domain.Member;

public class JdbcTemplateMemberRepositiry implements MemberRepository{
	
	private final JdbcTemplate jdbcTemplate;
	
	public JdbcTemplateMemberRepositiry(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public Member save(Member member) {
		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
		jdbcInsert.withTableName("member").usingGeneratedKeyColumns("id");
		
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("name",member.getName());
		
		Number key = jdbcInsert.executeAndReturnKey(new MapSqlParameterSource(parameters));
		member.setId(key.longValue());
		return null;
	}

	@Override
	public Optional<Member> findById(Long id) {
		List<Member> result =  jdbcTemplate.query("Select * from member where id=?",memberRoadMapper(), id);
		return result.stream().findAny();
	}

	@Override
	public Optional<Member> findByName(String name) {
		List<Member> result =  jdbcTemplate.query("Select * from member where name=?",memberRoadMapper(),name);
		return result.stream().findAny();
	}

	@Override
	public List<Member> findAll() {
		return jdbcTemplate.query("Select * from member",memberRoadMapper());
	}
	
	private RowMapper<Member> memberRoadMapper(){
		return new RowMapper<Member>() {
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException{
				Member member = new Member();
				member.setId(rs.getLong("ID"));
				member.setName(rs.getString("name"));
				return member;
			};
		};
	}
	
		

}
