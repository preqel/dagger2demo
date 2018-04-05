package testjni.preqel.com.testsubcomponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by preqel on 2018/4/5.
 */
@Module
public class BikeModule {

    @Provides
    @Singleton
    Bike providerBike(){
        return new Bike();
    }
}
