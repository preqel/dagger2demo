package testjni.preqel.com.test2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;


import javax.inject.Inject;

import testjni.preqel.com.testdagger.R;

/**
 * Created by preqel on 2018/3/30.
 */
public class HttpActivity extends AppCompatActivity {

    @Inject
    @HttpActivityModule.MyScope
    @HttpActivityModule.Named("manager1")
    RetrofitManager retrofitManager;

    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);

        HttpActivityComponent httpActivityComponent = DaggerHttpActivityComponent.builder()
                .httpActivityModule(new HttpActivityModule(3, "www.baidu.com"))
                .build();
         httpActivityComponent.inject(this);

//        HttpsActivityComponent daggerHttpsActivityComponent = DaggerHttpsActivityComponent.builder()
//                .httpActivityComponent(httpActivityComponent)
//                .build();
//          daggerHttpsActivityComponent.inject(this);

        textView.setText(retrofitManager.getOkHttpClient().getCacheSize() + " is cachesize/" + retrofitManager.getOkHttpClient().getUrl());
        Toast.makeText(this, retrofitManager.hashCode() + "", Toast.LENGTH_SHORT).show();
    }

    private void normalInject() {
    }
}
