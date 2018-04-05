package testjni.preqel.com.testsubcomponent;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by preqel on 2018/4/5.
 */
@Singleton
@Component(dependencies = PoorComponent.class,modules= ManModule.class)
public abstract class UserComponent {

//    private static UserComponent mComponent;
//
//    public static UserComponent getInstance() {
//        if (mComponent == null) {
//            synchronized (UserComponent.class) {
//                if (mComponent == null) {
//                    mComponent = DaggerUserComponent.create();
//                }
//            }
//        }
//
//        return mComponent;
//    }
//
//    public abstract void inject(MainActivity activity);
//
//    public abstract void inject(SecondActivity activity);
}
