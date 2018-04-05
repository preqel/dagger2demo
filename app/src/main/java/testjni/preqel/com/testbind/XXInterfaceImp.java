package testjni.preqel.com.testbind;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by preqel on 2018/4/4.
 */
public class XXInterfaceImp implements XXInterface {

    @Inject
    public XXInterfaceImp() {
    }

    @Override
    public void onClick() {
        Log.d("tag", "onclick");
    }
}
