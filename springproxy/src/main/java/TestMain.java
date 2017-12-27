/**
 * @author majiabao on 2017/12/27.
 */
public class TestMain {
    public static void main(String[] args) {
        BeanInterface beanInterface = new BeanTwo();
        System.out.println(beanInterface.getClass().isInterface());
        System.out.println(BeanInterface.class.isInterface());
    }
}
