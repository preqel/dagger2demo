package testjni.preqel.com.testdagger;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by preqel on 2018/3/28.
 */

public class Person {
    @Inject
    public Person(){
        Log.i("dagger","person create!!!");
    }
}
