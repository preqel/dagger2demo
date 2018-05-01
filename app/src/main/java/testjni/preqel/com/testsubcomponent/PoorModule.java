package testjni.preqel.com.testsubcomponent;

import android.util.Log;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import testjni.preqel.com.test2.HttpActivityModule;

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
    @Named("super car")
    public Car providerCar2(){
        Log.d("TAG","this is super car");
        return new Car();
    }

    @Provides
    public Bike providerBike(){
        return new Bike();
    }


}


