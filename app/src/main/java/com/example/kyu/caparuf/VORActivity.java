package com.example.kyu.caparuf;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class VORActivity extends AppCompatActivity {
Button quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vor);

               quiz = (Button) findViewById(R.id.quizVor);

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quizIntent = new Intent(VORActivity.this, vorQuizzActivity.class);

                startActivity(quizIntent);
            }
        });
    }
}
