package testjni.preqel.com.test2;


/**
 * Created by preqel on 2018/3/30.
 */

public class RetrofitManager {

    private OkHttpClient okHttpClient;

    public RetrofitManager(OkHttpClient okHttpClient){
        this.okHttpClient  = okHttpClient;
    }

    public OkHttpClient getOkHttpClient(){
        return okHttpClient;
    }

}

