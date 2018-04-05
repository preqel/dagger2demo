package testjni.preqel.com.test2;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Provides;
import testjni.preqel.com.testdagger.MainModule;

/**
 * Created by preqel on 2018/3/30.
 */
@HttpActivityModule.MyScope
@Component(modules = HttpActivityModule.class)
public interface HttpActivityComponent {
    void inject(HttpActivity httpActivity);
}
