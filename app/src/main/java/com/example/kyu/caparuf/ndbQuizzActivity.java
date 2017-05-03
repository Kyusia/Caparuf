package com.example.kyu.caparuf;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class ndbQuizzActivity extends AppCompatActivity {
    Spinner ans1, ans2, ans3, ans4;
    EditText ans11, ans12, ans13, ans14;
    TextView text31, text32, text33, text34, text35, endStatement;
    int score, percentageResult, bestScore;
    String  content;
    Button result;
    RadioButton ans21, ans22, ans23, ans41, ans42, ans43, ans44;
    CheckBox ans31, ans32, ans33, ans34, ans35;
    RadioGroup radioGroup, radioGroup2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ndb_quizz);


        ans1 = (Spinner) findViewById(R.id.def1);
        ans2 = (Spinner) findViewById(R.id.def2);
        ans3 = (Spinner) findViewById(R.id.def3);
        ans4 = (Spinner) findViewById(R.id.def4);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.definitions, android.R.layout.simple_spinner_item);
        ans1.setAdapter(adapter);
        ans2.setAdapter(adapter);
        ans3.setAdapter(adapter);
        ans4.setAdapter(adapter);
        ans11 = (EditText) findViewById(R.id.Answer11);
        ans12 = (EditText) findViewById(R.id.Answer12);
        ans13 = (EditText) findViewById(R.id.Answer13);
        ans14 = (EditText) findViewById(R.id.Answer14);
        ans21 = (RadioButton) findViewById(R.id.Answerr21);
        ans22 = (RadioButton) findViewById(R.id.Answerr22);
        ans23 = (RadioButton) findViewById(R.id.Answerr23);
        radioGroup = (RadioGroup) findViewById(R.id.radio);
        radioGroup2 = (RadioGroup) findViewById(R.id.radio2);
        text31 = (TextView) findViewById(R.id.Text31);
        text32 = (TextView) findViewById(R.id.Text32);
        text33 = (TextView) findViewById(R.id.Text33);
        text34 = (TextView) findViewById(R.id.Text34);
        text35 = (TextView) findViewById(R.id.Text35);
        ans31 = (CheckBox) findViewById(R.id.Answer31);
        ans32 = (CheckBox) findViewById(R.id.Answer32);
        ans33 = (CheckBox) findViewById(R.id.Answer33);
        ans34 = (CheckBox) findViewById(R.id.Answer34);
        ans35 = (CheckBox) findViewById(R.id.Answer35);
        ans41 = (RadioButton) findViewById(R.id.Answer41);
        ans42 = (RadioButton) findViewById(R.id.Answer42);
        ans43 = (RadioButton) findViewById(R.id.Answer43);
        ans44 = (RadioButton) findViewById(R.id.Answer44);
        endStatement = (TextView) findViewById(R.id.EndStatement);
        result = (Button) findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result();
            }
        });
    }



    public void result(){
        score = 0;
        checkQuestion1();
        checkQuestion2();
        checkQuestion3();
        checkQuestion4();
        submitStatement();
    }
    public void checkQuestion1(){
if ((ans1.getSelectedItem().toString()).equals("Kąt między Ox SP a kierunkiem do NDB") && (ans11.getText().toString().toUpperCase()).equals("KĄT KURSOWY RADIOLATARNI")){score=score+2;}
        else if ((ans1.getSelectedItem().toString()).equals("Kąt między Ox SP a kierunkiem do NDB") || (ans11.getText().toString().toUpperCase()).equals("KĄT KURSOWY RADIOLATARNI")){
            score++;
            if (!((ans1.getSelectedItem().toString()).equals("Kąt między Ox SP a kierunkiem do NDB"))){
                ans1.setBackgroundColor(Color.RED);
                ans11.setTextColor(Color.GREEN);
            }
            else {
                ans11.setHint("Kąt...");
                ans11.setHintTextColor(Color.RED);
                ans1.setBackgroundColor(Color.GREEN);
            }
        }
        else{
            ans1.setBackgroundColor(Color.RED);
            ans11.setHint("Kąt...");
            ans11.setHintTextColor(Color.RED);
        }
        if ((ans2.getSelectedItem().toString()).equals("Pokładowy automatyczny radiokompas") && (ans12.getText().toString().toUpperCase()).equals("AUTOMATIC DIRECTION FINDER")){score=score+2;}
        else if ((ans2.getSelectedItem().toString()).equals("Pokładowy automatyczny radiokompas") || (ans12.getText().toString().toUpperCase()).equals("AUTOMATIC DIRECTION FINDER")){
            score++;
            if (!((ans2.getSelectedItem().toString()).equals("Pokładowy automatyczny radiokompas"))){
                ans2.setBackgroundColor(Color.RED);
                ans12.setTextColor(Color.GREEN);
            }
            else {
                ans12.setHint("Automatic...");
                ans12.setHintTextColor(Color.RED);
                ans2.setBackgroundColor(Color.GREEN);
            }
        }
        else{
            ans2.setBackgroundColor(Color.RED);
            ans12.setHint("Automatic...");
            ans12.setHintTextColor(Color.RED);
        }
        if ((ans3.getSelectedItem().toString()).equals("Radiolatarnia bezkierunkowa") && (ans13.getText().toString().toUpperCase()).equals("NON-DIRECTIONAL BEACON")){score=score+2;}
        else if ((ans3.getSelectedItem().toString()).equals("Radiolatarnia bezkierunkowa") || (ans13.getText().toString().toUpperCase()).equals("NON-DIRECTIONAL BEACON")){
            score++;
            if (!((ans3.getSelectedItem().toString()).equals("Radiolatarnia bezkierunkowa"))){
                ans3.setBackgroundColor(Color.RED);
                ans13.setTextColor(Color.GREEN);
            }
            else {
                ans13.setHint("Non-...");
                ans13.setHintTextColor(Color.RED);
                ans3.setBackgroundColor(Color.GREEN);
            }
        }
        else{
            ans3.setBackgroundColor(Color.RED);
            ans13.setHint("Non-...");
            ans13.setHintTextColor(Color.RED);
        }
        if ((ans4.getSelectedItem().toString()).equals("System lądowania wg wskazań przyrządów") && (ans14.getText().toString().toUpperCase()).equals("INSTRUMENT FLIGHT RULES")){score=score+2;}
        else if ((ans4.getSelectedItem().toString()).equals("System lądowania wg wskazań przyrządów") || (ans14.getText().toString().toUpperCase()).equals("INSTRUMENT FLIGHT RULES")){
            score++;
            if (!((ans4.getSelectedItem().toString()).equals("System lądowania wg wskazań przyrządów"))){
                ans4.setBackgroundColor(Color.RED);
                ans14.setTextColor(Color.GREEN);
            }
            else {
                ans14.setHint("Instrument...");
                ans14.setHintTextColor(Color.RED);
                ans4.setBackgroundColor(Color.GREEN);
            }
        }
        else{
            ans4.setBackgroundColor(Color.RED);
            ans14.setHint("Instrument...");
            ans14.setHintTextColor(Color.RED);
        }
    }
    public void checkQuestion2(){
        if (ans21.isChecked()) {
            ans21.setTextColor(Color.RED);
        }
        if (ans23.isChecked()) {
            score++;
            ans23.setTextColor(Color.GREEN);
        }
        if (ans22.isChecked()) {
            ans23.setTextColor(Color.RED);
        }

    }

    public void checkQuestion3() {
        text31.setTextColor(Color.BLACK);
        text32.setTextColor(Color.BLACK);
        text33.setTextColor(Color.BLACK);
        text34.setTextColor(Color.BLACK);
        text35.setTextColor(Color.BLACK);
        if (ans32.isChecked() && ans31.isChecked() && (!(ans34.isChecked()) && !(ans35.isChecked()) && !(ans33.isChecked()))) {
            score = score + 6;
            text31.setTextColor(Color.GREEN);
            text32.setTextColor(Color.GREEN);
        }
        }


    public void checkQuestion4(){
        if (ans41.isChecked()) {
            ans41.setTextColor(Color.RED);
        }
        if (ans42.isChecked()) {
            ans42.setTextColor(Color.RED);
        }
        if (ans43.isChecked()) {
            score++;
            ans43.setTextColor(Color.GREEN);
        }
        if (ans44.isChecked()) {
            ans44.setTextColor(Color.RED);
        }
    }
    public void submitStatement(){     bestScore=16;
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
    }}