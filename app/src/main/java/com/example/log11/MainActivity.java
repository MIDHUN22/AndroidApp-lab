package com.example.log11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText username,password;
        Button login;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.et1);
        password=findViewById(R.id.et2);
        login=findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Objects.equals(username.getText().toString(),"admin")&&Objects.equals(password.getText().toString(),"admin"))
                {
                    Toast.makeText(MainActivity.this, "authentication successfully", Toast.LENGTH_LONG).show();
                }else
                {
                    Toast.makeText(MainActivity.this, "failed", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}