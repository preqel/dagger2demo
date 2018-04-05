package testjni.preqel.com.testsubcomponent;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by preqel on 2018/4/5.
 */
@Singleton
@Component(dependencies = PoorComponent.class,modules= ManModule.class)
public interface ManComponent {
    void inject(SubActivity subActivity);
}
