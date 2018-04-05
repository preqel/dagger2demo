package testjni.preqel.com.testsubcomponent;

import dagger.Module;
import dagger.Provides;

/**
 * Created by preqel on 2018/4/5.
 */
@Module(subcomponents = SonComponent.class)
public class CarModule {

    @Provides
    static Car provideCar() {
        return new Car();
    }
}
