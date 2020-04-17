package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView metuser,metpoints;
    ImageView metreuse,metrecycle,metmap;
    ImageButton metbt_home,metbt_reward,metbt_rank,metbt_me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        metuser = findViewById(R.id.etuser);
        metpoints = findViewById(R.id.etpoints);
        metreuse = findViewById(R.id.etreuse);
        metrecycle = findViewById(R.id.etrecycle);
        metmap = findViewById(R.id.etmap);
        metbt_home = findViewById(R.id.etbt_home);
        metbt_reward = findViewById(R.id.etbt_reward);
        metbt_rank = findViewById(R.id.etbt_rank);
        metbt_me = findViewById(R.id.etbt_me);


        metreuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Reusable.class));
            }
        });

        metrecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Recyclable.class));
            }
        });

        metmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Map.class));
            }
        });

        metbt_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        metbt_reward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Reward.class));
            }
        });

        metbt_rank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Rank.class));
            }
        });

        metbt_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Me.class));
            }
        });
    }
}
