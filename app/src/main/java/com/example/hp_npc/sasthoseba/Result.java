package com.example.hp_npc.sasthoseba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle bundle = getIntent().getExtras();

        textView = findViewById(R.id.showInfo);
        imageView = findViewById(R.id.resultImage);

        textView.setText(bundle.get("info").toString());
        imageView.setImageResource(bundle.getInt("image"));
    }
}
