package testjni.preqel.com.testdagger;


import dagger.Component;
import dagger.Module;

/**
 * Created by preqel on 2018/3/28.
 */
@Component
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);
}
