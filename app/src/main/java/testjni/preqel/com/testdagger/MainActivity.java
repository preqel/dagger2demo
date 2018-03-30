package testjni.preqel.com.testdagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

//    @Inject
//    Product product;

    @Inject
    Factory factory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.create().inject(this);
        Toast.makeText(this,factory.person.hashCode()+" is the result",Toast.LENGTH_SHORT).show();
    }
}
