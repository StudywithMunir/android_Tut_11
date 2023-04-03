package com.example.android_tut_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializer();
        click.setOnClickListener(this);
    }

    public void initializer(){
        click=(Button) findViewById(R.id.b1);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.b1:

                click.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this,"Nothing happened", Toast.LENGTH_LONG).show();
                    }
                });

        }

    }
}