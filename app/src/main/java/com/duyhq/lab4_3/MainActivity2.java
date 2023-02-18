package com.duyhq.lab4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        String s = intent.getStringExtra("string");
        int n = intent.getIntExtra("number", 0);
        int[] arr = intent.getIntArrayExtra("numberArray");
        Bundle b = intent.getExtras();

        if (s != null) {
            TextView tv = findViewById(R.id.string_tv);
            tv.setText(s);
        }

        if (true) {
            TextView tv = findViewById(R.id.number_tv);
            tv.setText(Integer.toString(n));
        }


        if (arr != null) {
            TextView tv = findViewById(R.id.arr_tv);
            String str = "";
            for (int x: arr) {
                str += x + " ";
            }
            tv.setText(str);
        }

        if (b != null) {
            TextView tv = findViewById(R.id.bundle);

            tv.setText(b.getString("bundleString"));
        } else {
            Log.i("Null", "null");
        }
    }
}