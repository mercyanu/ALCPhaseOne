package com.example.alcphaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.buttonB);
        b1.setOnClickListener(this);
        Button b2 = findViewById(R.id.buttonC);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch(v.getId()){
            case R.id.buttonB:
                i = new Intent(MainActivity.this, AboutAlc.class);
                startActivity(i);
                break;
            case R.id.buttonC:
                i = new Intent(MainActivity.this, MyProfile.class);
                startActivity(i);
                break;
            default:
        }
    }
}
