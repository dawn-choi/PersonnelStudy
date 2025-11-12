package hello.core.member;

public class MemberServiceImpl implements MemberService {

	private final MemberRepository memberRepository;
	// 왜 굳이 인터페이스로 선언하는가? 상속클래스로 선언해도 같지 않은가>
	// -> 추후 memberRepository class 에 다른 구현체(상속클래스) 를 담기에도 편하고
	// 스프링 기반이라면 의존성 주입은 인터페이스 기반으로 실행 되기 때문에 
	// 상속클래스 대신 인터페이스만 빈에 올라와있으니 인터페이스로 호출한다
	//	private final MemoryMemberRepository memberRepository = new MemoryMemberRepository();
	
	public MemberServiceImpl(MemberRepository memberRepository ) {
		this.memberRepository = memberRepository;
	}
	
	@Override
	public void join(Member member) {
		memberRepository.save(member);
	}

	@Override
	public Member findMember(Long memberId) {
	
		return memberRepository.findByID(memberId);
	}
	
}
