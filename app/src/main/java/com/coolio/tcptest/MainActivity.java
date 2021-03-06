package com.coolio.tcptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onServerClicked(View view) {
        Intent intent = new Intent(this, ServerActivity.class);
        startActivity(intent);
    }

    public void onClientClicked(View view) {
        Intent intent = new Intent(this, ClientActivity.class);
        startActivity(intent);
    }
}
