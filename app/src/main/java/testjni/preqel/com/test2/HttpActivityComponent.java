package testjni.preqel.com.test2;

import dagger.Component;
import testjni.preqel.com.testdagger.MainModule;

/**
 * Created by preqel on 2018/3/30.
 */

@Component(modules = HttpActivityModule.class)
public interface HttpActivityComponent {

    void inject(HttpActivity httpActivity);
}
