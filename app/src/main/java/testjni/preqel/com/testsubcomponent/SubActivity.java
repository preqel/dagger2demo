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

    @Inject
    Man man;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main
        );
        //用组件依赖的方式完成注入
        /*
        PoorComponent component = DaggerPoorComponent.create();
        DaggerManComponent.builder().poorComponent(component).build().inject(this);
        */
        //用子模块继承的方式完成注入
        PoorComponent component = DaggerPoorComponent.create();
        ManComponent manComponent = component.sonComponent().build();
        manComponent.inject(this);


        TextView mtextview = findViewById(R.id.textview);
        mtextview.setText("hello subactivity"+ bike.hashCode()+ " & "+ man.hashCode());
    }
}
