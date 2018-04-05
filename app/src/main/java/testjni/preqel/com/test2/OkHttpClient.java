package testjni.preqel.com.test2;

/**
 * Created by preqel on 2018/3/30.
 */

public class OkHttpClient {

    private int cacheSize;

    private String url;


    public OkHttpClient(   ) {

    }

    public int getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
