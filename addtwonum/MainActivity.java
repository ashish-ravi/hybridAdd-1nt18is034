package com.example.addtwonum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    Button addBtn;
    TextView sum;
    String TAG = "MainActivity";
    Intent intent;
    Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        intent = new Intent(this,MainActivity2.class);
        extras = new Bundle();
        String colorString = "red";

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        addBtn = findViewById(R.id.btn);
        sum = findViewById(R.id.res);
        Toast.makeText(getApplicationContext(), "onClick: invoked", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onClick: has been invoked ");
//        addBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//           public void onClick(View view){
//                int n1 = Integer.parseInt(num1.getText)
//            }
//        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int n3 = n1 + n2;
                sum.setText("Result is: "+n3);
                Log.i(TAG, "1st integer: "+n1);
                Log.i(TAG, "2nd Integer: "+n2);
                Log.i(TAG, "Result is: "+n3);

                intent.putExtra("num1",n1+"");
                intent.putExtra("num2",n2+"");
                intent.putExtra("num3",n3+"");

                extras.putString("color", colorString);

                intent.putExtras(extras);
                startActivity(intent);
            }
        });

    }
    protected void onStart(){
        super.onStart();
        Log.d("lifecycle","activity1 onStart Invoked");
        Toast.makeText(getApplicationContext(), "activity1 onStart: invoked", Toast.LENGTH_SHORT).show();
    }
    protected void onResume(){
        super.onResume();
        Log.d("lifecycle","activity1 onResume Invoked");
        Toast.makeText(getApplicationContext(), "activity1 onResume: invoked", Toast.LENGTH_SHORT).show();
    }
    protected void onStop(){
        super.onStop();
        Log.d("lifecycle","activity1 onStop Invoked");
        Toast.makeText(getApplicationContext(), "activity1 onStop: invoked", Toast.LENGTH_SHORT).show();
    }
    protected void onPause(){
        super.onPause();
        Log.d("lifecycle","activity1 onPause Invoked");
        Toast.makeText(getApplicationContext(), "activity1 onPause: invoked", Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d("lifecycle","activity1 onDestroy Invoked");
        Toast.makeText(getApplicationContext(), "activity1 onDestroy: invoked", Toast.LENGTH_SHORT).show();
    }
    protected void onRestart(){
        super.onRestart();
        Log.d("lifecycle","activity1 onRestart Invoked");
        Toast.makeText(getApplicationContext(), "activity1 onRestart: invoked", Toast.LENGTH_SHORT).show();
    }


}