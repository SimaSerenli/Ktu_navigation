package com.example.ktu_navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.support.v4.app.INotificationSideChannel;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button GirisButonu;
    public void init() {
        GirisButonu = findViewById(R.id.GirisButonu);
    }
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        GirisButonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,Anasayfa.class);

                startActivity(i);
            }

        });
    }
}
