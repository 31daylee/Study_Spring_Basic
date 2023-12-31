package hello.hellospring;

import aop.TimeTraceAop;
import hello.hellospring.repository.JpaMemberRepository;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
   /* private EntityManager em;

    // em 선언 후 생성자 만듦
    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }*/

    @Bean
    public MemberService memberService(){

        return new MemberService(memberRepository);
    }
 /*   @Bean
    public MemberRepository memberRepository(){

      *//*  //return new MemoryMemberRepository();
        return new JdbcTempMemberRepository(dataSource);
        return new JpaMemberRepository(em);*//*


    }*/
}
