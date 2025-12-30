package hello.core;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;


//ComponentScan 은 기본적으로는 Configuration 까지 다 조회한다. 
//
@Configuration
@ComponentScan(
		basePackages =  "hello.core.member",// 컴포넌트 스캔할 팩키지 지정한다 이후 하위 패키지까지 
											//		모두 스캔한. 속도 문제, 없으면 모든 클래스 파일을 다본다 
		 									// 지정하지 않을 경우 @ComponentScan  이 붙은 설정 정보 클래스의 패키지가 시작위치가 된다
		//권장하는 방법 = 패키지 위치를 지정하지 않고 설정정보 클스의 위치를 프로젝트 최상단에 두는 것이다. 
		// 스프링부트는 애초에 CoreApplication (자동생성) 파일에 @SpringBootApplication 가 붙어있는데
		// 이 어노테이션 안에 ComponenetScan 애노테이션이 붙어있어서 알아서 돌아간다.
		
		excludeFilters = @Filter(type = FilterType.ANNOTATION,classes = Configuration.class)
		
		)

public class AutoConfig {

}
