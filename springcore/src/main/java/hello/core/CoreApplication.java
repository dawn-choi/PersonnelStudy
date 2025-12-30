package hello.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
		
//		의존관계 주입방법 
//		생성자 주입
//		수정자 주입
//		필드주입
//		일반 메서드 주입
	}

}


