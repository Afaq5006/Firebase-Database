package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn_SignUp_Now);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, SignUp.class);
                startActivity(intent);
                Toast toast=Toast.makeText(getApplicationContext(),"Please Sign In or SignUp", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM| Gravity.CENTER_HORIZONTAL,0,0);
                toast.show();
            }
        });
    }
}