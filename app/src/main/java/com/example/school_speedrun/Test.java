package com.example.school_speedrun;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private Context context;
    private List<Question> questionList;
    private ConstraintLayout testLayout;


    public Test(List<Question> questionList, Context context, ConstraintLayout testLayout) {
        this.questionList = questionList;
        this.context = context;
        this.testLayout = testLayout;
    }

    public void runTest(){
        byte questionAmount = (byte) questionList.size();
        for (byte i = 0; i<questionAmount; i++){
            runQuestion(i);
        }
    }

    private void runQuestion(short questionNumber){
        Question question = questionList.get(questionNumber);
        switch (question.getQuestionType()){
            case 1:

            case 2:
                createMultipleAnswers(question);
                System.out.println("123");
            case 3:

        }
    }
    public ConstraintLayout createMultipleAnswers(Question question){
        byte variantAmount = (byte) question.getVariants().size();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        CheckBox cb =new CheckBox(context);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        List<CheckBox> checkBoxes = new ArrayList<CheckBox>();

        constraintLayout.setMaxWidth(200);

        TextView txt = new TextView(context);
        txt.setText("1232543");
        constraintLayout.addView(txt);
        for (byte i =0; i<variantAmount; i++){
            cb = new CheckBox(context);
            cb.setId(i);
            cb.setText(question.getVariants().get(i));
            checkBoxes.add(cb);
            constraintLayout.addView(cb);
            if(i!=0) {
                constraintSet.connect(i, ConstraintSet.TOP, i-1, ConstraintSet.BOTTOM);
                constraintSet.applyTo(constraintLayout);
            }
            constraintLayout.getParent();
        }
        testLayout.addView(constraintLayout);;
        ConstraintSet constraintSet1 = new ConstraintSet();
        constraintSet1.clone(testLayout);
        constraintSet.connect(R.id.wasd, ConstraintSet.RIGHT, R.id.test_layout, ConstraintSet.RIGHT);
        constraintSet1.applyTo(testLayout);



        return constraintLayout;
    }



}
