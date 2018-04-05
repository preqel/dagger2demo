package testjni.preqel.com.testsubcomponent;

import dagger.Module;
import dagger.Provides;

/**
 * Created by preqel on 2018/4/5.
 */

@Module
public class PoorModule {
    @Provides
    public Car providerCar() {
        return new Car();
    }
    @Provides
    public Bike providerBike(){
        return new Bike();
    }


}


