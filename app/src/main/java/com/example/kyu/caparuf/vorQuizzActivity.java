package com.example.kyu.caparuf;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class vorQuizzActivity extends AppCompatActivity {
    EditText answer1, answer2, answer3, answer4, answer5, answer6, answer7;
    RadioButton answer21, answer22, answer23, answer24, answer41, answer42, answer43, answer44;
    CheckBox answer31, answer32, answer33, answer34, answer35;
    Button result;
    TextView text31, text32, text33, text34, text35, endStatement;
    int score, bestScore, percentageResult;
    String content;
    RadioGroup radioGroup, radioGroup2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vor_quizz);
        answer1 = (EditText) findViewById(R.id.Answer11);
        answer2 = (EditText) findViewById(R.id.Answer12);
        answer3 = (EditText) findViewById(R.id.Answer13);
        answer4 = (EditText) findViewById(R.id.Answer14);
        answer5 = (EditText) findViewById(R.id.Answer15);
        answer6 = (EditText) findViewById(R.id.Answer16);
        answer7 = (EditText) findViewById(R.id.Answer17);
        answer21 = (RadioButton) findViewById(R.id.Answer21);
        answer22 = (RadioButton) findViewById(R.id.Answer22);
        answer23 = (RadioButton) findViewById(R.id.Answer23);
        answer24 = (RadioButton) findViewById(R.id.Answer24);
        radioGroup = (RadioGroup) findViewById(R.id.radio);
        radioGroup2 = (RadioGroup) findViewById(R.id.radio2);
        answer31 = (CheckBox) findViewById(R.id.Answer31);
        answer32 = (CheckBox) findViewById(R.id.Answer32);
        answer33 = (CheckBox) findViewById(R.id.Answer33);
        answer34 = (CheckBox) findViewById(R.id.Answer34);
        answer35 = (CheckBox) findViewById(R.id.Answer35);
        text31 = (TextView) findViewById(R.id.Text31);
        text32 = (TextView) findViewById(R.id.Text32);
        text33 = (TextView) findViewById(R.id.Text33);
        text34 = (TextView) findViewById(R.id.Text34);
        text35 = (TextView) findViewById(R.id.Text35);
        answer41 = (RadioButton) findViewById(R.id.Answer41);
        answer42 = (RadioButton) findViewById(R.id.Answer42);
        answer43 = (RadioButton) findViewById(R.id.Answer43);
        answer44 = (RadioButton) findViewById(R.id.Answer44);
        endStatement = (TextView) findViewById(R.id.EndStatement);
        result = (Button) findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result();
            }
        });
    }

    public void result() {
        score = 0;
        checkQuestion1();
        checkQuestion2();
        checkQuestion3();
        checkQuestion4();
        NotificationStatement();
    }

    public void checkQuestion1() {
        if ((String.valueOf(answer1.getText()).toUpperCase()).equals("RADIAL")) {
            score++;
            answer1.setHintTextColor(Color.GREEN);
        } else {
            answer1.setTextColor(Color.RED);
            answer1.setHintTextColor(Color.RED);
        }
        if ((String.valueOf(answer2.getText()).toUpperCase()).equals("CHARAKTERYSTYKA KARDIOIDALNA")) {
            score++;
            answer2.setTextColor(Color.GREEN);
        } else {
            answer2.setTextColor(Color.RED);
            answer2.setHintTextColor(Color.RED);
        }
        if ((String.valueOf(answer3.getText()).toUpperCase()).equals("MODULACJA AMPLITUDOWA")) {
            score++;
            answer3.setTextColor(Color.GREEN);
        } else {
            answer3.setTextColor(Color.RED);
            answer3.setHintTextColor(Color.RED);
        }
        if ((String.valueOf(answer4.getText()).toUpperCase()).equals("RÓŻNICA FAZ")) {
            score++;
            answer4.setTextColor(Color.GREEN);
        } else {
            answer4.setTextColor(Color.RED);
            answer4.setHintTextColor(Color.RED);
        }
        if ((String.valueOf(answer5.getText()).toUpperCase()).equals("IDENTYFIKATOR RADIOLATARNI")) {
            score++;
            answer5.setTextColor(Color.GREEN);
        } else {
            answer5.setTextColor(Color.RED);
            answer5.setHintTextColor(Color.RED);
        }
        if ((String.valueOf(answer6.getText()).toUpperCase()).equals("BUSOLA GIROINDUKCYJNA")) {
            score++;
            answer6.setTextColor(Color.GREEN);
        } else {
            answer6.setTextColor(Color.RED);
            answer6.setHintTextColor(Color.RED);
        }
        if ((String.valueOf(answer7.getText()).toUpperCase()).equals("ZAKŁÓCENIA SYGNAŁU")) {
            score++;
            answer7.setTextColor(Color.GREEN);
        } else {
            answer7.setTextColor(Color.RED);
            answer7.setHintTextColor(Color.RED);
        }
    }

    public void checkQuestion2() {
        if (answer21.isChecked()) {
            answer21.setTextColor(Color.RED);
        }
        if (answer22.isChecked()) {
            answer22.setTextColor(Color.RED);
        }
        if (answer23.isChecked()) {
            score++;
            answer23.setTextColor(Color.GREEN);
        }
        if (answer24.isChecked()) {
            answer24.setTextColor(Color.RED);
        }

    }

    public void checkQuestion3() {
        text31.setTextColor(Color.BLACK);
        text32.setTextColor(Color.BLACK);
        text33.setTextColor(Color.BLACK);
        text34.setTextColor(Color.BLACK);
        text35.setTextColor(Color.BLACK);
        if (answer31.isChecked() && !(answer32.isChecked()) && answer33.isChecked() && !(answer34.isChecked()) && !(answer35.isChecked())) {
            score = score + 4;
            text31.setTextColor(Color.GREEN);
            text33.setTextColor(Color.GREEN);
        } else if ((answer31.isChecked() && answer33.isChecked()) || answer31.isChecked() || answer33.isChecked()) {
            if ((answer31.isChecked() && !(answer33.isChecked())) || (!(answer31.isChecked()) && answer33.isChecked()) || (answer31.isChecked() && answer33.isChecked())) {
                if (answer31.isChecked()) {
                    text31.setTextColor(Color.GREEN);
                    score = score + 2;
                }
                if (answer33.isChecked()) {
                    text33.setTextColor(Color.GREEN);
                    score = score + 2;
                }
                score = score - 1;
                if (answer32.isChecked()) {
                    score = score - 1;
                    text32.setTextColor(Color.RED);
                }
                if (answer34.isChecked()) {
                    score = score - 1;
                    text34.setTextColor(Color.RED);
                }
                if (answer35.isChecked()) {
                    score = score - 1;
                    text35.setTextColor(Color.RED);
                }
            } else {
                if (answer32.isChecked()) {
                    text32.setTextColor(Color.RED);
                }
                if (answer34.isChecked()) {
                    text34.setTextColor(Color.RED);
                }
                if (answer35.isChecked()) {
                    text35.setTextColor(Color.RED);
                }
            }

        }
    }
    public void checkQuestion4(){
        if (answer41.isChecked()) {
            answer41.setTextColor(Color.RED);
        }
        if (answer42.isChecked()) {
            answer42.setTextColor(Color.GREEN);
            score++;
        }
        if (answer43.isChecked()) {
            answer43.setTextColor(Color.RED);
        }
        if (answer44.isChecked()) {
            answer44.setTextColor(Color.RED);
        }
    }
    public void NotificationStatement(){
        bestScore=13;
        percentageResult = (score*100)/bestScore;
        content = "Uzyskałeś " +percentageResult  + "  \u0025!";
        if (percentageResult<30){
            content = content + "\nStać Cię na coś lepszego! Przejrzyj podpowiedzi i przeczytaj dokładnie tekst";
            endStatement.setText(content);
        }
        else if (percentageResult<55){
            content=content+"\nJest coraz lepiej. Przeczytaj tekst uważnie jeszcze raz i zrób test ponownie.";
            endStatement.setText(content);
        }
        else if(percentageResult<75){
            content=content+"\n Praktyka czyni mistrza. Zobacz popełnione błędy i popracuj nad nimi. Powodzenia!";
            endStatement.setText(content);
        }
        else if(percentageResult<100){
            content=content+"\nWow! Jesteś niesamowity :3 Bardzo ładnie";
            endStatement.setText(content);
        }
        else {
            content = content + "Niepowstrzymany! Czy te pytania były za łatwe? :D";
            endStatement.setText(content);
        }
    }
}
