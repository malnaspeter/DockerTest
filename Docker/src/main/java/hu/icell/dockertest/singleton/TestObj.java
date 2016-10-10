package hu.icell.dockertest.singleton;

/**
 * Created by User on 2016. 10. 10..
 */

public class TestObj implements TestObjImpl {

    @Override
    public String testMethod() {
        return "test";
    }
}
