package testjni.preqel.com.testsubcomponent;

import dagger.Component;

/**
 * Created by preqel on 2018/4/5.
 */
@Component(modules = PoorModule.class)
public interface PoorComponent {
    Bike getBike();
}
