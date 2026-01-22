package co.study.firstSpring;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.activation.DataSource;

@SpringBootTest
public class DbConnectionTest {
	@Autowired
	javax.sql.DataSource dataSource;
	
	@Test
	void connect() throws Exception{
		System.out.println(dataSource.getConnection());
	}
}
