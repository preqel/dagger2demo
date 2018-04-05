package testjni.preqel.com.test2;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;
import javax.inject.Scope;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import testjni.preqel.com.testbind.XXInterface;
import testjni.preqel.com.testbind.XXInterfaceImp;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by preqel on 2018/3/30.
 */

@Module
public class HttpActivityModule {

    private int cachesize;

    private String url;

    public HttpActivityModule(int cachesize,String url) {
        this.cachesize = cachesize;
        this.url = url;
    }

    @Provides
    OkHttpClient providerOkHttpClient() {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setCacheSize(cachesize);
        okHttpClient.setUrl(url);
        return okHttpClient;
    }

    @Provides
    @MyScope
    @Named("manager1")
    RetrofitManager providerRetrofitManager(OkHttpClient okHttpClient) {
        return new RetrofitManager(okHttpClient);
    };

    @Named("manager2")
    @Provides
    RetrofitManager providerRetrofitManager2(OkHttpClient okHttpClient){
        return null;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Qualifier
    @Documented
    @Retention(RUNTIME)
    public @interface Named {
        String value() default "";
    }

    @Documented
    @Retention(RUNTIME)
    @Scope
    public @interface MyScope {}


}
