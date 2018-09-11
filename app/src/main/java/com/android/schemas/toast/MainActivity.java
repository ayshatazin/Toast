package com.android.schemas.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater inflater = getLayoutInflater();
                View CustomView = inflater.inflate(R.layout.toast, (ViewGroup) findViewById(R.id.toast));
                Toast toast = new Toast(MainActivity.this);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP, 30, 120);
                toast.setView(CustomView);
                toast.show();

            }
        });

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater inflater = getLayoutInflater();
                View CustomView = inflater.inflate(R.layout.toast1, (ViewGroup) findViewById(R.id.toast1));
                Toast toast1 = new Toast(MainActivity.this);
                toast1.setDuration(Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.TOP, 30, 120);
                toast1.setView(CustomView);
                toast1.show();

            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater inflater = getLayoutInflater();
                View CustomView = inflater.inflate(R.layout.toast2, (ViewGroup) findViewById(R.id.toast2));
                Toast toast2 = new Toast(MainActivity.this);
                toast2.setDuration(Toast.LENGTH_SHORT);
                toast2.setGravity(Gravity.TOP, 30, 120);
                toast2.setView(CustomView);
                toast2.show();

            }
        });

    }
}
