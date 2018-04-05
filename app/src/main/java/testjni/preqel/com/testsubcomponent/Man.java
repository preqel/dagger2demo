package testjni.preqel.com.testsubcomponent;

import javax.inject.Inject;

/**
 * Created by preqel on 2018/4/5.
 */

public class Man {
    @Inject
    Car car;

    public void goWork(){
        car.go();
    }

}
