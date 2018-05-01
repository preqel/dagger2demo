package testjni.preqel.com.testsubcomponent;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;
import testjni.preqel.com.testother.ThemeDay;
import testjni.preqel.com.testother.ThemeNight;

/**
 * Created by preqel on 2018/4/5.
 */
@Module
public class ManModule {

    @ThemeDay
    @Provides
    @Singleton
    Man providerMan(){
        return new Man();
    }

    @ThemeNight
    @Provides
    @Singleton
    Man providerNightMan() {
        Log.d("TAG", "provider theme night");
        return new Man();
    }



}
