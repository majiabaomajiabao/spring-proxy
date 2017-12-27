/**
 * @author majiabao on 2017/12/27.
 */
public class BeanTwo implements BeanInterface {
    @Override
    public void foo() {
        System.out.println("BeanTwo.foo");
    }

    @Override
    public void bar() {
        System.out.println("BeanTwo.bar");
    }
}
