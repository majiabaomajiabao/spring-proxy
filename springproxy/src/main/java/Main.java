import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

/**
 * @author majiabao on 2017/12/27.
 */
public class Main {
    public static void main(String[] args) {
        Pointcut pc = new SimpleStaticPointcut();
        Advice advice = new SimpleAdvice();
        Advisor advisor = new DefaultPointcutAdvisor(pc, advice);

        /**
         * jdk 只代理接口中的方法
         */
        ProxyFactory pf = new ProxyFactory();
        BeanTwo two = new BeanTwo();
        pf.addAdvisor(advisor);
        pf.setTarget(two);
        pf.setInterfaces(BeanInterface.class);
        //此处只能造型为接口，因为是接口实现的
        BeanInterface proxyTwo = (BeanInterface) pf.getProxy();
        proxyTwo.foo();
        proxyTwo.bar();

        /**
         * cglib
         */
        pf = new ProxyFactory();
        BeanOne one = new BeanOne();
        pf.addAdvisor(advisor);
        pf.setTarget(one);
        //此处可以造型为代理类，因为是继承实现的
        BeanOne proxyOne = (BeanOne) pf.getProxy();
        proxyOne.foo();
        proxyOne.bar();


    }
}
