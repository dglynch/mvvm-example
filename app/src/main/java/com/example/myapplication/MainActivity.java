package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MyViewModel myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        findViewById(R.id.btn_click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myViewModel.pokeFlag();
                Toast.makeText(MainActivity.this, "Flag is: " + myViewModel.getFlag(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
