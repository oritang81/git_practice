package com.example.mtklogtriger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("TAG", "Git 2");
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener(

        ) {
            @Override
            public void onClick(View v) {
                ComponentName compName = new ComponentName("com.mediatek.mtklogger","com.mediatek.mtklogger.MainActivity");
                Intent intent23 = new Intent(Intent.ACTION_MAIN);
                intent23.addCategory(Intent.CATEGORY_LAUNCHER);
                intent23.setComponent(compName);
                startActivity(intent23);
            }
        });
    }
}
