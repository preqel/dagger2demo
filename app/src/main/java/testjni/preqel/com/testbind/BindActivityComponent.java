package testjni.preqel.com.testbind;

import javax.inject.Inject;

import dagger.Component;

/**
 * Created by preqel on 2018/4/4.
 */
@Component(modules = BindActivityModule.class)
public interface BindActivityComponent {
    void inject(BindActivity bindActivity);
}
