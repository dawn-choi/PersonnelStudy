package hello.core.discount;

import ch.qos.logback.core.net.SyslogOutputStream;
import hello.core.member.Member;

public interface DiscountPolicy {
	int  discount(Member member, int price);
}
