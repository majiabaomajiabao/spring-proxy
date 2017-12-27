import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author majiabao on 2017/12/27.
 */
public class SimpleAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("SimpleAdvice.Invoking " + invocation.getMethod().getName());
        Object retVal = invocation.proceed();
        System.out.println("SimpleAdvice.Done");
        return retVal;
    }
}
