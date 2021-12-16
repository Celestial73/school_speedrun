package com.example.school_speedrun;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import java.util.ArrayList;
import java.util.List;

public class TestActivity extends AppCompatActivity {
    List<Question> questionList;
    TextView wasd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);
        wasd = (TextView) findViewById(R.id.wasd);
        TextView txt = findViewById(R.id.textView);
        ConstraintLayout testLayout = findViewById(R.id.test_layout);

        questionList = new ArrayList<Question>();

        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(testLayout);
        constraintSet.connect(wasd.getId(),ConstraintSet.TOP,txt.getId(),ConstraintSet.BOTTOM,0);
        constraintSet.applyTo(testLayout);

        List<String> variants = new ArrayList<String>();
        variants.add("Brazil");
        variants.add("Brad Pitt");
        variants.add("Dream speedrun");
        List<String> correctAns = new ArrayList<String>();
        correctAns.add("Brad Pitt");
        correctAns.add("Brazil");
        questionList.add(new Question("Niggers?", variants, correctAns));

        Test test = new Test(questionList, this, testLayout);

    }

}
