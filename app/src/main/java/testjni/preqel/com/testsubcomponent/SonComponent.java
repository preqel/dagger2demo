package testjni.preqel.com.testsubcomponent;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by preqel on 2018/4/5.
 */

@Subcomponent(modules = BikeModule.class)
public interface SonComponent {

    void inject(Son son);

    @Subcomponent.Builder
    interface  Builder{
        SonComponent Builder();
    }
}
