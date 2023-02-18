package com.duyhq.lab4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSendStringButton(View view) {
        Intent intent = new Intent(this, MainActivity2.class);

        intent.putExtra("string", "A string");

        startActivity(intent);

        finish();
    }

    public void onClickSendNumberButton(View view) {
        Intent intent = new Intent(this, MainActivity2.class);

        intent.putExtra("number", 100);

        startActivity(intent);

        finish();
    }

    public void onClickSendArrayButton(View view) {
        Intent intent = new Intent(this, MainActivity2.class);

        intent.putExtra("numberArray", new int[]{1, 2, 3});

        startActivity(intent);

        finish();
    }

    public void onClickSendBundleButton(View view) {
        Intent intent = new Intent(this, MainActivity2.class);

        Bundle b = new Bundle();
        b.putString("bundleString", "This is bundle string");
        intent.putExtras(b);

        startActivity(intent);

        finish();
    }
}