package testjni.preqel.com.testbind;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by preqel on 2018/4/4.
 */
@Module
public abstract  class BindActivityModule {

//    private String bind;
//    @Provides
//    public XXInterfaceImp providerXXInterface(){
//        return new XXInterfaceImp();
//    }
    @Binds
    public abstract  XXInterface bindXXInterface(XXInterfaceImp xxInterfaceImp);

}
