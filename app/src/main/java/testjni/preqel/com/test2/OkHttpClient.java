package testjni.preqel.com.test2;

/**
 * Created by preqel on 2018/3/30.
 */

public class OkHttpClient {
    private int cacheSize;

    public OkHttpClient(   ) {

    }

    public int getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(int cacheSize) {
        this.cacheSize = cacheSize;
    }
}
