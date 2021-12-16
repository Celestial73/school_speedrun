package com.example.school_speedrun;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout crlyout = new ConstraintLayout(this);
        TextView txt = new TextView(this);
        Button switch1 = new Button(this);
        txt.setText("132");
        crlyout.addView(txt);
        crlyout.addView(switch1);

        txt.setId(View.generateViewId());
        switch1.setId(View.generateViewId());

        ConstraintLayout mainLayout = findViewById(R.id.main_layout);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(crlyout);
        constraintSet.connect(txt.getId(),ConstraintSet.TOP,switch1.getId(),ConstraintSet.BOTTOM,0);

        constraintSet.applyTo(crlyout);

        mainLayout.addView(crlyout);


        Button btn = findViewById(R.id.switchBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchAct();
            }
        });

    }

        private void switchAct(){
            Intent switchActivityIntent = new Intent(this, TestActivity.class);
            startActivity(switchActivityIntent);
    }
}