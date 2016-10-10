package hu.icell.dockertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import hu.icell.dockertest.singleton.TestObj;

public class MainActivity extends AppCompatActivity {

    @Inject
    TestObj testObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((DockerApplication)getApplication()).getComponenet().inject(this);

        TextView textView = (TextView) findViewById(R.id.textview);
        textView.setText(testObj.testMethod());
    }
}
