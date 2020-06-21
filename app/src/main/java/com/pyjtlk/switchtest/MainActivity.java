package com.pyjtlk.switchtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.pyjtlk.widgetlib.Switch;

public class MainActivity extends AppCompatActivity {

    private Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch = findViewById(R.id.MySwitch);

        aSwitch.setOnStateChangeListener(new Switch.OnStateChangeListener() {
            @Override
            public void onStateChanged(View view, boolean switchOn) {
                String result;
                if(switchOn){
                    result = "打开";
                }else{
                    result = "关闭";
                }
                Toast.makeText(MainActivity.this,result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
