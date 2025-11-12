package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;


public class MemberApp {
	
	public static void main(String[] ars) {
		AppConfig appConfig = new AppConfig();
		MemberService memberService = appConfig.memberService();
		Member member = new Member(1L,"memberA",Grade.VIP);
		memberService.join(member);
		
		Member findMemeber = memberService.findMember(1L);
		
		System.out.println("new member = " +  member);
		System.out.println("find member = " +findMemeber);
		
		System.out.println("new member = " +  member.getName());
		System.out.println("find member = " +findMemeber.getName());
		
	}
}
