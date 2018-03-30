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

//    @Inject
//    OkHttpClient okHttpClient;

    @Inject
            RetrofitManager retrofitManager;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);
        textView.setText("httpactivity");
        DaggerHttpActivityComponent.builder().httpActivityModule(new HttpActivityModule(3)).build().inject(this);
//        DaggerHttpActivityComponent.create().inject(this);
        Toast.makeText(this, retrofitManager.hashCode() + "", Toast.LENGTH_SHORT).show();
    }
}
