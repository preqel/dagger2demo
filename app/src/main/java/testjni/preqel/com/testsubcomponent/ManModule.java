package testjni.preqel.com.testsubcomponent;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by preqel on 2018/4/5.
 */
@Module
public class ManModule {

    @Provides
    @Singleton
    Man providerMan(){
        return new Man();
    }

}
