package com.example.addtwonum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Intent intent;
    String TAG = "MainActivity2";
    TextView num1;
    TextView num2;
    TextView num3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
        num3 = findViewById(R.id.number3);

        intent = getIntent();
        int n1 = Integer.parseInt(intent.getStringExtra("num1"));
        int n2 = Integer.parseInt(intent.getStringExtra("num2"));
        int n3 = Integer.parseInt(intent.getStringExtra("num3"));
        Log.i(TAG, "1st integer: "+n1);
        Log.i(TAG, "2nd Integer: "+n2);
        Log.i(TAG, "Result is: "+n3);
        Bundle extras = intent.getExtras();
        String color = extras.getString("color","blue");
        Log.i(TAG,"Colour is: "+color);

        num1.setText("number 1 is: "+n1);
        num2.setText("number 2 is: "+n2);
        num3.setText("sum is: "+n3);
    }
    protected void onStart(){
        super.onStart();
        Log.d("lifecycle","activity2 onStart Invoked");
        Toast.makeText(getApplicationContext(), "activity2 onStart: invoked", Toast.LENGTH_SHORT).show();
    }
    protected void onResume(){
        super.onResume();
        Log.d("lifecycle","activity2 onResume Invoked");
        Toast.makeText(getApplicationContext(), "activity2 onResume: invoked", Toast.LENGTH_SHORT).show();
    }
    protected void onStop(){
        super.onStop();
        Log.d("lifecycle","activity2 onStop Invoked");
        Toast.makeText(getApplicationContext(), "activity2 onStop: invoked", Toast.LENGTH_SHORT).show();
    }
    protected void onPause(){
        super.onPause();
        Log.d("lifecycle","activity2 onPause Invoked");
        Toast.makeText(getApplicationContext(), "activity2 onPause: invoked", Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d("lifecycle","activity2 onDestroy Invoked");
        Toast.makeText(getApplicationContext(), "activity2 onDestroy: invoked", Toast.LENGTH_SHORT).show();
    }
    protected void onRestart(){
        super.onRestart();
        Log.d("lifecycle","activity2 onRestart Invoked");
        Toast.makeText(getApplicationContext(), "activity2 onRestart: invoked", Toast.LENGTH_SHORT).show();
    }
}