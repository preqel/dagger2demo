package testjni.preqel.com.testdagger;

import dagger.Module;
import dagger.Provides;

/**
 * Created by preqel on 2018/3/28.
 */
@Module
public class MainModule {

    @Provides
        // 关键字，标明该方法提供依赖对象
    Person providerPerson(){
        //提供Person对象
        return new Person();
    }
}
