package hello.core.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPoilicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

@Component
public class OrderServiceImpl implements OrderService{

	private MemberRepository memberRepository; 
//	private DiscountPolicy discountPolicy = new FixDiscountPolicy();
	private DiscountPolicy discountPolicy;
	
	@Autowired
	public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy )
	{
//		System.out.println(memberRepository);
//		System.out.println(discountPolicy);
		this.memberRepository = memberRepository;
		this.discountPolicy = discountPolicy;
		
	}

	
	@Override
	public Order createOrder(Long memberId, String itemname, int itemPrice) {
		// TODO Auto-generated method stub
		Member member = memberRepository.findByID(memberId);
		int discountPrice = discountPolicy.discount(member, itemPrice);
		
		return new Order(memberId ,itemname,itemPrice,discountPrice);
		
	}

	
}