package testjni.preqel.com.test2;


import dagger.Module;
import dagger.Provides;

/**
 * Created by preqel on 2018/3/30.
 */

@Module
public class HttpActivityModule {

    private int cachesize;

    public HttpActivityModule(int cachesize) {
        this.cachesize = cachesize;
    }

    @Provides
    OkHttpClient providerOkHttpClient() {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setCacheSize(cachesize);
        return okHttpClient;
    }

    @Provides
    RetrofitManager providerRetrofitManager(OkHttpClient okHttpClient) {
        return new RetrofitManager(okHttpClient);
    }

    ;
}
