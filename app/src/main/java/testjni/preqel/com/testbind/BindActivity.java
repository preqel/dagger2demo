package testjni.preqel.com.testbind;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import java.nio.channels.AcceptPendingException;

import javax.inject.Inject;

import testjni.preqel.com.testdagger.R;

/**
 * Created by preqel on 2018/4/4.
 */

public class BindActivity extends Activity {

     @Inject
    XXInterfaceImp xxInterface;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main
        );
//        DaggerBindActivityComponent.builder().bindActivityModule(new BindActivityModule()).build().inject(this);
        TextView textView = findViewById(R.id.textview);
        if( xxInterface.hashCode() != 0){
         textView.setText(xxInterface.hashCode()+"");
        }else
        textView.setText("hello bind");


    }
}
