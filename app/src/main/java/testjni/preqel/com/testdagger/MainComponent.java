package testjni.preqel.com.testdagger;

import dagger.Component;

/**
 * Created by preqel on 2018/3/28.
 */
@Component(modules = MainModule.class)
public interface MainComponent {
    //定义注入的方法
    void inject(MainActivity activity);
}
