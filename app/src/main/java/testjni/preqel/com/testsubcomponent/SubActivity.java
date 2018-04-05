package testjni.preqel.com.testsubcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import javax.inject.Inject;

import testjni.preqel.com.testdagger.R;

/**
 * Created by preqel on 2018/4/5.
 */
public class SubActivity extends Activity {

    @Inject
    Bike bike;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main
        );
        PoorComponent component = DaggerPoorComponent.create();
        DaggerManComponent.builder().poorComponent(component).build().inject(this);

        TextView mtextview = findViewById(R.id.textview);
        mtextview.setText("hello subactivity"+ bike.hashCode());

    }


}
